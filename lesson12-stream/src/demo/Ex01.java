package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import bean.Apple;
import utils.AppleUtils;
import utils.CollectionUtils;

public class Ex01 {
	public static void main(String[] args) {
		// input data
		List<Apple> iventory = AppleUtils.getAll();	
				
		System.out.println("====== Green Apples =====");
		List<Apple> greenApples = filterApples(iventory, i -> "green".equals(i.getColor()));
		CollectionUtils.printf(greenApples);
		
		System.out.println("====== Red Apples =====");
		List<Apple> redApples = filterApples(iventory, i -> "red".equals(i.getColor()));
		CollectionUtils.printf(redApples);
		
		System.out.println("====== Heavy Apples =====");
		List<Apple> heavyApples = filterApples(iventory, i -> i.getWeight() > 150);
		CollectionUtils.printf(heavyApples);
		
		System.out.println("====== Light Apples =====");
		List<Apple> lightApples = filterApples(iventory, i -> i.getWeight() < 200);
		CollectionUtils.printf(lightApples);
		
		System.out.println("====== Weight and Color Apples =====");
		List<Apple> greenLightApples = filterApples(iventory, i -> i.getWeight() < 400 && "green".equals(i.getColor()));
		CollectionUtils.printf(greenLightApples);
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
