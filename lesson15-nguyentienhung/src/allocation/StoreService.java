package allocation;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

		// Kết quả
		// storeAllocatedAmouts.entrySet().stream().forEach(System.out::println);
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
				new Store(11L, null, bd(22), null, Boolean.FALSE));
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
		List<Store> data1 = data.stream().filter(s -> s.getSelected()).collect(Collectors.toList());
		List<Store> data2 = new ArrayList<>();
		List<Store> data3 = data.stream().filter(s -> s.getSelected()).collect(Collectors.toList());
		for (int i = 0; i < data1.size(); i++) {
			if (data1.get(i).getExpectedSales() != null) {
				data2.add(data1.get(i));
			} else if (data1.get(i).getReferenceStoreId() != null) {
				float sum=0f;
				
				Long check=data1.get(i).getReferenceStoreId();
				List<Store> temp = data1.stream().filter(s -> s.getStoreId().equals(check))
						.collect(Collectors.toList());
				System.out.println(temp.get(0).getExpectedSales());
				if(temp.get(0).getExpectedSales()==null) {
					int count=0;
					for(int j=0;j<data1.size();j++) {
						if(data1.get(j).getExpectedSales()!=null) {
							sum+=data1.get(j).getExpectedSales().floatValue();
							++count;
						}
					}
					sum/=count;
				}
				if(temp.get(0).getExpectedSales()==null) {
					data3.get(i).setExpectedSales(BigDecimal.valueOf(sum));
				}
				else {
					data3.get(i).setExpectedSales(temp.get(0).getExpectedSales());
				}
				
				data2.add(data1.get(i));
			}
		}
	
		long sum1=0;
		for(Store i : data2) {
			sum1+=i.getExpectedSales().longValue();
		}
		
      List<Float>  allocationkey =new ArrayList<Float>();
      for(Store i : data2) {
    	  allocationkey.add(i.getExpectedSales().floatValue()/sum1);
      }
      for(float i : allocationkey) {
   	  System.out.println(i);
      }
     

		return null;
	}

}