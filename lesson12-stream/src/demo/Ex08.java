package demo;

import java.util.Arrays;

import utils.ArrayUtils;

public class Ex08 {
	public static void main(String[] args) {
		// source: List<E> , E[]
		int[] digits = {1,2,1,3,3,2,4};
		
		int[] evenNums = Arrays.stream(digits)
							   .filter(nbr -> nbr % 2 ==0)
						       .distinct()
						       .toArray();
		ArrayUtils.printf(evenNums);
		
//		int[] distinct
		/*List<Integer> numbers = Arrays.asList(1,2,1,3,3,2,4);
		
		Set<Integer> evenNums = numbers.stream()
									.filter(nbr -> nbr % 2 ==0)
									//.distinct()  //Set, Map, HashTable >> hashcode, equal
									.collect(Collectors.toSet());
		CollectionUtils.printf(evenNums);
	*/
	}
}
