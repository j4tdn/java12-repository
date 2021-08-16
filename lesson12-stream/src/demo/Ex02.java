package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

import bean.Apple;
import bean.Strategy;
import utils.AppleUtils;
import utils.CollectionUtils;

public class Ex02 {
	public static void main(String[] args) {
		List<Apple> inventory = AppleUtils.getAll();

		CollectionUtils.printf(filterApples(inventory, apple -> "green".equals(apple.getColor())));
		System.out.println("==============================");
		CollectionUtils.printf(filterApples(inventory, apple -> apple.getWeight() > 150));
		System.out.println("==============================");
		CollectionUtils.printf(filterApples(inventory, apple -> apple.getWeight() > 150 && "green".equals(apple.getColor())));
		
		System.out.println("==============================");
		System.out.println(map(inventory, apple -> apple.getCountry()));
		
		
		System.out.println("==============================");
		List<String> sequences= Arrays.asList("asd","vs","avcx","aaaaa","a");
		System.out.println(map(sequences, s -> s.length()));
	}

	/**
	 * @param <R>: kiểu của tham số trả về
	 * @param <T>: kiểu của tham số cần truyền vào
	 */
	private static<R,T> Set<R> map(List<T> ts,Function<T, R> function){
		Set<R> result=new LinkedHashSet<>();
		for(T t : ts) {
			result.add(function.apply(t));
		}
		return result;
	}
	
	/**
	 * Get apple wwith given condition
	 * 
	 * @param inventory input data
	 * @param behavior  given condition
	 * @return output data
	 */
	private static <E> List<E> filterApples(List<E> inventory, Strategy<E> behavior) {
		List<E> rs = new ArrayList<>();
		for (E e : inventory) {
			if (behavior.behavior(e)) {
				rs.add(e);
			}
		}
		return rs;
	}
}
