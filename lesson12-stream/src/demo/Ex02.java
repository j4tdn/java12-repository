package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
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
		
		//anonymous class
		List<Apple> greenApple = filterApples(inventory, a -> "green".equals(a.getColor()));
		List<Apple> redApple = filterApples(inventory, a -> "red".equals(a.getColor()));
		List<Apple> wApple = filterApples(inventory, a -> a.getWeight() > 200);
		
		System.out.println("========Green Apples =======");
		CollectionUtils.printf(greenApple);
		System.out.println("========red Apples =======");
		CollectionUtils.printf(redApple);
		System.out.println("========w Apples =======");
		CollectionUtils.printf(wApple);
		
		System.out.println("=======Map Apples=========");
		//lambda expressions
		//get list of origin countries of apples
		Set<String>  countries = map(inventory, a -> a.getCountry());
		CollectionUtils.printf(countries);
		
		System.out.println("=======Map lengths=========");
		List<String> texts = Arrays.asList("abc", "abcde", "ab","asdasdas");
		Set<Integer> lengths = map(texts, s->s.length());
		CollectionUtils.printf(lengths);
		
		
	}
	
	private static <T, R> Set<R> map(List<T> ts, Function<T, R> func){
		Set<R> result = new HashSet<>();
		for(T t: ts) {
			result.add(func.apply(t));
		}
		return result;
	}
	

	//class >> abstract class
	//Lambda expression is a instance of Functional Interface
	//Functional Interface Name finame = Lambda expression
	private static List<Apple> filterApples(List<Apple> inventory, Strategy<Apple> strategy){
		List<Apple> result = new ArrayList<>(); 
		for(Apple apple : inventory) {
			if(strategy.behavior(apple)) {
				result.add(apple);
			}
		}
		return result;
	} 
}
