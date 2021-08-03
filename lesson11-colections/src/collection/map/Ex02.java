package collection.map;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Ex02 {
	public static void main(String[] args) {
		//pass by value : hashcode, queals
		//Map<Employee,List<Employee>> manList = new Hashmap<>();
		Map<Integer, String> model = new TreeMap<>();;
		model.put(92, "A Quang Nam");
		model.put(43,"X Da Nang");
		model.put(75, "B Hue");
		model.put(74, "D Quang Tri");
		
		Map<Integer, String> sortedMap = sort(model);
		for(Entry<Integer, String> entry : sortedMap.entrySet()) {
			System.out.println(entry);
		}
	}
	
	private static Map<Integer, String> sort(Map<Integer,String> model) {
		//process 
		List<Entry<Integer, String>> list = new LinkedList<>(model.entrySet());
		list.sort(Entry.comparingByValue());
		
		Map<Integer, String> sortedMap = new LinkedHashMap<>();
		for(Entry<Integer, String> entry: list) {
			sortedMap.put(entry.getKey(),entry.getValue());
		}
		return sortedMap;
	}
}
