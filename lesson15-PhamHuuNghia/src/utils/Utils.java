package utils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import allocation.Store;

public class Utils {

	// get selected store
	public static List<Store> selectedStore(List<Store> list) {
		return list.stream().filter(st -> st.getSelected() == true).collect(Collectors.toList());
	}

	
	// List<Map<Store, BigDecimal>>
	public static Map<Store, BigDecimal> getRealexpectedSale(List<Store> list) throws Exception {
		Objects.requireNonNull(list);
		
		Map<Store, BigDecimal> map = new HashMap<>();

		boolean chk1 = list.stream().allMatch(x -> x.getExpectedSales() == null);
		boolean chk2 = list.stream().allMatch(x -> x.getReferenceStoreId() == null);
		boolean chk3 = list.stream()
				       .allMatch(x -> getStore(x.getReferenceStoreId(), list).getExpectedSales() == null);
		
		if(chk1 && chk2 && chk3) {
			throw new Exception("Expected sales cannot be calculated. "
					+ "Please add are ference store or include stores"
					+ " with expected sales for interpolation");
		}
		
		for (Store st : list) {
			if (st.getExpectedSales() != null) {
				map.put(st, st.getExpectedSales());
				continue;
			}
			
			BigDecimal expectedSaleReferenStore = getStore(st.getReferenceStoreId(), list).getExpectedSales();
			if (expectedSaleReferenStore != null) {
				map.put(st, expectedSaleReferenStore);
				continue;
			}

			map.put(st, avgOfAllExpected(list));

		}
		return map;
	}

	public static BigDecimal getSumOfRealExpectedSale(Map<Store, BigDecimal> map) {
		BigDecimal sum = BigDecimal.valueOf(0);
		for (BigDecimal value : map.values()) {
			sum.add(value);
		}
		return sum.setScale(1,RoundingMode.HALF_UP);
	}

	// Get store with ID
	private static Store getStore(long id, List<Store> list) {
		Objects.requireNonNull(list);
		if (list.stream().anyMatch(x -> x.getStoreId() == id)) {
			Optional<Store> rs = list.stream().filter(x -> x.getStoreId() == id).findFirst();
			if (rs.isPresent()) {
				return rs.get();
			}
		}
		return null;
	}

	private static BigDecimal avgOfAllExpected(List<Store> list) {
		BigDecimal sum = BigDecimal.valueOf(0);
		int count = 0;
		for (Store st : list) {
			if (st.getExpectedSales() != null) {
				sum = sum.add(st.getExpectedSales());
				count++;
			}
		}
		return sum.divide(BigDecimal.valueOf(count)).setScale(1, RoundingMode.HALF_UP);
	}
	
	
	//=========================================Step 2==================
	public static Map<Store, BigDecimal> getAllocationKey(Map<Store, BigDecimal> map){
		Objects.requireNonNull(map);
		Map<Store, BigDecimal> rs = new HashMap<Store, BigDecimal>();
		BigDecimal sum = getSumOfRealExpectedSale(map);
		for(Entry<Store, BigDecimal> entry: map.entrySet()) {
			BigDecimal AlloKey = sum.divide(entry.getValue()).setScale(10, RoundingMode.HALF_UP);
			rs.put(entry.getKey(), AlloKey);
		}
		return rs;
	}
	
	//==========================================Step 3==================
	public static BigDecimal getSumOfStockPrevious(List<Store> list){
		BigDecimal sum = BigDecimal.valueOf(0);	
		for(Store str: list) {
			BigDecimal stockPre = str.getStorePreviousDay();
			if(stockPre!=null)
				sum.add(stockPre);
			}
		return sum;
	}
	
	public static Map<Store, BigDecimal> sumAmountAllocate(Map<Store, BigDecimal> map) {
		
	}
	
	public BigDecimal calAmountAllocate(Store str, BigDecimal AlloKey, BigDecimal SumOfStockPrevious, Integer AmountAllocate) {
	BigDecimal sum=	BigDecimal.valueOf(AmountAllocate).add(SumOfStockPrevious);
	return (AlloKey.multiply(sum)).subtract(str.getStorePreviousDay());
	}
	
	
}
