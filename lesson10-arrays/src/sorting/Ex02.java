package sorting;

import utils.ArraysUtils;

public class Ex02 {
	public static void main(String[] args) {
		String[] sequences = {"A", null, "b", "D", "a", null, "B"};
		
		// ascending
		// previous : sequences[j]
		// next     : sequences[j+1]
		
		// null first
		// null last
		for(int i = 0; i < sequences.length; i++) {
			for(int j = 0; j < sequences.length - i - 1; j++) {
				// null first
				if(sequences[j] == null) {
					continue;
				}
				
				// previous != null
				if(sequences[j + 1] == null) {
					String tmp = sequences[j];
					sequences[j] = sequences[j + 1];
					sequences[j + 1] = tmp;
					continue;
				}
				
				// next != null
				if(sequences[j].compareTo(sequences[j+1]) > 0) {
					// swap
					String tmp = sequences[j];
					sequences[j] = sequences[j + 1];
					sequences[j + 1] = tmp;
				}
			}
		}
		
		ArraysUtils.printf(sequences);
	}
}
