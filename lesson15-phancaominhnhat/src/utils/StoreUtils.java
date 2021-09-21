package utils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.stream.Collectors;

import allocation.Store;

public class StoreUtils {
	@SuppressWarnings("null")
	public static Map<Store, BigDecimal> stepOne(List<Store> data) {
		Map<Store, BigDecimal> expectedSaleInci = new HashMap<>();
		List<Store> dataSelected = data.stream().filter(store -> store.getSelected()).collect(Collectors.toList());
		Double d = data.stream().filter(store -> store.getExpectedSales() != null).mapToDouble(e -> e.getExpectedSales().doubleValue()).sum();
		Double count = (double) data.stream().filter(store -> store.getExpectedSales() != null).mapToDouble(e -> e.getExpectedSales().doubleValue()).count();
		double avg = d/count;
		
		BigDecimal avgf = BigDecimal.valueOf(avg);
		avgf.setScale(1, RoundingMode.HALF_UP);
		
		ListIterator<Store> iterator = dataSelected.listIterator();
		
		while (iterator.hasNext()) {
            Store store = iterator.next();
            if(store.getExpectedSales() ==  null) {            	
            	Store referStore = (Store) dataSelected.stream().filter(s -> (s.getStoreId() == store.getReferenceStoreId())).collect(Collectors.toList());
            	if(store.getReferenceStoreId() != null) {            		
            		store.setExpectedSales(referStore.getExpectedSales());
            	}
            	if(store.getReferenceStoreId() == null || referStore.getExpectedSales() == null) {
            		
            		store.setExpectedSales(avgf);
            	}
            }
            
            expectedSaleInci.put(store, store.getExpectedSales());
        }
		int c = (int) dataSelected.stream().filter(store -> store.getExpectedSales() == null).count();
		if(c == dataSelected.size()) {
			System.out.println("Expected sales cannot be calculated. Please add a reference store or include stores with expected sales for interpolation");
		}
		return expectedSaleInci;
	}

	public static Map<Store, BigDecimal> stepTwo(Map<Store, BigDecimal> data) {
		BigDecimal sum = BigDecimal.valueOf(0);
		data.entrySet().stream().map(e ->  sum.add(e.getValue()));
		Map<Store, BigDecimal> allocationKey = new HashMap<>();
		
		for (Map.Entry<Store, BigDecimal> entry : data.entrySet()) {
            allocationKey.put(entry.getKey(), entry.getValue().divide(sum));
        }
		return allocationKey;
	}
}
