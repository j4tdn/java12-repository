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

public class Ex01 {
	public static void main(String[] args) {
		// input data
		List<Apple> inventory = AppleUtils.getAll();	
		
		System.out.println("====== Green Apples =====");
		List<Apple> greenApples = filterApples(inventory, i -> "green".equals(i.getColor()));
		CollectionUtils.printf(greenApples);
		
		System.out.println("====== Red Apples =====");
		List<Apple> redApples = filterApples(inventory, i -> "red".equals(i.getColor()));
		CollectionUtils.printf(redApples);
		
		System.out.println("====== Heavy Apples =====");
		List<Apple> heavyApples = filterApples(inventory, i -> i.getWeight() > 150);
		CollectionUtils.printf(heavyApples);
		
		System.out.println("====== Light Apples =====");
		List<Apple> lightApples = filterApples(inventory, i -> i.getWeight() < 200);
		CollectionUtils.printf(lightApples);
		
		System.out.println("====== Weight and Color Apples =====");
		List<Apple> greenLightApples = filterApples(inventory, i -> i.getWeight() < 400 && "green".equals(i.getColor()));
		CollectionUtils.printf(greenLightApples);
		
		System.out.println("====== Map Apples ======");
		// Lambda expressions
		// Get list of origin countries of apples
		Set<String> colors = map(inventory, a -> a.getColor());
		CollectionUtils.printf(colors);
		
		
	}
	
	private static <T, R> Set<R> map(List<T> ts, Function<T, R> function) {
		Set<R> result = new HashSet<>();
		
		for (T t: ts) {
			result.add(function.apply(t));
		}
		
		return result;
	}
	
	// Lambda expression is a instance of Functional Interface
	private static List<Apple> filterApples(List<Apple> iventory, Predicate<Apple> predicate) {
		List<Apple> result = new ArrayList<>();
		
		for (Apple apple: iventory) {
			if (predicate.test(apple)) {
				result.add(apple);
			}
		}
		
		return result;
	}
}
