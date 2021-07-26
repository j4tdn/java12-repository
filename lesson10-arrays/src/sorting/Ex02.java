package sorting;

import java.util.Comparator;

import utils.ArraysUtils;

public class Ex02 {
	public static void main(String[] args) {
		String[] sequences = {"A", null, "b", "D", "a", null, "B"};
		
		Comparator<String> comparator = new Comparator<String>() {
			@Override
			public int compare(String pre, String next) {
				if(pre == null) {
					return 1;
				}
				
				// previous != null
				if(next == null) {
					return -1;
				}
				
				// next != null
				if(pre.compareTo(next) == 0) {
					return 0;
				} else if(pre.compareTo(next) < 0) {
					return 1;
				} else {
					return -1;
				}
			}
		};
		
		sort(sequences, comparator);
		
		ArraysUtils.printf(sequences);
	}
	
	private static void sort(String[] sequences, Comparator<String> comparator) {
		for(int i = 0; i < sequences.length; i++) {
			for(int j = 0; j < sequences.length - i - 1; j++) {
				String pre = sequences[i];
				String next = sequences[j + 1];
				if(comparator.compare(pre, next) > 0) {
					String tmp = sequences[j];
					sequences[j] = sequences[j + 1];
					sequences[j + 1] = tmp;
				}
			}
		}
	}
}
