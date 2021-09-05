import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.stream.Collectors;

public class App {
	public static void main(String[] args) {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Milan");
		Trader brian = new Trader("Brian", "Cambridge");
		List<Trader> traders = Arrays.asList(raoul, mario, alan, brian);
		List<Transaction> transactions = Arrays.asList(
				new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000),
				new Transaction(raoul, 2011, 100),
				new Transaction(mario, 2012, 710),
				new Transaction(mario, 2012, 700),
				new Transaction(alan, 2012, 950)
		);
		System.out.println("===============Q1===============");
		List<Transaction> q1 = transactions.stream()
										   .filter(i -> i.getYear() == 2011)
										   .sorted(Comparator.comparing(Transaction::getValue))
										   .collect(Collectors.toList());
		Utils.printf(q1);
		
		System.out.println("================Q2==============");
		List<Transaction> q2 = transactions.stream()
										   .filter(i -> i.getValue() > 300)
										   .sorted((o1, o2) -> o1.getTrader().getCity().compareTo(o2.getTrader().getCity()))
										   .collect(Collectors.toList());
		Utils.printf(q2);
		
		System.out.println("================Q3==============");
		Set<String> q3 = transactions.stream()
									  .map(Transaction::getTrader)
									  .map(Trader::getCity)
									  .collect(Collectors.toSet());
		Utils.printf(q3);
		System.out.println("================Q4============");	  
		List<Trader> q4= traders.stream()
						      .filter(i -> i.getCity() == "Cambridge")
						      .sorted((o1, o2) -> o2.getName().compareTo(o1.getName()))
						      .collect(Collectors.toList());
		Utils.printf(q4);
		
		System.out.println("================Q5==============");
		List<String> q5 = traders.stream()
							    .map(Trader::getName)
							    .sorted()
							    .collect(Collectors.toList());
		Utils.printf(q5);
		
		System.out.println("================Q6==============");
		boolean q6 = traders.stream()
							.anyMatch(i -> i.getCity() == "Milan");
		System.out.println("Are any traders based in Milan?: " + q6);
		
		System.out.println("================Q7==============");
		long q7 = traders.stream()
							.filter(i -> i.getCity() == "Milan")
							.count();
		System.out.println("Count the number of traders in Milan: " + q7);
		
		System.out.println("================Q8==============");
		transactions.stream()
					.filter(i -> i.getTrader().getCity() == "Cambridge")
					.map(Transaction::getValue)
					.distinct()
					.forEach(System.out::println);
		
		System.out.println("================Q9==============");
		Integer q9 = transactions.stream()
					.map(Transaction::getValue)
					.max(Comparator.comparing(Integer::valueOf))
                    .get();
		System.out.println("the highest value of all the transactions: " + q9);
		
		System.out.println("================Q10==============");
		Transaction q10 = transactions.stream()
									  .min(Comparator.comparing(Transaction::getValue))
									  .orElseThrow(NoSuchElementException::new);
		System.out.println("the transaction with the smallest value: " + q10);

	}	
}
