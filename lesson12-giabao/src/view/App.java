package view;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import bean.Trader;
import bean.Transaction;
import utils.Utils;

import static java.util.Comparator.*;

public class App {
	public static void main(String[] args) {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");

		List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000), new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710), new Transaction(mario, 2012, 700), new Transaction(alan, 2012, 950));

		// 1. Find all transactions in the year 2011 and sort them by value (small to
		// high).
		System.out.println("============Ex01============");
		transactions.stream().filter(p -> p.getYear() == 2011).sorted(comparing(Transaction::getValue))
				.forEach(System.out::println);

		// 2. Find all transactions have value greater than 300 and sort them by
		// trader’s city
		System.out.println("============Ex02============");
		transactions.stream().filter(p -> (p.getValue() >= 300))
				.sorted((a, b) -> a.getTrader().getCity().compareTo(b.getTrader().getCity()))
				.forEach(System.out::println);

		// 3. What are all the unique cities where the traders work?
		System.out.println("============Ex03============");
		transactions.stream().map(p -> p.getTrader().getCity()).distinct().forEach(System.out::println);

		// 4. Find all traders from Cambridge and sort them by name desc.
		System.out.println("============Ex04============");
		List<Trader> listOfEx04 = transactions.stream().map(Transaction::getTrader)
				.filter(p -> "Cambridge".equals(p.getCity())).sorted(comparing(Trader::getName)).distinct()
				.collect(Collectors.toList());
		Collections.reverse(listOfEx04);
		Utils.printf(listOfEx04);

		// 5. Return a string of all traders’ names sorted alphabetically.
		System.out.println("============Ex05============");
		transactions.stream().map(p -> p.getTrader().getName()).sorted().distinct().forEach(System.out::println);
		;

		// 6. Are any traders based in Milan?
		// 7. Count the number of traders in Milan.
		System.out.println("============Ex06============");
		long count = transactions.stream().map(Transaction::getTrader)
					.filter(p->"Milan".equals(p.getCity()))
					.distinct()
					.count();
		if(count>0) {
			System.out.println("Yes. Some traders based in Milan");
		} else {
			System.out.println("Nobody based in Milan");
		}
		System.out.println("============Ex07============");
		System.out.println("The number of traders in Milan: " + count);
		
		// 8. Print all transactions’ values from the traders living in Cambridge.
		System.out.println("============Ex08============");
		transactions.stream().filter(p->"Cambridge".equals(p.getTrader().getCity()))
							.forEach(System.out::println);
		
		// 9. What’s the highest value of all the transactions?
		System.out.println("============Ex09============");
		Optional<Integer> highestValue = transactions.stream().map(Transaction::getValue)
											.reduce(Integer::max);
		highestValue.ifPresent(System.out::println);
		
		// 10. Find the transaction with the smallest value.
		System.out.println("============Ex10============");
		Optional<Transaction> smallestValue = transactions.stream()
											.reduce((a,b)->a.getValue() <b.getValue() ? a: b);
		smallestValue.ifPresent(System.out::println);					

	}
}
