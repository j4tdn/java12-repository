package bt5;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class App {

	public static void main(String[] args) {
		Map<String,Integer> model = new HashMap<>();
		model.put("Go Market", 500000);
		model.put("Go Restaurant",200000);
		model.put("Go Resort", 700000);
		model.put("Go Beach", 600000);
		
		System.out.println("======== Pay more 500k =======");
		Map<String,Integer> payMore500k = filterValue(model); 
		for(Entry<String,Integer> entry : payMore500k.entrySet()) {
			System.out.println(entry);
		}
		
		System.out.println("===========Sort ASC");
		Map<String,Integer> sortedASC = sort(model);
		for(Entry<String,Integer> entry : sortedASC.entrySet()) {
			System.out.println(entry);
		}
		
		System.out.println("=============Sort DSC");
		Map<String,Integer> sortedDSC = sortDEC(model);
		for(Entry<String,Integer> entry : sortedDSC.entrySet()) {
			System.out.println(entry);
		}
		
		
	}
	private static Map<String,Integer> sort(Map<String,Integer> model) {
		List<Entry<String,Integer>> sortedList = new LinkedList<>(model.entrySet());
		sortedList.sort(Entry.comparingByValue());
		
		Map<String,Integer> sortedMap = new LinkedHashMap<>();
		for(Entry<String,Integer> entry: sortedList) {
			sortedMap.put(entry.getKey(),entry.getValue());
		}
		
		return sortedMap;
	}
	
	private static Map<String,Integer> sortDEC(Map<String,Integer> model) {
		List<Entry<String,Integer>> sortedList = new LinkedList<>(model.entrySet());
		Comparator<Entry<String,Integer>> comp = new Comparator<Entry<String,Integer>>() {

			@Override
			public int compare(Entry<String,Integer> t1, Entry<String,Integer> t2) {
				return t2.getValue().compareTo(t1.getValue());
			}
			
		};
		sortedList.sort(comp);
		
		Map<String,Integer> sortedMap = new LinkedHashMap<>();
		for(Entry<String,Integer> entry: sortedList) {
			sortedMap.put(entry.getKey(),entry.getValue());
		}
		
		return sortedMap;
	}
	
	private static Map<String,Integer> filterValue(Map<String,Integer> Total){
		List<Entry<String,Integer>> filters = new LinkedList<>(Total.entrySet());
		
		Map<String,Integer> payMore5 = new LinkedHashMap<>();
		for(Entry<String,Integer> filter : filters) {
			if(filter.getValue() > 500000) {
				payMore5.put(filter.getKey(),filter.getValue());
			}
		}
		return payMore5;
	}
}
