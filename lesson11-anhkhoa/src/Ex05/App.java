package Ex05;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.Map.Entry;

public class App {
	public static void main(String[] args) {
		Map<String, Double> data = new HashMap<>();
		expenditure e1 = new expenditure("cá", 100);
		expenditure e2 = new expenditure("thịt", 150);
		expenditure e3 = new expenditure("rau", 90);
		data.put(e1.getInformation(), e1.getTotal());
		data.put(e2.getInformation(), e2.getTotal());
		data.put(e3.getInformation(), e3.getTotal());

	}

	private static List<expenditure> select(Map<String, Double> data) {
		Set<Entry<String, Double>> s = data.entrySet();
		List<expenditure> list = new ArrayList<>();
		for (var item : s) {
			if (item.getValue() > 500) {
				expenditure e = new expenditure(item.getKey(), item.getValue());
				list.add(e);
			}
		}
		return list;
	}

	private static Map<String, Double> sort(Map<String, Double> data) {

		List<Entry<String, Double>> list = new ArrayList<>(data.entrySet());
		list.sort(Entry.comparingByKey());
		Map<String, Double> entries = new LinkedHashMap<>();
		for (Entry<String, Double> item : list) {
			entries.put(item.getKey(), item.getValue());
		}
		return entries;
	}

	private static Map<String, Double> sortDes(Map<String, Double> data) {

		List<Entry<String, Double>> list = new ArrayList<>(data.entrySet());
		list.sort(Entry.comparingByValue((o1, o2) -> (int) (o2 - o1)));
		Map<String, Double> entries = new LinkedHashMap<>();
		for (Entry<String, Double> item : list) {
			entries.put(item.getKey(), item.getValue());
		}
		return entries;
	}
}
