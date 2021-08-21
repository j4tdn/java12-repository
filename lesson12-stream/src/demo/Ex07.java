package demo;

import java.util.List;
<<<<<<< HEAD
=======
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
>>>>>>> 52aff08 (lesson12-stream 21-08-2021)

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
		
<<<<<<< HEAD
//		meatDishes.forEach(System.out::println);
		
=======
		List<Double> uniqueDish = menu.stream()
				.collect(Collectors.groupingBy(Dish::getCalories, Collectors.counting()))
				.entrySet()
				.stream()
				.filter(calo -> calo.getValue() == 1)
				.map(Entry::getKey)	
				.collect(Collectors.toList());
		
		System.out.println(uniqueDish);
>>>>>>> 52aff08 (lesson12-stream 21-08-2021)
	}
}
