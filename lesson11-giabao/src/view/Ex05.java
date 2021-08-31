package view;

import java.util.ArrayList;
import java.util.Comparator;

import static java.util.Comparator.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex05 {
	public static void main(String[] args) {
		Map<String, Integer> spends = mockSpends();

		System.out.println("list activity cost >500000");
		listofActiveCostThan(500000, spends);

		System.out.println("===============================");
		System.out.println("Sắp xếp theo thứ tự giảm dần số tiền: ");
		spends = sortSpends(spends, comparing((Entry<String, Integer> t) -> (Integer) t.getValue()).reversed());
		show(spends);

		System.out.println("===============================");
		System.out.println("Sắp xếp theo tăng dần của các khoản chi: ");
		spends = sortSpends(spends, comparing((Entry<String, Integer> t) -> (String) t.getKey()).reversed());
		show(spends);

	}

	private static void show(Map<String, Integer> spends) {
		Set<Entry<String, Integer>> entries = spends.entrySet();

		for (Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

	private static <T> Map<String, Integer> sortSpends(Map<String, Integer> spends,
			Comparator<Entry<String, Integer>> comparator) {
		Map<String, Integer> sortedHashMap = new LinkedHashMap<String, Integer>();
		List<Entry<String, Integer>> sortedList = new ArrayList<>(spends.entrySet());

		sortedList.sort(comparator);
		for (Entry<String, Integer> entry : sortedList) {
			sortedHashMap.put(entry.getKey(), entry.getValue());
		}

		return sortedHashMap;
	}

	private static void listofActiveCostThan(int value, Map<String, Integer> spends) {
		Set<Entry<String, Integer>> list = spends.entrySet();
		for (Entry<String, Integer> element : list) {
			if (element.getValue() > value) {
				System.out.println(element.getKey() + ": " + element.getValue());
			}
		}
	}

	private static Map<String, Integer> mockSpends() {
		Map<String, Integer> tmp = new HashMap<>();
		tmp.put("Ăn sáng", 15000);
		tmp.put("Ăn trưa", 20000);
		tmp.put("Trà sữa", 35000);
		tmp.put("Thư viện", 1000);
		tmp.put("Xem phim", 600000);
		tmp.put("Nộp học phí", 7000000);
		return tmp;
	}
}
