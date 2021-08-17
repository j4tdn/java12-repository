package demo;

//import java.util.function.BiFunction;
import java.util.function.Supplier;

import bean.Apple;
import functional.BuFunction;
import functional.BiFunction;

public class Ex05 {
	public static void main(String[] args) {
		// Constructor reference
		Supplier<Apple> supplier = Apple::new;
		Apple a1 = supplier.get();
		System.out.println(a1);
		
		
		// Full constructor
		BuFunction<Apple, Integer, String, Double, String> buFunction = Apple::new;
		Apple a2 = buFunction.get(1, "black", 12d, "Vietnam");
		System.out.println(a2);

		BiFunction<Integer, String, Apple> biFunction = Apple::new;
		Apple a3 = biFunction.get(2, "Thailand");
		System.out.println(a3);
	}
}
