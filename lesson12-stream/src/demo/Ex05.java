package demo;

import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;

import bean.Apple;
import funtional.BiFuntion;
import funtional.BuFuntion;

public class Ex05 {
	public static void main(String[] args) {
		//Construction reference
		
		//Default constructor
		//Supplier<Apple> supplier = () -> new Apple();
		Supplier<Apple> supplier = Apple::new;
		Apple apple =supplier.get();
		System.out.println(apple);
		
		//full constructor
		BuFuntion<Apple, Integer, String, Double, String> buFuntion=Apple::new;
		Apple apple2=buFuntion.get(1, "green", 12d, "Vietnam");
		System.out.println(apple2);
		
		//Constructor with 2 params
		BiFuntion<Apple, Integer, String> biFuntion = Apple::new;
		Apple a3 = biFuntion.get(1, "VN");
		System.out.println(a3);
		
		
	}
}
