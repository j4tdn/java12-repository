package demo;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.sun.net.httpserver.Filter;

import bean.Dish;
import utils.CollectionUtils;
import utils.DishUtils;

public class Ex09 {
	/**
	 * select unique dish' calories from menu
	 */
	public static void main(String[] args) {
		List<Dish> menu = DishUtils.getAll();
		
		List<Dish> result = menu.stream().filter(dish -> Collections.frequency(menu, dish) == 1) //frequency sử dụng hàm equal nên ta phải override lại nó
				.collect(Collectors.toList());
		CollectionUtils.printf(result);

		System.out.println("======================");
		List<Dish> data = uniqueBy(menu, Dish::getCalories);
		data.forEach(System.out::println);

		System.out.println("======================");

		List<Dish> list = distinctBy(menu, Dish::getCalories);
		CollectionUtils.printf(list);
	}

	//Chọn các đĩa, nếu đĩa nào có calories bằng nhau thì hiện 1 lần
	public static <T, R> List<T> distinctBy(List<T> list, Function<T, R> func) {
		Set<R> caloriesStorage = new LinkedHashSet<>();
		return list.stream()
					.filter(item -> caloriesStorage.add(func.apply(item))) //Set.add return boolean
					.collect(Collectors.toList());
	}

	
	//Chọn các đĩa chỉ xuất hiện 1 lần
	public static <T, R> List<T> uniqueBy(List<T> list, Function<T, R> func) {
		Map<R, List<T>> map = list.stream()
								  .collect(Collectors.groupingBy(func)); //Nếu chỉ truyền 1 tham số thì tham số thứ 2 sẽ là List, xem thêm ở ex08
		return map.entrySet().stream()
							.filter(entry -> entry.getValue().size() == 1) 
							.map(entry -> entry.getValue().get(0))      //get first element
							.collect(Collectors.toList());
	}
	
	

}
