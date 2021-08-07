package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;

import utils.CollectionUtils;


public class App {
	// traders executing transactions
	public static void main(String[] args) {

		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		List<Trader> traders = Arrays.asList(raoul, mario, alan, brian);
		List<Transaction> transactions = Arrays.asList(
				new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000),
				new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710),
				new Transaction(mario, 2012, 700),
				new Transaction(alan, 2012, 950)
		);
		
		// ex01
		List<Transaction> ex01 = new ArrayList<>();
		for (Transaction i: transactions) {
			if (i.getYear() == 2011) {
				ex01.add(i);
			}
		}
		
		ex01.sort(Comparator.comparing(Transaction::getValue));
		CollectionUtils.printf(ex01);
		
		System.out.println("===================");
		
		// ex02
		List<Transaction> ex02 = new ArrayList<>();
		for (Transaction i: transactions) {
			if (i.getValue() > 300) {
				ex02.add(i);
			}
		}
		
		ex02.sort(Comparator.comparing(t -> t.getTrader().getCity()));
		CollectionUtils.printf(ex02);
		
		System.out.println("===================");
		
		// ex03
		Set<String> ex03 = new HashSet<>();
		for (Trader i: traders) {
			ex03.add(i.getCity());
		}
		
		for (String i: ex03) {
			System.out.println(i);
		}
		
		System.out.println("===================");
		
		// ex04
		List<Trader> ex04 = new ArrayList<>();
		for (Trader i: traders) {
			if ("Cambridge".equals(i.getCity())) {
				ex04.add(i);
			}
		}
		ex04.sort(Comparator.comparing(Trader::getName, Comparator.reverseOrder()));
		CollectionUtils.printf(ex04);
	}


}
