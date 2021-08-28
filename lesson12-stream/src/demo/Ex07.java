package demo;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import bean.Dish;
import bean.Dish.Kind;
import utils.DishUtils;

public class Ex07 {
	public static void main(String[] args) {
		List<Dish> menu = DishUtils.getAll();
		Stream<Dish> stream = menu.stream();
		stream.filter(dish -> Kind.MEAT.equals(dish.getKind()))
		.forEach(System.out::println);
		
		
		System.out.println("===========================================");
		Stream<Dish> stream2 = menu.stream();
		List<String> name = stream2.filter(dish -> Kind.MEAT.equals(dish.getKind()))
				.map(Dish::getName)
				.collect(Collectors.toList());
		name.forEach(System.out::println);
	}
	

}
