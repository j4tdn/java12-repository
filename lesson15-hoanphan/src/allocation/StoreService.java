package allocation;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class StoreService {
	
	/**
	 * Toán tử: + - * /
	 * BigDecimal a = BigDecimal.valueOf(10); 
	 * BigDecimal b = BigDecimal.valueOf(20);
	 * BigDecimal result = a.multiply(b); 
	 * BigDecimal result = a.divide(b); 
	 * BigDecimal result = a.add(b); 
	 * BigDecimal result = a.subtract(b); 
	 * 
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
//    	storeAllocatedAmouts.entrySet().stream().forEach(System.out::println);
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
                new Store(7L, 2L  , bd(15), null  , Boolean.TRUE),
                new Store(8L, null, bd(12), bd(19), Boolean.TRUE),
                new Store(9L, null, bd(17), bd(26), Boolean.TRUE),
                new Store(10L, 7L , bd(18), null  , Boolean.TRUE),
                new Store(11L,null, bd(22), null  , Boolean.FALSE)
        );
    }

    private static BigDecimal bd(long value) {
        return BigDecimal.valueOf(value);
    }

    /**
     * Do Allocation.
     * 
     * Key: storeId with Long type
     * Value: storeAllocatedAmount after calculation with 4 steps
     * @return map of storeId, storeAllocatedAmount
     */
    private static Map<Long, Integer> doAllocation(Integer whAllocationAmount, List<Store> data) {
    	
    	//cau 1
    	List<Store> filteredData = filterStore(data);
    	List<Store> fillingExpected = fillExpected(filteredData);
    	
    	for(Store store : fillingExpected) {
    		System.out.println(store);
    	}
    	
    	//cau 2
    	BigDecimal sumOfExpectedSale = sumOfExpectedSale(fillingExpected);
    	Map<Long, BigDecimal> allocationKey = CalAllocatedKey(fillingExpected);
    	
    	for(Entry<Long, BigDecimal> result : allocationKey.entrySet()) {
    		System.out.println(result.getKey() + "  "+ result.getValue());
    	}
    	
    	//cau 3
    	Map<Long, BigDecimal> amountAllocated = CalculationAmountAllocated(fillingExpected, allocationKey, whAllocationAmount);
    	
        return null;
    }
    
   

	private static Map<Long, BigDecimal> CalculationAmountAllocated(List<Store> fillingExpected,
			Map<Long, BigDecimal> allocationKey, Integer whAllocationAmount) {
		BigDecimal sumOfStockPreviousDay = sumOfStockPreviousDay(fillingExpected);
		Map<Long, BigDecimal> result = new HashMap<Long, BigDecimal>();
		for(Store store : fillingExpected) {
			
			//
    	}
		
		return null;
	}

	private static Map<Long, BigDecimal> CalAllocatedKey(List<Store> fillingExpected) {
    	BigDecimal sumOfExpectedSale = sumOfExpectedSale(fillingExpected);
    	
    	Map<Long, BigDecimal> result = new HashMap<Long, BigDecimal>();
    	for(Store store : fillingExpected) {

    		BigDecimal allocatedKey =  store.getExpectedSales().divide(sumOfExpectedSale,10, RoundingMode.HALF_UP);
    		result.put(store.getStoreId(),allocatedKey);
    	}
		return result;
	}

	private static BigDecimal sumOfExpectedSale(List<Store> fillingExpected) {
		BigDecimal sum = bd(0);
		for(Store store : fillingExpected) {
			sum = sum.add(store.getExpectedSales()) ;
		}
		return sum;
	}
	
	private static BigDecimal sumOfStockPreviousDay(List<Store> fillingExpected) {
		BigDecimal sum = bd(0);
		for(Store store : fillingExpected) {
			sum = sum.add(store.getStorePreviousDay()) ;
		}
		return sum;
	}

	private static List<Store> fillExpected(List<Store> filteredData) {
		BigDecimal sum = bd(0);
		int count = 0;
		if(count == 0) {
			//todo
		}
				
		for(Store store : filteredData) {
			if(store.getExpectedSales() != null) {
				count++;
				sum = sum.add(store.getExpectedSales()) ;
			}
		
		}
		
		BigDecimal avg = sum.divide(bd(count)).setScale(1, RoundingMode.HALF_UP);
		
		
		Map<Long, BigDecimal> expectedSalesValue = new HashMap<Long, BigDecimal>();
		for(Store store : filteredData) {
			expectedSalesValue.put(store.getStoreId(), store.getExpectedSales());
		}
		
		for(Store store : filteredData) {
			if(store.getExpectedSales() == null ) {
				BigDecimal refExpectedSales = expectedSalesValue.get(store.getReferenceStoreId());
				 if(refExpectedSales != null) {
					 store.setExpectedSales(refExpectedSales);
				 }
				 else {
					 store.setExpectedSales(avg);
				 }
			}
		}
		
		return filteredData;
	}

	private static List<Store> filterStore(List<Store> data) {
		List<Store> filterData = new ArrayList<>();
		for(Store store : data) {
			if(store.getSelected() == true) {
				filterData.add(store);
			}
		}
		return filterData;
	}
    
	private static Store findStoreById(List<Store> data, Long id) {
		for(Store store : data) {
			if(store.getStoreId() == id) {
				return store;
						
			}
		}
		return null;
	}
    


}