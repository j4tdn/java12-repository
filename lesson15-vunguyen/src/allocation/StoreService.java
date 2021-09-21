package allocation;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.stream.Collectors;

public class StoreService {

    /**
     * Toán tử: + - * /
     * BigDecimal a = BigDecimal.valueOf(10);
     * BigDecimal b = BigDecimal.valueOf(20);
     * BigDecimal result = a.multiply(b);
     * BigDecimal result = a.divide(b);
     * BigDecimal result = a.add(b);
     * BigDecimal result = a.subtract(b);
     * <p>
     * Làm tròn số
     * BigDecimal a = BigDecimal.valueOf(15.23657123648);
     * a = a.setScale(4, RoundingMode.HALF_UP);
     * Kết quả: a = 15.2366
     */

    public static void main(String[] args) {
        // Dữ liệu vào
        final Integer whAllocationAmount = 300;
        final List<Store> data = getStores();

        // Thực hiện tính toán
        Map<Long, Integer> storeAllocatedAmouts = doAllocation(whAllocationAmount, data);

        // Kết quả
        storeAllocatedAmouts.entrySet().stream().forEach(System.out::println);
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
    private static Map<Long, Integer> doAllocation(Integer whAllocationAmount, List<Store> data) {
        // Step one
        List<Store> selectedStores = data.stream().filter(Store::getSelected).collect(Collectors.toList());
        List<BigDecimal> ownExpectedSales = selectedStores.stream().map(Store::getExpectedSales)
                                                          .filter(Objects::nonNull).collect(Collectors.toList());
        BigDecimal average = averageBD(ownExpectedSales, 1);

        selectedStores.stream().filter(store -> store.getExpectedSales() == null).forEach(store -> {
            Long refStoreId = store.getReferenceStoreId();
            Store refStore = selectedStores.stream().filter(s -> s.getStoreId() == refStoreId)
                                           .findFirst().orElse(null);
            if (refStoreId != null) {
                BigDecimal expectedSales = refStore.getExpectedSales();
                store.setFinalExpectedSales(expectedSales);
            }
            if (refStoreId == null || refStore.getExpectedSales() == null) {
                store.setFinalExpectedSales(average);
            }
        });

        for (Store selectedStore : selectedStores) {
            if (selectedStore.getExpectedSales() == null) {
                selectedStore.setExpectedSales(selectedStore.getFinalExpectedSales());
            }
        }
        selectedStores.forEach(System.out::println);

        // Step two
        List<BigDecimal> allocationKey = new ArrayList<>();
        List<BigDecimal> expectedSales = selectedStores.stream().map(Store::getExpectedSales).collect(Collectors.toList());
        BigDecimal sumExpectedSales = sumBD(expectedSales, 1);
        for (Store store : selectedStores) {
            BigDecimal key = store.getExpectedSales().divide(sumExpectedSales, 10, RoundingMode.HALF_UP);
            allocationKey.add(key);
        }


        // Step three
        List<Integer> amountAllocated = new ArrayList<>();
        for (int i = 0; i < selectedStores.size(); i++) {
            Store selectedStore = selectedStores.get(i);
            BigDecimal key = allocationKey.get(i);
            BigDecimal result = key.multiply(bd(whAllocationAmount).add(sumExpectedSales)).subtract(selectedStore.getStorePreviousDay());
            amountAllocated.add(Integer.parseInt(result.toString()));
        }

        return null;
    }

    public static BigDecimal averageBD(List<BigDecimal> list, int scale) {
        BigDecimal result = sumBD(list, 1);
        result = result.divide(bd(list.size())).setScale(1, RoundingMode.HALF_UP);
        return result;
    }

    public static BigDecimal sumBD(List<BigDecimal> list, int scale) {
        BigDecimal result = bd(0L);
        for (int i = 0; i < list.size(); i++) {
            result = result.add(list.get(i));
        }
        return result.setScale(scale, RoundingMode.HALF_UP);
    }

}