package demo;

import java.util.List;

import bean.Dish;
import bean.Dish.Kind;
import utils.DishUtils;

public class Ex07 {
	public static void main(String[] args) {
		// Stream is "sequences of elements from SOURCE that helps manipulate collection of data"
		List<Dish> menu = DishUtils.getAll();
		
		menu.stream()
				.filter(dish -> {
					System.out.println("filter: " + dish.getName());
					return Kind.MEAT.equals(dish.getKind());
				})
				.map(dish -> {
					System.out.println("map: " + dish.getName());
					return dish.getName();
				})
				.toArray(String[]::new);
		
//		meatDishes.forEach(System.out::println);
		
	}
}
