package allocation;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

		// Thực hiện tính toán
		Map<Long, Integer> storeAllocatedAmouts = doAllocation(whAllocationAmount, data);

		System.out.println("khoa");
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
//	private static <E> Map<Long, ?> convert(List<E> list) {
//
//	}

	private static Map<Long, Integer> doAllocation(Integer whAllocationAmount, List<Store> data) {
		if (data.stream().filter(t -> t.getExpectedSales() == null).count() == data.size())
			return null;
		List<Store> newdata = data.stream().filter(t -> t.getSelected() == true).collect(Collectors.toList());
		List<Store> Step1 = StepOne(newdata);
		Map<Long, BigDecimal> Step2 = StepTwo(Step1);
		return null;
	}

	private static Map<Long, BigDecimal> StepTwo(List<Store> data) {
		BigDecimal s = BigDecimal.valueOf(0L);
		for (Store item : data) {
			s = s.add(item.getExpectedSales());
		}
		Map<Long, BigDecimal> map = new HashMap<>();
		for (Store item : data) {
			
			map.put(item.getStoreId(), item.getExpectedSales().divide(s,10,RoundingMode.HALF_UP));
		}
		return map;
	}

	private static List<Store> StepOne(List<Store> datat) {
		List<Store> list1 = datat.stream().filter(t -> t.getExpectedSales() == null).collect(Collectors.toList());
		List<Store> list2 = datat.stream().filter(t -> t.getExpectedSales() != null).collect(Collectors.toList());
		for (Store item : list1) {
			Store referen = datat.stream().filter(t -> t.getStoreId().equals(item.getReferenceStoreId()))
					.collect(Collectors.toList()).get(0);
			BigDecimal s = BigDecimal.valueOf(0L);

			if (referen.getExpectedSales() == null) {
				for (Store i : list2) {
					s = s.add(i.getExpectedSales());
				}
				int count = list2.size();
				for (Store itemm : datat) {
					if (itemm.getStoreId().equals(item.getStoreId())) {
						itemm.setExpectedSales(s.divide(BigDecimal.valueOf(count)));
					}
				}
			}
		}
		List<Store> list3 = datat.stream().filter(t -> t.getExpectedSales() == null).collect(Collectors.toList());
		for (Store item : list3) {
			Store referen = datat.stream().filter(t -> t.getStoreId().equals(item.getReferenceStoreId()))
					.collect(Collectors.toList()).get(0);
			if (referen.getExpectedSales() != null) {
				for (Store itemm : datat) {
					if (itemm.getStoreId().equals(item.getStoreId())) {
						itemm.setExpectedSales(referen.getExpectedSales());
					}
				}
			}
		}

		return datat;
	}

	
}