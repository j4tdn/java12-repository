package utils;

import java.util.Arrays;
import java.util.List;

import bean.Dish;
import bean.Dish.Kind;

public class DishUtils {
	private DishUtils() {

	}

	public static List<Dish> getAll() {
		return Arrays.asList(new Dish("1", "D1", 308, Kind.FISH, false),
				new Dish("2", "D2", 620, Kind.OTHER, true),
				new Dish("3", "D3", 329, Kind.OTHER, true),
				new Dish("4", "D4", 302, Kind.MEAT, false),
				new Dish("5", "D5", 480, Kind.MEAT, false),
				new Dish("6", "D6", 480, Kind.MEAT, false),
				new Dish("7", "D7", 818, Kind.MEAT, false),
				
				new Dish("8", "D8", 302, Kind.MEAT, false),
				new Dish("9", "D9", 480, Kind.MEAT, false),
				new Dish("10", "D10", 480, Kind.MEAT, false),
				new Dish("11", "D11", 818, Kind.MEAT, false))
				
				;
		
	}
}