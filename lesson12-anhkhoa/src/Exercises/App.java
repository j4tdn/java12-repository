package Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
	public static void main(String[] args) {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");

		List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000), new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710), new Transaction(mario, 2012, 700), new Transaction(alan, 2012, 950));

		// Q1
		List<Transaction> Q1 = transactions.stream().filter(s -> s.getYear() == 2011)
				.sorted((o1, o2) -> o1.getValue() - o2.getValue()).collect(Collectors.toList());
		// Q2
		List<Transaction> Q2 = transactions.stream().filter(s -> s.getValue() > 300)
				.sorted((o1, o2) -> o1.getTrader().getCity().compareTo(o2.getTrader().getCity()))
				.collect(Collectors.toList());
		// Q3
		List<String> Q3 = transactions.stream().map(s->s.getTrader().getCity()).distinct().collect(Collectors.toList());
			
		// Q4
		List<Transaction> Q4 = transactions.stream().filter(s -> s.getTrader().getCity().equals("Cambridge"))
				.sorted((o1, o2) -> o2.getTrader().getName().length() - o1.getTrader().getName().length())
				.collect(Collectors.toList());
		// Q5
		List<String> Q5 = transactions.stream().map(s -> s.getTrader().getName()).sorted((o1, o2) -> o1.compareTo(o2))
				.collect(Collectors.toList());
		// Q6
		boolean Q6 = transactions.stream().filter(s -> s.getTrader().getCity() == "Milan").collect(Collectors.toList())
				.isEmpty();
		// Q7
		long Q7 = transactions.stream().filter(s -> s.getTrader().getCity() == "Milan").count();
		// Q8
		transactions.stream().filter(s -> s.getTrader().getCity().equals("Cambridge")).map(s -> s.getValue())
				.forEach(System.out::println);
		//Q9
		int Q9 = transactions.stream().max(Comparator.comparing(Transaction::getValue)).get().getValue();
		//Q10
		Transaction Q10 = transactions.stream()..min(Comparator.comparing(Transaction::getValue)).get();
	}
}
