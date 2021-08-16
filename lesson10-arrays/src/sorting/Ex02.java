package sorting;

import Utils.ArrayUtils;

/**
 * bubbleSort
 * Xử lý các trường hợp sort khi có null
 * Handle null first hoặc null last
 *
 */
public class Ex02 {
	public static void main(String[] args) {
		String[] sequences = { "A", null,null,null,null,null, "B",null, "D", null, "a", "b" };
		System.out.println("Null first: ");
		sortNullFirst(sequences);
		ArrayUtils.printf(sequences);
		
		System.out.println("\nNull last");
		sortNullLast(sequences);
		ArrayUtils.printf(sequences);
	}
	
	/*
	 *  null first >> null null A B D a b
	 *  a[j] = null => continue
	 *  a[j+1] == null => swap
	 *  a[j] >a[j+1] => swap
	 */
	private static void sortNullFirst(String []sequences) {
		// asending
		for (int i = 0; i < sequences.length; i++) {
			for (int j = 0; j < sequences.length - i - 1; j++) {
				if (sequences[j] == null) {
					continue;
				}
				
				//sequences[j] != null
				if(sequences[j+1]==null) {  
					String temp = sequences[j];
					sequences[j] = sequences[j + 1];
					sequences[j + 1] = temp;
					continue;
				}

				if ( sequences[j].compareTo(sequences[j + 1]) > 0) {
					String temp = sequences[j];
					sequences[j] = sequences[j + 1];
					sequences[j + 1] = temp;
				}
			}
		}
	}
	
	/*
	 *  null last >>  A B D a b null null
	 *  a[j] = null   => swap
	 *  a[j+1] == null => continue
	 *  a[j] >a[j+1] => swap
	 */
	private static void sortNullLast(String []sequences) {
		// asending
		for (int i = 0; i < sequences.length; i++) {
			for (int j = 0; j < sequences.length - i - 1; j++) {
				if (sequences[j] == null ) {
					String temp = sequences[j];
					sequences[j] = sequences[j + 1];
					sequences[j + 1] = temp;
					continue;
				}
				
				//sequen[j] != null
				if(sequences[j+1]==null) {  
					continue;
				}

				if ( sequences[j].compareTo(sequences[j + 1]) > 0) {
					String temp = sequences[j];
					sequences[j] = sequences[j + 1];
					sequences[j + 1] = temp;
				}
			}
		}
	}
	
}
