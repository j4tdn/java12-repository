package sorting;

import java.util.Comparator;

import utils.ArraysUntils;

public class Ex02 {
	public static void main(String[] args) {
		String[] sequences = { "A", "b", "D", "a", "B" };

		// ascending
		for (int i = 0; i < sequences.length; i++) {
			for (int j = 0; j < sequences.length - i - 1; j++) {
				if (sequences[j] == null) {
					String tmp = sequences[j];
					sequences[j] = sequences[j + 1];
					sequences[j + 1] = tmp;
					continue;
				}
				if (sequences[j + 1] == null)
					continue;

				if (sequences[j].compareTo(sequences[j + 1]) < 0) {
					String tmp = sequences[j];
					sequences[j] = sequences[j + 1];
					sequences[j + 1] = tmp;
				}
			}
		}

		ArraysUntils.printf(sequences);
	}

	private static void sort(String[] sequences, Comparator<String> comparator) {
       for(int i=0;i<sequences.length;i++) {
    	   for(int j=0;j<sequences.length-i-1;j++) {
    		   String pre=sequences[j];
    		   String next=sequences[j+1];
    		  // if(comparator)
    	   }
       }
	
	}
}
