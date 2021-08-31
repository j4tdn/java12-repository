package demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import functional.Calculator;

public class Ex12 {
	public static void main(String[] args) {
		// Operations: sum, subtract,multiplu,divide,max,min
		// Auto boxing auto unboxing
		List<Integer> digits = Arrays.asList(1, 2, 3, 4, 5,6,7);

		// traditional way
		System.out.println("=========Truyền thống=========");
		int sum = 0;
		int max = Integer.MIN_VALUE;
		for (Integer i : digits) {
			sum += i;
			if (max < i) {
				max = i;
			}
		}
		System.out.println(sum);
		System.out.println(max);

		System.out.println("=======INTERFACE TỰ TẠO=============");

		// stream way>> reduce
		int total = reduce(0, digits, (a,b)->a+b);
		System.out.println(total);
		
		int max2 = reduce(Integer.MIN_VALUE, digits, (a,b)->a>b?a:b);
		System.out.println(max2);
		
		System.out.println("==========REDUCE STREAM===========");
		
		//(a,b)->a+b  <===> (a,b)-> Ex12.sum(a,b)  <=======> Ex12::sum <====> Integer::sum
		int totalAll = digits.stream().reduce(0, Integer::sum);
		System.out.println(totalAll);
		
		int maxAll = digits.stream().reduce(Integer.MIN_VALUE, Integer::max);
		System.out.println(maxAll);
		
		
		System.out.println("==========Optional=========");
		List<Integer> digits2 = Arrays.asList();
		Optional<Integer> maxoption = digits2.stream().reduce(Integer::max);
		if(maxoption.isEmpty()) {
			
		}
		System.out.println(maxoption);
		

	}

	private static Integer reduce(Integer initial, List<Integer> digits, Calculator c) {
		Integer rs = initial;
		for (Integer digit : digits) {
			rs = c.peform(rs, digit);
		}
		return rs;
	}
}
