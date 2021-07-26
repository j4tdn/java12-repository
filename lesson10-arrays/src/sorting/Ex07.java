package sorting;

import java.util.Arrays;
import java.util.Comparator;

import utils.ArraysUtils;

public class Ex07 {
	public static void main(String[] args) {
		String[] sequences = { "A", null, "b", "D", "a", null, "B" };
		
		// Arrays.sort(E[]) >> E implement Comparable<E> >> compareTo
		// Not handle in case of null value
		// Arrays.sort(sequences);
		
		Arrays.sort(sequences, new Comparator<String>() {

			@Override
			public int compare(String left, String right) {
				// left++ pivot
				// right-- pivot
				
				// null first || null last
				if (left == null) {
					return 1;
				}
				
				if (right == null) {
					return -1;
				}
				
				return left.compareTo(right);
			}
		});
		
		ArraysUtils.printf(sequences);
	}
}
