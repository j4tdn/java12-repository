package collection.map;


import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;

import static java.util.Comparator.*;

public class Ex01 {
	public static void main(String[] args) {
		//model vehicle
		//put >> check hashcode(key), equals(key) exists? existed => replace
		
		//HashMap: thứ tự truyền vào lộn xộn
		//LinkedHashMap: giữ đúng thứ tự truyền vào
		//TreeMap:
	
		Comparator<Integer> keyComp = nullsFirst(comparing(Function.identity()));
		
		Map<Integer, String> model = new TreeMap<>(keyComp);;
		model.put(92, "Quang Nam");
		model.put(43,"Da Nang");
		model.put(75, "Hue");
		model.put(74, "Quang Tri");
		model.put(92, "QuangNam01");
		String v1 = model.get(88);
		String v2 = model.getOrDefault(88, "dfvl");
		String v3 = model.get(92);
		
		
		System.out.println("v1: " +v1);
		System.out.println("v2: " +v2);
		System.out.println("v3: " +v3);
		
		String removedValue = model.remove(75);
		System.out.println("removed Value: " + removedValue);
		
		System.out.println("size: " + model.size() );
		
		System.out.println("===========");
		iterate(model);
	}
	//interata via key
	private static void iterateByKey(Map<Integer,String> model) {
		Set<Integer> keys = model.keySet();
		for(Integer key: keys) {
			System.out.println("key: " + key);
		}
	}
	//interate via value
	private static void iterateByValue(Map<Integer,String> model) {
		Collection<String> values = model.values();
		for(String value: values) {
			System.out.println("values: " + value);
		}
	}
	
	//interate via value,key
	private static void iterate(Map<Integer,String> model) {
		Set<Entry<Integer, String>> entrySet = model.entrySet();
		for( Entry<Integer,String> entry : entrySet) {
			System.out.println("key: " + entry.getKey());
			System.out.println("value: " + entry.getValue());
		}
	}
}
