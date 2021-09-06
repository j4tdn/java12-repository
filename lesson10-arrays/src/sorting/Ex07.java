package sorting;

import java.util.Arrays;
import java.util.Comparator;

import utils.ArraysUntils;

public class Ex07 {
	public static void main(String[] args) {
		String[] sequences = { "A", null, "b", "D", "a", null, "B" };

		// Arrays.sort(E[]) >> E implements Comparable<E>
		// Not handle in case of NULL values
		// Arrays.sort(sequences);
	Arrays.sort(sequences);
	}

}
