package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

import bean.Apple;
import utils.AppleUtils;
import utils.CollectionUtils;

public class Ex02 {
	public static void main(String[] args) {
		List<Apple> inventory = AppleUtils.getAll();
		
		 
		System.out.println("=================GREEND APPLE==============");
		List<Apple> green = filterApples(inventory, a -> "green".equals(a.getColor()));
		CollectionUtils.printf(green);
		
		System.out.println("=================GREEND APPLE==============");
		List<Apple> red = filterApples(inventory, a -> "red".equals(a.getColor()));
		CollectionUtils.printf(red);
		
		//Lamda expresions
		// Get list of origin countries of apples
		Set<String> countries = map(inventory, new Function<Apple, String>() {
			public String apply(Apple t) {
				return t.getCountry();
			};
		});
		CollectionUtils.printf(countries);
		
		List<String> texts = Arrays.asList("abc","abcde","ab","abcdef");
		Set<Integer> lengths = map(texts, new Function<String, Integer>() {
			public Integer apply(String s) {
				return s.length();
			};
		});
		CollectionUtils.printf(lengths);
		
	}
	private static <T,R> Set<R> map(List<T> ts, Function<T, R> function){
		Set<R> result = new HashSet<>();
		
		for(T t:ts) {
			result.add(function.apply(t));
		}
		return result;
	}
	/**
	 * Get apple wwith given condition
	 * 
	 * @param inventory input data
	 * @param behavior given condition
	 * @return output data
	 */
	private static List<Apple> filterApples(List<Apple> inventory,Predicate<Apple> strategy){
		List<Apple> rs = new ArrayList<Apple>();
	
		for(Apple apple : inventory) {
			if(strategy.test(apple)) {
				rs.add(apple);
			}
		}
		return rs;
	}
	
}
