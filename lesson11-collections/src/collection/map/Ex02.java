package collection.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Ex02 {
	public static void main(String[] args) {
		Map<Integer, String> model=new HashMap<>();
		model.put(92, "Quang Nam");
		model.put(43, "Da Nang");
		model.putIfAbsent(43, "Da Nang 01");
		model.put(75, "Thua Thien Hue");
		model.put(74, "Quang Tri"); 
		
		
		
		
		
	}
	
	private static void sort(Map<Integer,String> model) {
		List<Entry<Integer,String>> sortedList=new LinkedList<>(model.entrySet());
		sortedList.sort(Entry.comparingByValue());
		
		Map<Integer,String> sortedMap=new LinkedHashMap<>();
		
		for(Entry<Integer,String> entry : sortedList) {
           sortedMap.put(entry.getKey(), entry.getValue());
		}
		
	}
}
