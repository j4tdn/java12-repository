package allocation;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class StoreService {

	/**
	 * Toán tử: + - * / BigDecimal a = BigDecimal.valueOf(10); BigDecimal b =
	 * BigDecimal.valueOf(20); BigDecimal result = a.multiply(b); BigDecimal result
	 * = a.divide(b); BigDecimal result = a.add(b); BigDecimal result =
	 * a.subtract(b);
	 * 
	 * Làm tròn số BigDecimal a = BigDecimal.valueOf(15.23657123648); a =
	 * a.setScale(4, RoundingMode.HALF_UP); Kết quả: a = 15.2366
	 */

	public static void main(String[] args) {
		// Dữ liệu vào
		final Integer whAllocationAmount = 300;
		final List<Store> data = getStores();
		
		System.out.println(" ======== Step 1 =======");
		List<Store> datas = checkSelected(data);
		Map<Long, BigDecimal> step1 = calExp(datas);
		
		System.out.println(" ======== Step 2 =======");
		Map<Long, BigDecimal> step2 = AllocationKey(step1);
		// Thực hiện tính toán
		Map<Long, Integer> storeAllocatedAmouts = doAllocation(whAllocationAmount, data);

		// Kết quả
		// storeAllocatedAmouts.entrySet().stream().forEach(System.out::println);
	}

	private static List<Store> getStores() {
		// Store(storeId, referenceStoreId, stockPreviousDay, expectedSales, isSelected)
		return Arrays.asList(new Store(1L, null, bd(18), bd(40), Boolean.TRUE),
				new Store(2L, null, bd(19), bd(20), Boolean.TRUE), new Store(3L, null, bd(21), bd(17), Boolean.TRUE),
				new Store(4L, null, bd(14), bd(31), Boolean.TRUE), new Store(5L, null, bd(14), bd(10), Boolean.TRUE),
				new Store(6L, null, bd(15), bd(30), Boolean.TRUE), new Store(7L, 2L, bd(15), null, Boolean.TRUE),
				new Store(8L, null, bd(12), bd(19), Boolean.TRUE), new Store(9L, null, bd(17), bd(26), Boolean.TRUE),
				new Store(10L, 7L, bd(18), null, Boolean.TRUE), new Store(11L, null, bd(22), null, Boolean.FALSE));
	}

	private static BigDecimal bd(long value) {
		return BigDecimal.valueOf(value);
	}

	/**
	 * Do Allocation.
	 * 
	 * Key: storeId with Long type Value: storeAllocatedAmount after calculation
	 * with 4 steps
	 * 
	 * @return map of storeId, storeAllocatedAmount
	 */
	private static Map<Long, Integer> doAllocation(Integer whAllocationAmount, List<Store> data) {
		// TODO implement your code here and/or other functions
		return null;
	}

	private static List<Store> checkSelected(List<Store> stores) {
		return stores.stream().filter(store -> store.getSelected() == Boolean.TRUE).collect(Collectors.toList());
	}

	private static Map<Long, BigDecimal> calExp(List<Store> stores) {
		Map<Long, BigDecimal> result = new TreeMap<>();
		
		boolean check = stores.stream().allMatch(a -> a.getExpectedSales() == null);
		if (check) {
			System.out.println("\"Expected sales cannot be calculated. Please add a\r\n"
					+ "reference store or include stores with expected sales for interpolation\"");
		} else {

			BigDecimal count = bd(0);
			BigDecimal sumExp = bd(0);
			for (Store str : stores) {
				if (str.getExpectedSales() != null) {
					sumExp = sumExp.add(str.getExpectedSales());
					count = count.add(new BigDecimal(1));
				}

			}

			System.out.println(sumExp);
			System.out.println(count);
			for (Store str : stores) {
				if (str.getExpectedSales() == null) {
					Store stN = stores.stream().filter(st -> st.getStoreId() == str.getReferenceStoreId())
								.collect(Collectors.toList()).get(0);
					if (stN.getOldExp() != null) {
							str.setExpectedSales(stN.getExpectedSales());
					} else {
						str.setExpectedSales(sumExp.divide(count).setScale(1, RoundingMode.HALF_UP));
					}
				}
				result.put(str.getStoreId(), str.getExpectedSales());
			}
		}
		printf(result);
		return result;

	}
	
	private static Map<Long, BigDecimal>  AllocationKey(Map<Long, BigDecimal> stores){
		Map<Long, BigDecimal> result = new TreeMap<>();
		
		Set<Entry<Long, BigDecimal>> entrySet = stores.entrySet();
		BigDecimal sumExp = bd(0);
		for (Entry<Long, BigDecimal> entry: entrySet) {
			sumExp = sumExp.add(entry.getValue());
		}
		
		System.out.println(sumExp);
		
		for (Entry<Long, BigDecimal> entry: entrySet) {	
			BigDecimal a = entry.getValue();
			a = a.divide(sumExp, 10, RoundingMode.HALF_UP);
			entry.setValue(a);
			result.put(entry.getKey(), entry.getValue());
		}
		printf(result);
		return result;
	}

	private static void printf(Map<Long, BigDecimal> stores) {
		Set<Entry<Long, BigDecimal>> entrySet = stores.entrySet();
		
		
		for (Entry<Long, BigDecimal> entry: entrySet) {
			System.out.println(entry);
		}
	}

}