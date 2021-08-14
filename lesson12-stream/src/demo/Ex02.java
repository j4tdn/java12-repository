package demo;

import java.util.List;

import bean.Apple;
import utils.AppleUtils;

public class Ex02 {
	public static void main(String[] args) {
		List<Apple> inventory = AppleUtils.getAll();
	}

	/**
	 * Get apples with given codition
	 * 
	 * @param inventory input data
	 * @param behavior  given condition
	 * @return output data
	 */
//	private static List<Apple> filterApples(List<Apple> inventory, datatype behavior) {
//		List<Apple> result = new ArrayList<>();
//		for (Apple apple: inventory) {
//			if (behavior(apple)) {
//				result.add(apple)
//			}
//		}
//		
//		return result;
//	}
}
