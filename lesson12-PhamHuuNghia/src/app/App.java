package app;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import bean.Trader;
import bean.Transaction;

public class App {
	public static void main(String[] args) {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		Trader viet = new Trader("viet", "VN");
		
		List<Trader> traders=Arrays.asList(raoul,mario,alan,brian,viet);
		List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000), new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710), new Transaction(mario, 2012, 700), new Transaction(alan, 2012, 950));
	
		
		
		
		//1. Find all transactions in the year 2011 and sort them by value (small to high).
		
		List<Transaction> trans1 = transactions.stream()
												.filter(trans->trans.getYear()==2011)
												.sorted(Comparator.comparing(Transaction::getValue))
												.collect(Collectors.toList());
		/*List<Transaction> trans1 = transactions.stream().filter(trans->trans.getYear()==2011).sorted((o1,o2)-> o1.getValue()-o2.getValue()).collect(Collectors.toList());*/
		trans1.forEach(System.out::println);
		
		
		
		//2. Find all transactions have value greater than 300 and sort them by trader’s city
		System.out.println("=====================================================");
		List<Transaction> trans2 = transactions.stream()
												.filter(trans->trans.getValue()>300)
												.sorted((o1,o2)->o1.getTrader().getCity().compareTo(o2.getTrader().getCity()))
												.collect(Collectors.toList());
		trans2.forEach(System.out::println);
		
		
		//3. What are all the unique cities where the traders work?
		System.out.println("=====================================================");
		List<String> cites = uniqueCities(traders, Trader::getCity);
		cites.forEach(System.out::println);
		
		
		//4. Find all traders from Cambridge and sort them by name desc.
		System.out.println("=====================================================");
		List<Trader> trd4 = traders.stream().filter(trd->"Cambridge".equals(trd.getCity()))
											.sorted(Comparator.comparing(Trader::getName).reversed())
											.collect(Collectors.toList());
		trd4.forEach(System.out::println);
		
		
		//5. Return a string of all traders’ names sorted alphabetically.
		System.out.println("=====================================================");
		List<String> names = traders.stream().sorted(Comparator.comparing(Trader::getName))
											.map(trd->trd.getName())
											.collect(Collectors.toList());
		names.forEach(System.out::println);
		
		//6. Are any traders based in Milan?
		System.out.println("=====================================================");
		boolean isBaseMilan = traders.stream().allMatch(trd -> "Milan".equals(trd.getCity()));
		System.out.println(isBaseMilan);
		
		
		//7. Count the number of traders in Milan.
		System.out.println("=====================================================");
		long nbrsTradersOM = traders.stream().filter(trd -> "Milan".equals(trd.getCity())).count();
		System.out.println("number of traders in Milan: "+nbrsTradersOM);
		
		//8. Print all transactions’ values from the traders living in Cambridge.
		System.out.println("=====================================================");
		List<Integer> values = transactions.stream()
										   .map(Transaction::getValue)
										   .collect(Collectors.toList());
		values.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.print(t+", ");
			}
		});
		
		
		//9. What’s the highest value of all the transactions
		System.out.println("\n=====================================================");
		int max=transactions.stream()
							.max(Comparator.comparing(Transaction::getValue))
							.get()
							.getValue();
		System.out.println("Max value: "+max );
		
		//10. Find the transaction with the smallest value.
		System.out.println("=====================================================");
		int min=transactions.stream()
							.min(Comparator.comparing(Transaction::getValue))
							.get()
							.getValue();
		System.out.println("Max value: "+min );
	}
	
	private static List<String> uniqueCities(List<Trader> list, Function<Trader, String> func){
		
		 Map<String, List<Trader>> map = list.stream()
				 							.collect(Collectors.groupingBy(func));
		 
		 return map.entrySet().stream()
							 .filter(entry->entry.getValue().size()==1)
							 .map(entry->entry.getValue().get(0).getCity())
							 .collect(Collectors.toList());
	 }
	
}
