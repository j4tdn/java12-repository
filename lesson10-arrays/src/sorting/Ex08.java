package sorting;

import java.util.Arrays;
import utils.ArraysUtils;

import static java.util.Comparator.*;
import static java.util.function.Function.*;

public class Ex08 {
	public static void main(String[] args) {
		String[] sequences = { "A", null, "b", "D", "a", null, "B" };
		
//		Arrays.sort(sequences, new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {			
//				return o1.compareTo(o2);
//			}
//		});
		
		// Arrays.sort(sequences, (o1, o2) -> o2.compareTo(o1));
		
		// keyExtractor: Function<T, R> >> abstract method: R apply(T t);
		
		// comparing
		
		// keyExtractor.apply(c1) > c1
		// keyExtractor.apply(c2) > c2
		
		// (c1, c2) -> keyExtractor.apply(c1).compareTo(keyExtractor.apply(c2));
		// s -> s = identity();
		
		Arrays.sort(sequences, nullsLast(comparing(identity(), reverseOrder())));
		
		ArraysUtils.printf(sequences);
	}
}
