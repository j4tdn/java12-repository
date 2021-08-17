package demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

import bean.Apple;
import bean.Strategy;
import utils.AppleUtils;
import utils.CollectionUtils;

public class Ex02 {
	public static void main(String[] args) {
		List<Apple> inventory = AppleUtils.getAll();
		
		System.out.println("========= Green apple ========");
		List<Apple> greenApples = filterApples(inventory, apple -> "green".equals(apple.getColor()));
		CollectionUtils.printf(greenApples);
		System.out.println("========= Red apple ========");
		System.out.println("========= Heavier than 150g ========");
		System.out.println("========= Light than 200g ========");
		System.out.println("========= Green and heavy than 400g ========");

		
		System.out.println("============Map Apples===========");
		//lambda expression
		//get list of origin countries of apple
//		Set<String> colors = map(inventory, a -> a.getColor());
		
		Set<String> countries = map(inventory, a -> a.getColor());
		CollectionUtils.printf(countries);
		
	}
	
	/**
	 * requiremnent : input T t , output R  
	 * -> use Function (functional interface)
	 */
	private static <T, R> Set<R> map(List<T> ts, Function<T, R> func) { 
		Set<R> results = new HashSet<>();
		
		for (T t : ts) {
			results.add(func.apply(t));
		}
		
		return results;
	}
	
	private static List<Apple> filterApples(List<Apple>	inventory, Strategy strategy) {
		List<Apple> results = new ArrayList<>();
		
		for (Apple apple : results) {
			if (strategy.behavior(apple)) {
				results.add(apple);
			}
		}
		
		return results;
	}
}
