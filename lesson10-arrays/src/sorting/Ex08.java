package sorting;

import java.util.Arrays;
import java.util.Comparator;
import static java.util.Comparator.*;

import java.util.function.Function;

import static java.util.function.Function.*;


import utils.ArraysUtils;

public class Ex08 {
	public static void main(String[] args) {
		String[] sequences = {"A", null, "b", "D", "a", null, "B"};
		
//		Comparator<String> comparator = (o1, o2) -> o1.compareTo(o2);
		
		// keyExtractor: Function<T, R> >> abstract method: R apply(T t);
		
		// comparing
		
		Comparator<String> comparator = nullsFirst(comparing(indentity(), reverseOrder()));
		
		Arrays.sort(sequences, comparator);
		
		ArraysUtils.printf(sequences);
	}
}
