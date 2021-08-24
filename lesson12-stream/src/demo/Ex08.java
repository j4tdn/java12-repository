package demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import utils.ArrayUtils;
import utils.CollectionUtils;

public class Ex08 {
	public static void main(String[] args) {
		//source: List<E>, E[]
		List<Integer> numbers = Arrays.asList(1,2,1,3,3,2,4);
		
		List<Integer> evenNumbers = numbers.stream()
											.filter(d->d%2==0)
											.distinct() //set, map HasHtable >> hashcode, equal
											.collect(Collectors.toList());
		CollectionUtils.printf(evenNumbers);
		
		//work with array
		int[] digits = {1,2,1,3,3,2,4};
		int[] rs = Arrays.stream(digits)
				.filter(d->d%2==0)
				.distinct()
				.toArray();
		ArrayUtils.printf(rs);
								
		
	}
}
