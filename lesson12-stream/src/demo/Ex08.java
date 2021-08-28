package demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

import utils.ArrayUtils;


public class Ex08 {
	public static void main(String[] args) {
		int[] digits = {1, 2, 1, 3, 3, 2, 4,6};
		
		int[] evenNumbers = Arrays.stream(digits)
			.filter(number -> number % 2 == 0)
			.distinct()
			.toArray();
		
		ArrayUtils.printf(evenNumbers);
		
		Map<Integer, Integer> arr = new HashMap<>();
		for(int i = 0; i < digits.length; i++) {
			if(!arr.containsKey(i)) {
				arr.put(digits[i], i);
			}
		}
		
		System.out.println(arr);
		
		List<Integer> distinctNumbers = Arrays.stream(digits)
				.boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet()
				.stream()
				.filter(number -> number.getValue() == 1)
				.map(Entry::getKey)
				.collect(Collectors.toList());
		
		System.out.println(distinctNumbers);
		/*List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
		
		List<Integer> evenNumbers = numbers.stream()
				.filter(number -> number % 2 == 0)
				.distinct() // Set, Map, HashTable >>(override) hashCode, equals
				.collect(Collectors.toList());
		
		CollectionUtils.printf(evenNumbers);*/
	}
}
