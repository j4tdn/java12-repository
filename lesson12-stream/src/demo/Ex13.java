package demo;

import java.util.List;
import java.util.Optional;

import bean.Dish;
import utils.DishUtils;

public class Ex13 {
	public static void main(String[] args) {
		List<Dish> menu = DishUtils.getAll();
		
		double sumOfCal = menu.stream().map(Dish::getCalories).reduce(0d, Double::sum);
		System.out.println("SumOfcalories: " + sumOfCal);
		//Primitive Strean: IntStream,LongStream
		
		double priSumOfCal = menu.stream().mapToDouble(Dish::getCalories).sum();
		System.out.println("priSum: " + priSumOfCal);
		
		//how could you find dish with maxium calories
		Optional<Dish> dishOpt = menu.stream()
				.reduce((d1,d2)->d1.getCalories()<d2.getCalories()?d1:d2);
		dishOpt.ifPresent(System.out::println);
	}
}
