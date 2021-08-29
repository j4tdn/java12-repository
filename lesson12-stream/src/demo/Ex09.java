package demo;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import bean.Dish;
import utils.CollectionUtils;
import utils.DishUtils;

public class Ex09 {
	public static void main(String[] args) {
		List<Dish> menu = DishUtils.getAll();
		
		System.out.println("=============uniqueBy============");
		List<Dish> data = uniqueBy(menu, Dish::getCalories);
		CollectionUtils.printf(data);
		
		System.out.println("===========distinctBy============");
		Set<Double> caloriesStorage = new HashSet<>();
//		List<Dish> list = menu.stream()
//			.filter(d -> caloriesStorage.add(d.getCalories()))
//			.collect(Collectors.toList());
//		CollectionUtils.printf(list);
		List<Dish> list = distinctBy(menu, d -> d.getCalories());
		CollectionUtils.printf(list);
		
	}
	
	public static <T, R> List<T> distinctBy(List<T> list, Function<T, R> func){
		Set<R> storage = new HashSet<>();
		return list.stream()
				   .filter(item -> storage.add(func.apply(item)))
				   .collect(Collectors.toList());
	}

	public static <T, R> List<T> uniqueBy(List<T> list, Function<T, R> func){
		Map<R, List<T>> map = list.stream()
				.collect(Collectors.groupingBy(func));
		
		return map.entrySet()
				  .stream()
				  .filter(e -> e.getValue().size() == 1)
				  .map(e -> e.getValue().get(0))
				  .collect(Collectors.toList());
	}
}