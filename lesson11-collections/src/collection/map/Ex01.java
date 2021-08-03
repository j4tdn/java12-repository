package collection.map;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;

import static java.util.Comparator.*;

public class Ex01 {
	public static void main(String[] args) {
		//model vehicle 
		// put >> check do hashcode(key), equals(key) exists ? existed =>replace 
		//oldValue: put new
		
		
		//HashMap(cho phep 1 key null)
		//LinkedHAshMap : giu thu tu input vao
		//TreeMap(no null): Auto Sorted by Key Ascending
		Comparator<Integer> keyComp2 = nullsFirst(Comparator.comparing(Function.identity()));
		
		
		Map<Integer,String> model = new TreeMap<>(keyComp2);
		model.put(92, "Quang Nam");
		model.put(43, "Da Nang");
		model.putIfAbsent(43, "Da Nang 05");
		model.put(75, "T.T Hue");
		model.put(86, "T.T Hue");
		model.put(null, "undentify");
		model.put(74, "Quang Tri");

		String v1 = model.get(92);
		String v2 = model.getOrDefault(77,"dsas");
		String v3 = model.get(99);

		System.out.println("v1: "+ v1);
		System.out.println("v2: "+ v2);
		System.out.println("v3: "+ v3);

		String removeValue = model.remove(43);
		System.out.println("removeValue "+ removeValue);

		
		System.out.println("size "+ model.size());
		System.out.println("============================");
		iterate(model);
		
		System.out.println("============================");
		iterateByKey(model);
		
		System.out.println("============================");
		iterateByValue(model);
	}
	//iterate via entry
	private static void iterate(Map<Integer,String> model) {
		Set<Entry<Integer,String>> entrySet = model.entrySet();
		for(Entry<Integer, String> entry: entrySet) {
			System.out.println("key: "+entry.getKey());
			System.out.println("value: "+entry.getValue());

		}
	}
	//iterate via key
	private static void iterateByKey(Map<Integer,String> model) {
		Set<Integer> keys = model.keySet();
		for(Integer key : keys) {
			System.out.println("key: "+key);
		}
	}
	//iterate via value
	private static void iterateByValue(Map<Integer,String> model) {
		Collection<String> collection = model.values();
		for(String element : collection) {
			System.out.println("value: "+ element);
		}
	}
}
