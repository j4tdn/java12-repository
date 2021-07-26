package sorting;

import java.util.Arrays;
import java.util.Comparator;

import utils.ArrayUtils;

public class Ex07 {

	public static void main(String[] args) {
		String[] sequences = {"A",null,"b","D","a",null,"B"};
		
		
		//Arrays.sort(E[]) >> E implement Comparable<E> >> compareTo
		//Not handle in case of NULL values
		//Arrays.sort(sequences);
		
		Comparator<String> comparator = new Comparator<String>() {
		
			@Override
			public int compare(String left, String right) {
				//left++ pivot
				//right-- pivot
				if(left == null) {
					return 1;
				}
				
				//left != null
				if(right == null) {
					return -1;
				}
				
				//left,right !=null
				return left.compareTo(right);
			}
		};
		
		Arrays.sort(sequences, comparator);
		ArrayUtils.printf(sequences);
		
	}
}
