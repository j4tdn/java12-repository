package demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import functional.Calculator;

public class Ex12 {
	public static void main(String[] args) {
		// Auto Boxing, Auto UnBoxing
		List<Integer> digits = Arrays.asList(1, 2, 3, 4, 5);
		
		// traditional way
		int sum = 0;
		for (Integer digit: digits) {
			sum += digit;
		}
		System.out.println("sum: "  + sum);
		
		// stream way >> reduce
		int demoTotal = operate(0, digits, Integer::sum);
		int max = digits.stream().reduce(Integer.MIN_VALUE, Integer::max);
		System.out.println("max: " + max);
		System.out.println("demoTotal: " + demoTotal);
		
		System.out.println("==============");
		Optional<Integer> optInt = digits.stream().reduce(Integer::max);
		optInt.ifPresent(value -> System.out.println("max: " + value));
		
		if(optInt.isPresent()) {
			System.out.println("max: " + optInt.get());
		}
	}
	
	private static Integer operate(Integer initial, List<Integer> digits, Calculator c) {
		Integer result = initial;
		
		for(Integer digit: digits) {
			result = c.perform(result, digit);
		}
		
		return result;
	}
}
