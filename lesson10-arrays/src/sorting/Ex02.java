package sorting;

import Utils.ArraysUtils;

public class Ex02 {
	public static void main(String[] args) {
		String[] sequences = { "A", null, "b", "D", "a", null, "B" };

		// ascending
		for (int i = 0; i < sequences.length; i++) {
			for (int j = 0; j < sequences.length - i - 1; j++) {
				if (sequences[j] == null) {
					continue;
				}
				if (sequences[j + 1] == null || sequences[j].compareTo(sequences[j + 1]) > 0) {
					String tmp = sequences[j];
					sequences[j] = sequences[j + 1];
					sequences[j + 1] = tmp;
				}
			}

		}
		ArraysUtils.printf(sequences);
	}
}
