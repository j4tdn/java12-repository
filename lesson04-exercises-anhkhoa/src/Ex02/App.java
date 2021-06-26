package Ex02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class App {
	private static List<Integer> list = Arrays.asList(7, 5, 35, 49, 6, 20, 14, 10, 25);;

	public static void main(String[] args) {
		for (var item : arr())
			System.out.println(item);

	}

	private static List<Integer> arr() {
		List<Integer> lists = new ArrayList<Integer>();

		for (var item : list) {
			if (item % 7 == 0 && item % 5 != 0)
				lists.add(item);
		}
		for (var item : list) {
			if (item % 7 == 0 && item % 5 == 0)
				lists.add(item);

		}
		for (var item : list) {
			if (item % 5 == 0)
				lists.add(item);
		}
		return lists.stream().distinct().collect(Collectors.toList());
	}
}
