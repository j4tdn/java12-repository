package demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

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
//		int[] rs = Arrays.stream(digits)
//				.filter(d->d%2==0)
//				.distinct()
//				.toArray();
//		ArrayUtils.printf(rs);
			
		System.out.println("=======================");
		List<Integer> num = Arrays.stream(digits).boxed().collect(Collectors.toList());
		
		List<Integer> uniqueNum = num.stream()
									.filter(nbr->Collections.frequency(num, nbr)==1)
									.collect(Collectors.toList());
		CollectionUtils.printf(uniqueNum);
		
		System.out.println("=======================");
		 num.stream().
			collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
			.entrySet() //Set <Entry<Integer,Long>>
			.stream()	//Stream<Entry<Integer,Long>>
			.filter(entry -> entry.getValue()==1)
			.map(Entry::getKey)
			.collect(Collectors.toList())
			.forEach(System.out::println);
		 		
		
		
		
	}
}
