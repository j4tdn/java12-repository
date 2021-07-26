package sorting;

import java.util.Arrays;
import java.util.Comparator;

import utils.ArraysUtils;

public class Ex07 {
	public static void main(String[] args) {
		
		String[] sequences = {"A",null,"b","D","a",null,"B"};
		
		//Not handle in case of NULL values
		//Arrays.sort(sequences);
		
		Comparator<String> comparator = new Comparator<String>() {
			
			@Override
			public int compare(String left, String right) {
				// TODO Auto-generated method stub
				
				if(left==null) {
					return 1;
				}
				//left!=null
				if(right ==null) {
					return -1;
				}
				//left,right!=null
				return left.compareTo(right);
			}
		};
		Arrays.sort(sequences,comparator);
		ArraysUtils.printf(sequences);
	}
}
