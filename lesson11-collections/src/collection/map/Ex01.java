package collection.map;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Ex01 {
	public static void main(String[] args) {
		// model vehicle
		
		Map<Integer, String> model = new TreeMap<>();
		model.put(92, "Quang Nam");
		model.put(43, "Da Nang");
		model.putIfAbsent(43, "Da Nang 01");
		model.put(75, "Thua Thien Hue");
		model.put(74, "Quang Tri");
		
		String v1 = model.get(88);
		String v2 = model.getOrDefault(88, "dfv1");
		String v3 = model.get(92);
		
		System.out.println("v1: " + v1);
		System.out.println("v2: " + v2);
		System.out.println("v3: " + v3);
		
		String removedValue = model.remove(75);
		System.out.println("removedValue: " + removedValue);
		
		
		System.out.println("size: " + model.size());
		System.out.println("----------------------");
		iterate(model);
		System.out.println("----------------------");
		iterateByValue(model);
		System.out.println("----------------------");
		iterateByKey(model);
		
	}
	
	private static void iterateByValue(Map<Integer, String> model) {
		Collection<String> collection = model.values();
		for(String element: collection) {
			System.out.println("value: " + element);
		}
	}
	
	private static void iterateByKey(Map<Integer, String> model) {
		Set<Integer> keys = model.keySet();
		for(Integer key: keys) {
			System.out.println("key: " + key);
		}
	}
	
	private static void iterate(Map<Integer, String> model) {
		Set<Entry<Integer, String>> entrySet = model.entrySet();
		for(Entry<Integer, String> entry: entrySet) {
			System.out.println("key: " + entry.getKey());
			System.out.println("value: " + entry.getValue());
		}
	}
}
