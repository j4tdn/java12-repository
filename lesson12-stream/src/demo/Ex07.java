package demo;

import java.util.List;
import java.util.stream.Stream;

import bean.Dish;
import bean.Dish.Kind;
import utils.DishUtils;

public class Ex07 {
	public static void main(String[] args) {
		List<Dish> menu = DishUtils.getAll();
		
		Stream<Dish> stream = menu.stream();
		stream.filter(d -> Kind.MEAT.equals(d.getKind())).forEach(System.out::println);;
	}
}
