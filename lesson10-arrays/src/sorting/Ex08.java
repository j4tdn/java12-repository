package sorting;

import java.util.Arrays;

import static java.util.Comparator.*;
import static java.util.function.Function.*;

import utils.ArraysUtils;

public class Ex08 {
	public static void main(String[] args) {
		// anonymous class
		// anonymous function = lambda expression
		// Comparator<String> comparator = (s1, s2) -> s1.compareTo(s2);

		// keyExtractor: Function<T, R> >> abstract method: R apply(T t);

		// comparing

		// keyExtractor.apply(c1) > c1
		// keyExtractor.apply(c2) > c2

		// (c1, c2) -> keyExtractor.apply(c1).compareTo(keyExtractor.apply(c2));
		// s -> s = identity();

		String[] sequences = { null, "A", null, "b", "D", "a", null, "B", null };
		Arrays.sort(sequences, nullsLast(comparing(identity(), reverseOrder())));
		ArraysUtils.printf(sequences);
	}
}
