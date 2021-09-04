package demo;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import bean.Dish;
import bean.Dish.Kind;
import utils.DishUtils;

public class Ex07 {
	public static void main(String[] args) {
		Predicate<Dish> pre=x->Kind.MEAT.equals(x.getKind()) ;
		
		List<Dish> menu = DishUtils.getAll();
		Stream<Dish> stream = menu.stream();
		stream.filter(pre.and(x->x.getCalories()>400))
		.forEach(System.out::println);
		
		//stream.forEach(System.out::println);   Câu lệnh này ko chạy 
		//được vì stream chỉ có thể duyệt một lần thôi, ko rewatch đc
		
		
		System.out.println("===========================================");
		Stream<Dish> stream2 = menu.stream();
		List<String> name = stream2.filter(dish -> Kind.MEAT.equals(dish.getKind()))
				.map(Dish::getName)
				.collect(Collectors.toList());
		name.forEach(System.out::println);
		
	}
}
