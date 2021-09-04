package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import bean.Trader;
import utils.FileUtils;


public class Ex06 {
	
	/**
	 * Compsing Predicate- use and, or, negative:      pre1.and/or(pre2).negate()     
	 * Example constructor references
	 * 
	 * Composing Functional- andThen, compose:         func1.endThen/compose(func2)            
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> lines = FileUtils.readLines("trader.txt");

		List<Trader> traders = convert(lines, Trader::transfer);
		List<Trader> traders2 = convert(lines, Trader::new);

		traders.forEach(System.out::println);

		System.out.println("=================");
		traders2.forEach(System.out::println);

		System.out.println("\n=========Trader living in MiLan or LonDon=========");
		Predicate<Trader>pre = trader-> trader.getCity().equals("London");
		List<Trader> traders3=find1(lines, Trader::transfer, pre.or(trader->trader.getCity().equals("Milan")) );
		traders3.forEach(System.out::println);
		
		System.out.println("\n=========Trader not living in MiLan or LonDon=========");
		List<Trader> traders4=find1(lines, Trader::transfer, pre.or(trader->trader.getCity().equals("Milan")).negate() );
		traders4.forEach(System.out::println);
	}

	private static <T> List<T> find1(List<String> lines, Function<String, T> function, Predicate<T> pre) {
		List<T> result = new ArrayList<T>();
		for (String line : lines) {
			T trd = function.apply(line);
			if (pre.test(trd)) {
				result.add(trd);
			}
		}
		return result;
	}

	private static <T> List<T> convert(List<String> lines, Function<String, T> function) {
		List<T> result = new ArrayList<T>();
		for (String line : lines) {
			T t = function.apply(line);
			if (t != null) {
				result.add(t);
			}
		}
		return result;
	}

}
