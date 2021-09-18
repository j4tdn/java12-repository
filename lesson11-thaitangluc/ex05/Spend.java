package ex05;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Set;
import java.util.TreeMap;

public class Spend {
	private Spend() {
	}
	
	public static Map<String, Integer> create() {
		Map<String, Integer> expenses = new TreeMap<>();
		expenses.put("ao", 120);
		expenses.put("quan", 150);
		expenses.put("giay", 220);
		expenses.put("tivi", 520);
		expenses.put("chen", 600);
		expenses.put("dong ho", 550);
		return expenses;
	}
	
	public static void listed(Map<String, Integer> expenses) {
		Set<Entry<String, Integer>> entrySet = expenses.entrySet();
		for(Entry<String, Integer> entry: entrySet) {
			if(entry.getValue() > 500) {
				System.out.println(entry);
			}
		}
	}	
	
	public static <T> void sortKey(Map<String, Integer> expenses, Comparator<Entry<String, Integer>> com) {
		Set<Entry<String, Integer>> entrySet = expenses.entrySet();
		entrySet.stream()	
				.sorted(com)
				.forEach(System.out::println);
	}
}
