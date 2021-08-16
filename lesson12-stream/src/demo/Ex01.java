package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import bean.Apple;
import bean.WeightType;
import utils.AppleUtils;
import utils.CollectionUtils;

public class Ex01 {
	public static void main(String[] args) {
		List<Apple> inventory = AppleUtils.getAll();

		System.out.println("============find green/red apple=================");
		CollectionUtils.printf(filterColor(inventory, "green"));

		System.out.println("============find apple heavy greater than 150g=====");
		CollectionUtils.printf(filterHeavyApple(inventory, 150, WeightType.LIGHT));
		
		System.out.println("============Find Apple with weight and color=====");
		CollectionUtils.printf(filterApples(inventory, 150, "color"));
		
	}

	private static List<Apple> filterColor(List<Apple> inventory, String color) {
		List<Apple> result = new ArrayList<Apple>();
		for (Apple apple : inventory) {
			if (color.equals(apple.getColor())) {
				result.add(apple);
			}
		}
		return result;
	}

	private static List<Apple> filterHeavyApple(List<Apple> inventory, double weight, WeightType type) {
		List<Apple> result = new ArrayList<Apple>();
		switch (type) {
		case HEAVY: 
			for (Apple apple : inventory) {
				if (apple.getWeight()>weight) {
					result.add(apple);
				}
			}
			break;
		
		case LIGHT:
			for (Apple apple : inventory) {
				if (apple.getWeight()<weight) {
					result.add(apple);
				}
			}
			break;}
		return result;
	}
	private static List<Apple> filterApples(List<Apple> inventory, double weight, String color){
		Objects.requireNonNull(inventory, "Inventory cannot be null");
		Objects.requireNonNull(color,"color cannot be null");
		
		List<Apple> result = new ArrayList<Apple>();
		for(Apple apple : inventory) {
			if(apple.getWeight()>weight && color.equals(apple.getColor())) {
				result.add(apple);
			}
		}
		return result;
	}
	
}
