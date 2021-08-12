package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import bean.Apple;
import bean.WeightType;
import utils.AppleUtils;
import utils.CollectionUtils;

public class App {
	public static void main(String[] args) {
		List<Apple> inventory = AppleUtils.getAll();

		System.out.println("========= Green apple ========");
		List<Apple> greenApples = filterApples(inventory, "green");
		CollectionUtils.printf(greenApples);

		System.out.println("========= Red apple ========");
		List<Apple> redApples = filterApples(inventory, "red");
		CollectionUtils.printf(redApples);

		System.out.println("========= Heavier than 150g ========");
		List<Apple> heavyApples = filterApples(inventory, 150, WeightType.HEAVY);
		CollectionUtils.printf(heavyApples);

		System.out.println("========= Light than 200g ========");
		List<Apple> lightApples = filterApples(inventory, 200, WeightType.LIGHT);
		CollectionUtils.printf(lightApples);
		
		System.out.println("========= Green and heavy than 400g ========");
		List<Apple> greenHeavyApples = filterApples(inventory, 400, "green");
		CollectionUtils.printf(greenHeavyApples);

	}

	private static List<Apple> filterApples(List<Apple> inventory, String color) {
		List<Apple> result = new ArrayList<>();

		for (Apple apple : result) {
			if (color.equals(apple.getColor())) {
				result.add(apple);
			}
		}

		return result;
	}

	private static List<Apple> filterApples(List<Apple> inventory, double weight, WeightType type) {
		List<Apple> result = new ArrayList<>();

		switch (type) {
		case HEAVY: {
			for (Apple apple : inventory) {
				if (apple.getWeight() > weight) {
					result.add(apple);
				}
			}
			break;
		}

		case LIGHT: {
			for (Apple apple : inventory) {
				if (apple.getWeight() < weight) {
					result.add(apple);
				}
			}
			break;
		}
		}
		return result;
	}

	private static List<Apple> filterApples(List<Apple> inventory, double weight, String color) {
		Objects.requireNonNull(inventory, "inventory cannot be null!");
		Objects.requireNonNull(color, "color cannot be null!");
		
		
		List<Apple> results = new ArrayList<>();

		for (Apple apple : results) {
			if (apple.getColor().equals(color) && apple.getWeight() > weight) {
				results.add(apple);
			}
		}

		return results;
	}
}
