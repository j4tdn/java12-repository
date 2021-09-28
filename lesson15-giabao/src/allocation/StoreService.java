package allocation;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
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
	 * 
	 * Làm tròn số
	 * BigDecimal a = BigDecimal.valueOf(15.23657123648); 
	 * a = a.setScale(4, RoundingMode.HALF_UP);
	 * Kết quả: a = 15.2366
	 */
	private static List<Store> selectedStore;
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
    private static boolean fillInMissing(List<Store> data){
    	BigDecimal sumExpectedSale = getSumOfExpectedSale(data);
    	if(sumExpectedSale.intValue()==0) {
    		return false;
    	}
    	
    	long validExpectedStore = data.stream().filter(p->p.getExpectedSales()!=null).count();
    	BigDecimal valueForCase2 = sumExpectedSale.divide(new BigDecimal(validExpectedStore)).setScale(1, RoundingMode.HALF_UP);
    	
    	List<Store> changeAfter = new ArrayList<>();
    	selectedStore.stream().filter(p->p.getExpectedSales()==null)
    					.forEach(p->{
    						if(p.getReferenceStoreId()==null) {
    							p.setExpectedSales(valueForCase2);
    						} else {
    							Optional<Store> referenceStore = selectedStore.stream().filter(k->k.getStoreId()==p.getReferenceStoreId()).findFirst();
    		    				if(!referenceStore.isEmpty() &&  referenceStore.get().getExpectedSales() == null) {
    		    					p.setExpectedSales(valueForCase2);
    		    				} else {
    		    					changeAfter.add(p);
    						}}
    					});
    	changeAfter.stream().forEach(p->{
    		Optional<Store> referenceStore = selectedStore.stream().filter(k->k.getStoreId()==p.getReferenceStoreId()).findFirst();
    		p.setExpectedSales(referenceStore.get().getExpectedSales());
    	});
    	return true;
    	
    }
    private static BigDecimal getSumOfExpectedSale(List<Store> data) {
    	return data.stream().map(Store::getExpectedSales)
    			.filter(p->p!=null)
    			.reduce(new BigDecimal(0),BigDecimal::add);
    }
    private static Map<Long,BigDecimal> calculationOfAlloKey(List<Store> data){
    	Map<Long, BigDecimal> rs = new TreeMap<Long, BigDecimal>();
    	BigDecimal sumOfExpected = getSumOfExpectedSale(data);
    	selectedStore.stream().forEach(p->{
    		rs.put(p.getStoreId(), p.getExpectedSales().divide(sumOfExpected,10, RoundingMode.HALF_UP));
    	});
    	
    	return rs;
    }
    private static Map<Long,Integer> calculationOfAllo(Map<Long,BigDecimal> keymap,Integer amount){
    	Map<Long, Integer> rs = new TreeMap<Long, Integer>();
    	BigDecimal sumOfStock = selectedStore.stream().map(Store::getStorePreviousDay)
    			.filter(p->p!=null)
    			.reduce(new BigDecimal(0),BigDecimal::add);
    	
    	selectedStore.stream().forEach(p->{
    		BigDecimal allocationKey =keymap.get(p.getStoreId());
    		Integer amountalloca= allocationKey.multiply(sumOfStock.add(BigDecimal.valueOf(amount)))
												.subtract(p.getStorePreviousDay())
												.setScale(0, RoundingMode.HALF_UP)
												.intValue();
    		rs.put(p.getStoreId(), amountalloca);
    	});
    	return rs;
    }
    private static Map<Long, Integer> doAllocation(Integer whAllocationAmount, List<Store> data) {
    	selectedStore = data.stream().filter(Store::getSelected).collect(Collectors.toList());
    	
    	//Step1: filling in missing
    	if(!fillInMissing(selectedStore)) {
    		System.err.print("Expected sales cannot be calculated. "
    				+ "Please add a reference store or include stores with expected sales for interpolation");
    		return null;
    	};
    	
    	selectedStore.stream().forEach(System.out::println);
    	System.out.println("=======");
    	
    	
    	//Step2: Calculation of "Allocation key"
    	Map<Long, BigDecimal> alloKey = calculationOfAlloKey(selectedStore);
    	
    	//Step3: 
    	return calculationOfAllo(alloKey, whAllocationAmount);
    }


}