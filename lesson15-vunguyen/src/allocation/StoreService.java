package allocation;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class StoreService {

    public static void main(String[] args) {
        final Integer whAllocationAmount = 300;
        final List<Store> selectedStores = getStores().stream()
                                                      .filter(store -> Boolean.TRUE.equals(store.getSelected()))
                                                      .collect(Collectors.toList());

        // Validation
        if (!selectedStores.isEmpty()) {
            boolean hasNonNullExpectedSales = selectedStores.stream()
                                                            .anyMatch(store -> store.getExpectedSales() != null);
            if (!hasNonNullExpectedSales) {
                System.out.println("Stop calculation");
                System.out.println("Expected sales cannot be calculated. Please add a reference store or include stores with expected sales for interpolation");
                throw new IllegalArgumentException();
            }
        }

        Map<Long, Integer> storeAllocatedAmounts = doAllocation(whAllocationAmount, selectedStores);
        storeAllocatedAmounts.entrySet().stream().forEach(System.out::println);

    }

    private static List<Store> getStores() {
        // Store(storeId, referenceStoreId, stockPreviousDay, expectedSales, isSelected)
        return Arrays.asList(
                new Store(1L, null, bd(18), bd(40), Boolean.TRUE),
                new Store(2L, null, bd(19), bd(20), Boolean.TRUE),
                new Store(3L, null, bd(21), bd(17), Boolean.TRUE),
                new Store(4L, null, bd(14), bd(31), Boolean.TRUE),
                new Store(5L, null, bd(14), bd(10), Boolean.TRUE),
                new Store(6L, null, bd(15), bd(30), Boolean.TRUE),
                new Store(7L, 2L, bd(15), null, Boolean.TRUE),
                new Store(8L, null, bd(12), bd(19), Boolean.TRUE),
                new Store(9L, null, bd(17), bd(26), Boolean.TRUE),
                new Store(10L, 7L, bd(18), null, Boolean.TRUE),
                new Store(11L, null, bd(22), null, Boolean.FALSE)
        );
    }

    private static BigDecimal bd(long value) {
        return BigDecimal.valueOf(value);
    }

    /**
     * Do Allocation.
     * <p>
     * Key: storeId with Long type
     * Value: storeAllocatedAmount after calculation with 4 steps
     *
     * @return map of storeId, storeAllocatedAmount
     */
    private static Map<Long, Integer> doAllocation(Integer whAllocationAmount, List<Store> stores) {

        // Step 1: Filling in missing expected sales
        Map<Long, BigDecimal> interpolatedExpectedSalesMap = fillMissingExpectedSales(stores);

        // Step 2: Calculate Allocation Key
        StoreParamDto<BigDecimal> interpolatedExpectedSales = new StoreParamDto<>(interpolatedExpectedSalesMap, BigDecimal.ZERO, BigDecimal::add);

        Map<Long, BigDecimal> allocationKeyMap = calculateAllocationKey(interpolatedExpectedSales);

        // Step 3: Calculate Allocated Amount
        Map<Long, BigDecimal> stockPreviousDayMap = stores.stream()
                                                          .collect(Collectors.toMap(Store::getStoreId, Store::getStockPreviousDay));

        StoreParamDto<BigDecimal> stockPreviousDay = new StoreParamDto<>(stockPreviousDayMap, BigDecimal.ZERO, BigDecimal::add);

        Map<Long, Integer> allocatedAmountMap = calculateAllocatedAmount(allocationKeyMap, whAllocationAmount, stockPreviousDay);

        // Step 4: Fix rounding issue
        Map<Long, Integer> fixedAllocatedAmountMap = fixRoundingIssue(whAllocationAmount, interpolatedExpectedSalesMap, stockPreviousDayMap, allocatedAmountMap);

        return fixedAllocatedAmountMap;
    }

    /**
     * Fill missing expected sales
     *
     * @param stores selected stores
     * @return a Map whose key and value are StoreId and interpolated expected sales
     */
    private static Map<Long, BigDecimal> fillMissingExpectedSales(List<Store> stores) {
        Map<Long, BigDecimal> interpolatedExpectedSalesMap = new HashMap<>();

        List<Store> ownStores = stores.stream()
                                      .filter(store -> store.getExpectedSales() != null)
                                      .collect(Collectors.toList());

        List<BigDecimal> ownExpectedSales = ownStores.stream()
                                                     .map(Store::getExpectedSales)
                                                     .collect(Collectors.toList());

        BigDecimal avgExpectedSales = calculateAvgOwnExpectedSales(ownExpectedSales);

        Map<Long, BigDecimal> ownExpectedSalesMap = ownStores.stream()
                                                             .collect(Collectors.toMap(Store::getStoreId, Store::getExpectedSales));

        for (Store store : stores) {
            BigDecimal expectedSales = store.getExpectedSales();
            BigDecimal interpolatedExpectedSales = null;
            if (expectedSales != null) {
                interpolatedExpectedSales = expectedSales;
            } else {
                // missing expected sales
                Long referenceStoreId = store.getReferenceStoreId();
                BigDecimal refStoreExpectedSales = ownExpectedSalesMap.get(referenceStoreId);
                if (referenceStoreId != null && refStoreExpectedSales != null) {
                    interpolatedExpectedSales = refStoreExpectedSales;
                } else {
                    // average
                    interpolatedExpectedSales = avgExpectedSales;
                }
            }
            interpolatedExpectedSalesMap.put(store.getStoreId(), interpolatedExpectedSales);
        }
        return interpolatedExpectedSalesMap;
    }

    /**
     * Calculate allocation key
     *
     * @param interpolatedSales A StoreParamDto whose fields consist of a Map of storeId and interpolated expected sales
     *                          and sum of Map values
     * @return a Map whose key and value are storeId and allocation key
     */
    private static Map<Long, BigDecimal> calculateAllocationKey(StoreParamDto<BigDecimal> interpolatedSales) {

        BigDecimal sum = interpolatedSales.getSum();

        return interpolatedSales.getStoreParams()
                                .stream()
                                .collect(Collectors.toMap(Entry::getKey, e -> e.getValue()
                                                                               .divide(sum, 10, RoundingMode.HALF_UP)));
    }

    /**
     * Calculate allocated amount
     *
     * @param allocationKeyMap   a Map of storeId and allocation key
     * @param whAllocationAmount warehouse allocation amount
     * @param stockPreviousDay   stock previous day
     * @return a Map whose key and value are storeId and allocated amount
     */
    private static Map<Long, Integer> calculateAllocatedAmount(Map<Long, BigDecimal> allocationKeyMap,
                                                               Integer whAllocationAmount,
                                                               StoreParamDto<BigDecimal> stockPreviousDay) {

        return allocationKeyMap.entrySet().stream().collect(Collectors.toMap(Entry::getKey, e -> {
            BigDecimal allocationKey = e.getValue();
            BigDecimal sumStockPreviousDay = stockPreviousDay.getSum();
            BigDecimal stockPreviousPerDay = stockPreviousDay.getStoreParam(e.getKey());
            return Math.max(allocationKey.multiply(bd(whAllocationAmount).add(sumStockPreviousDay))
                                         .subtract(stockPreviousPerDay)
                                         .setScale(0, RoundingMode.HALF_UP)
                                         .intValueExact(), 0);
        }));

    }

    /**
     * Fix rounding issue
     *
     * @param whAllocationAmount           warehouse allocation amount
     * @param interpolatedExpectedSalesMap a Map of storeId and interpolated expected sale
     * @param stockPreviousDayMap          a Map of storeId and stock previous day
     * @param allocatedAmountMap           a Map of storeId and allocated amount
     * @return a Map whose key and value are storeId and fixed allocated amount
     */
    private static Map<Long, Integer> fixRoundingIssue(Integer whAllocationAmount,
                                                       Map<Long, BigDecimal> interpolatedExpectedSalesMap,
                                                       Map<Long, BigDecimal> stockPreviousDayMap,
                                                       Map<Long, Integer> allocatedAmountMap) {

        // shallow-copy of allocatedAmountMap
        // Map<Long, Integer> fixedAllocatedAmountMap = new HashMap<>(allocatedAmountMap);

        // use deep-copy of allocated
        Map<Long, Integer> fixedAllocatedAmountMap = allocatedAmountMap.entrySet()
                                                                       .stream()
                                                                       .collect(Collectors.toMap(Entry::getKey, entry -> new Integer(entry.getValue())));


        StoreParamDto<Integer> allocatedAmount = new StoreParamDto<>(allocatedAmountMap, 0, Integer::sum);
        Integer sumAllocatedAmount = allocatedAmount.getSum();

        if (!sumAllocatedAmount.equals(whAllocationAmount)) {
            Map<Long, Integer> demandMap = calculateDemand(interpolatedExpectedSalesMap, stockPreviousDayMap);

            if (sumAllocatedAmount.compareTo(whAllocationAmount) > 0) {
                while (!sumAllocatedAmount.equals(whAllocationAmount)) {
                    fixRoundingBiggest(demandMap, fixedAllocatedAmountMap, interpolatedExpectedSalesMap);
                    sumAllocatedAmount--;
                }
            } else {
                while (!sumAllocatedAmount.equals(whAllocationAmount)) {
                    fixRoundingSmallest(demandMap, fixedAllocatedAmountMap, interpolatedExpectedSalesMap);
                    sumAllocatedAmount++;
                }

            }
        }

        return fixedAllocatedAmountMap;
    }


    //////////////////////////////////////////////////////////////////////////////
    private static void fixRoundingBiggest(Map<Long, Integer> demandMap,
                                           Map<Long, Integer> fixedAllocatedAmountMap,
                                           Map<Long, BigDecimal> interpolatedExpectedSalesMap) {

        Entry<Long, Integer> biggestDiffAmountEntry = Map.entry(0L, Integer.MIN_VALUE);

        for (Entry<Long, Integer> fixedAllocatedAmountEntry : fixedAllocatedAmountMap.entrySet()) {
            if (fixedAllocatedAmountEntry.getValue() == 0) continue;
            int diffAmount = fixedAllocatedAmountEntry.getValue() - demandMap.get(fixedAllocatedAmountEntry.getKey());

            if (diffAmount > biggestDiffAmountEntry.getValue()) {
                biggestDiffAmountEntry = fixedAllocatedAmountEntry;
                continue;
            }

            // if two store have the same diffAmount, take one with smaller demand
            if (diffAmount == biggestDiffAmountEntry.getValue()) {
                int diffDemand = demandMap.get(fixedAllocatedAmountEntry.getKey())
                                          .compareTo(demandMap.get(biggestDiffAmountEntry.getKey()));
                if (diffDemand < 0) {
                    biggestDiffAmountEntry = fixedAllocatedAmountEntry;
                    continue;
                }

                // if two store have same the demand, take one with smaller interpolated expected sale
                if (diffDemand == 0) {
                    int diffExpectedSales = interpolatedExpectedSalesMap.get(fixedAllocatedAmountEntry.getKey())
                                                                        .compareTo(interpolatedExpectedSalesMap.get(biggestDiffAmountEntry.getKey()));

                    if (diffExpectedSales < 0) {
                        biggestDiffAmountEntry = fixedAllocatedAmountEntry;
                        continue;
                    }

                    // if two store have the same interpolated expected sale, take one with smaller storeId
                    if (diffExpectedSales == 0 && fixedAllocatedAmountEntry.getKey().compareTo(biggestDiffAmountEntry.getKey()) < 0) {
                        biggestDiffAmountEntry = fixedAllocatedAmountEntry;
                    }
                }
            }
        }

        fixedAllocatedAmountMap.put(biggestDiffAmountEntry.getKey(), biggestDiffAmountEntry.getValue());
    }

    private static void fixRoundingSmallest(Map<Long, Integer> demandMap,
                                            Map<Long, Integer> fixedAllocatedAmountMap,
                                            Map<Long, BigDecimal> interpolatedExpectedSalesMap) {

        Entry<Long, Integer> smallestDiffAmountEntry = Map.entry(0L, Integer.MAX_VALUE);

        for (Entry<Long, Integer> fixedAllocatedAmountEntry : fixedAllocatedAmountMap.entrySet()) {
            int diffAmount = fixedAllocatedAmountEntry.getValue() - demandMap.get(fixedAllocatedAmountEntry.getKey());

            if (diffAmount < smallestDiffAmountEntry.getValue()) {
                smallestDiffAmountEntry = fixedAllocatedAmountEntry;
                continue;
            }

            // if two stores have the same diffAmount, take one with bigger demand
            if (diffAmount == smallestDiffAmountEntry.getValue()) {
                int diffDemand = demandMap.get(fixedAllocatedAmountEntry.getKey())
                                          .compareTo(demandMap.get(smallestDiffAmountEntry.getKey()));
                if (diffDemand > 0) {
                    smallestDiffAmountEntry = fixedAllocatedAmountEntry;
                    continue;
                }

                // if two store have same the demand, take one with bigger interpolated expected sale
                if (diffDemand == 0) {
                    int diffExpectedSales = interpolatedExpectedSalesMap.get(fixedAllocatedAmountEntry.getKey())
                                                                        .compareTo(interpolatedExpectedSalesMap.get(smallestDiffAmountEntry.getKey()));

                    if (diffExpectedSales > 0) {
                        smallestDiffAmountEntry = fixedAllocatedAmountEntry;
                        continue;
                    }

                    // if two store have the same interpolated expected sale, take one with smaller storeId
                    if (diffExpectedSales == 0 && fixedAllocatedAmountEntry.getKey().compareTo(smallestDiffAmountEntry.getKey()) < 0) {
                        smallestDiffAmountEntry = fixedAllocatedAmountEntry;
                    }
                }
            }
        }
    }

    private static Map<Long, Integer> calculateDemand(Map<Long, BigDecimal> interpolatedExpectedSalesMap,
                                                      Map<Long, BigDecimal> stockPreviousDayMap) {
        Map<Long, Integer> demandMap = new HashMap<>();
        return interpolatedExpectedSalesMap.entrySet()
                                           .stream()
                                           .collect(Collectors.toMap(Entry::getKey, entry -> Math.max(entry.getValue()
                                                                                                           .subtract(stockPreviousDayMap.get(entry.getKey()))
                                                                                                           .setScale(0, RoundingMode.HALF_UP)
                                                                                                           .intValueExact(), 0)));
    }

    private static BigDecimal calculateAvgOwnExpectedSales(List<BigDecimal> ownExpectedSales) {
        BigDecimal sumExpectedSales = ownExpectedSales.stream().reduce(BigDecimal.ZERO, BigDecimal::add);
        return sumExpectedSales.divide(BigDecimal.valueOf(ownExpectedSales.size()), 1, RoundingMode.HALF_UP);
    }
}