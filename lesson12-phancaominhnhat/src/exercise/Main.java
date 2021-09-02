package exercise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		
		List<Transaction> transactions = Arrays.asList(
				new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000),
				new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710),
				new Transaction(mario, 2012, 700),
				new Transaction(alan, 2012, 950)
		);
		
		// 1. Find all transactions in the year 2011 and sort them by value
		
		 List<Transaction> groupTransactions2011 = transactions.stream()
												 .filter(transaction -> transaction.getYear() == 2011)
												 .sorted(Comparator.comparingInt(Transaction::getValue))
												 .collect(Collectors.toList());
		 TransactionUtils.printf(groupTransactions2011);
		 
		// 2. Find all transactions have value greater than 300 and sort them by trader's city
		 System.out.println("---------------------------------------------------------------------");
		 
		 List<Transaction> groupTransactionsGreater300 = transactions.stream()
				 .filter(transaction -> transaction.getValue() > 300)
				 .sorted((o1 , o2) -> o1.getTrader().getCity().compareTo(o2.getTrader().getCity()))
				 .collect(Collectors.toList());
		 TransactionUtils.printf(groupTransactionsGreater300);
		 
		// 3. What are all the unique cities where the traders work?
		 System.out.println("---------------------------------------------------------------------");
		 List<String> uniqueCitys = transactions.stream()
				 .map(transaction -> transaction.getTrader().getCity())
				 .distinct()
				 .collect(Collectors.toList());
		 uniqueCitys.forEach(System.out::println);
		 
		// 4. Find all traders from Cambridge and sort them by name desc.
		 System.out.println("---------------------------------------------------------------------");
		 
		 List<Transaction> transactionFromCambridge = transactions.stream()
		 .filter(transaction -> transaction.getTrader().getCity() == "Cambridge")
		 .sorted((o1 , o2) -> o2.getTrader().getName().compareTo(o1.getTrader().getName()))
		 .collect(Collectors.toList());
		 TransactionUtils.printf(transactionFromCambridge);
		// 5. Return a string of all traders’ names sorted alphabetically.
		 System.out.println("---------------------------------------------------------------------");
		 
		 List<String> nameTraders = transactions.stream()
				 .map(transaction -> transaction.getTrader().getName())
				 .sorted((o1,o2) -> o1.compareTo(o2))
				 .collect(Collectors.toList());
		nameTraders.forEach(System.out::println);
		 
		// 6. Are any traders based in Milan?
		 System.out.println("---------------------------------------------------------------------");
		 
		 Boolean hasTraderInMilan = transactions.stream()
				 .anyMatch(transaction -> transaction.getTrader().getCity() == "Milan");
		 System.out.println(hasTraderInMilan);
		 
		// 7. Count the number of traders in Milan.
		 System.out.println("---------------------------------------------------------------------");
		 
		 long numberOfTradersInMilan = transactions.stream()
				 .map(transaction -> transaction.getTrader())
				 .filter(trader -> trader.getCity() == "Milan")
				 .distinct()
				 .count();
		 System.out.println(numberOfTradersInMilan);
		 
		// 8. Print all transactions'values from the traders living in Cambridge.
		 System.out.println("---------------------------------------------------------------------");
		 
		 List<Integer> transactionsValue = transactions.stream()
				 .filter(transaction -> transaction.getTrader().getCity() == "Cambridge")
				 .map(Transaction::getValue)
				 .collect(Collectors.toList());
		 transactionsValue.forEach(System.out::println);
		 
		// 9. What’s the highest value of all the transactions?
		 System.out.println("---------------------------------------------------------------------");
		 
		  OptionalInt highestValue = transactions.stream()
				 .mapToInt(Transaction::getValue)
				 .max();
		  System.out.println("The highlest value of all the transaction is: " + highestValue.getAsInt());
		  
		// 10. Find the transaction with the smallest value.
		 System.out.println("---------------------------------------------------------------------");
		 
		 Optional<Transaction> optTransactionValueMin = transactions.stream()
				 .reduce(TransactionUtils::minValue);
		 System.out.println(optTransactionValueMin.get());
	}
}
