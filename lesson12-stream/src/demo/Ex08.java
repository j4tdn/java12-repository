package demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import utils.CollectionUtils;

public class Ex08 {
	public static void main(String[] args) {
		int[] digits = { 1, 2, 3, 2, 1, 4, 6, 2, 1, 4, 6, 7, 0 };

		List<Integer> numbers = Arrays.stream(digits).boxed().collect(Collectors.toList());
		
		//Tim cac so xuat hien chi mot lan
		List<Integer> uniqueNumbers = numbers
				                    .stream()
				                    .filter(nbr -> Collections.frequency(numbers, nbr) == 1)
				                    .collect(Collectors.toList());

		CollectionUtils.printf(uniqueNumbers);
		
//		Map<Integer, List<Integer>> result= numbers
//        .stream()
//        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
//        .entrySet()
//        .stream()
//        .filter(entry->entry.getValue()==1)
//        .map(Entry::getKey).collect(Collectors.toList()).forEach(System.out::println)
//        ;

	}
}
