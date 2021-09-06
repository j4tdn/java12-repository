package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public  class CollectionUtils {

	private CollectionUtils() {

	}

	public static List<Integer> init(Integer... elements) {
		List<Integer> result = new ArrayList<>();
		result.addAll(Arrays.asList(elements));

		return result;
	}

	public static void printf(List<String> elelments) {
		for (String element : elelments) {
			System.out.println(element);
		}
	}

	public static void show(List<Integer> elelments) {
		for (Integer element : elelments) {
			System.out.println(element + " ");
		}
	}
}
