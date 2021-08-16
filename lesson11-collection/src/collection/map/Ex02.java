package collection.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Ex02 {
public static void main(String[] args) {
	Map<Integer, String>model=new HashMap<>();
	model.put(92, "A QN");
	model.put(43, "x DN");
	model.put(75, "B TTH");
	model.put(74, "G QT");
	Map<Integer, String>sortedMap = sort(model);
	for(Entry<Integer, String>entry: sortedMap.entrySet()) {
		System.out.println(entry);
	}
}
private static Map<Integer,String> sort(Map<Integer, String>model) {
	List<Entry<Integer, String>> SortedList=new LinkedList<>(model.entrySet());
	SortedList.sort(Entry.comparingByValue());
	// Hoặc giảm dần: list.sort(Entry.comparingByValue(Comparator.reverseOrder()));
	
	Map<Integer,String> sortedMap=new LinkedHashMap<Integer, String>();
	for(Entry<Integer, String>entry:SortedList) {
		sortedMap.put(entry.getKey(), entry.getValue());
	}
	return sortedMap;
}
}
