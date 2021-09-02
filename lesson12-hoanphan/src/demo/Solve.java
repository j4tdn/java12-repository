package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import bean.Trader;
import bean.Transaction;
import utils.CollectionUtils;

public class Solve {

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
				new Transaction(alan, 2012, 950));
		
		System.out.println("========1========");
		// 1.Find all transaction in the year 2011 and sort by value(small to high)
		List<Transaction> ty2011 = transactions.stream().filter(a->a.getYear()==2011)
				.sorted(Comparator.comparing(Transaction::getValue)).collect(Collectors.toList());
		CollectionUtils.printf(ty2011);
		
		// 2.Find all transactions have value greater than 300 and sort them by trader’s city
		System.out.println("========2========");
		
		List<Transaction> tv300 = transactions.stream().filter(a->a.getValue() > 300)
				.sorted((t1,t2)-> t1.getTrader().getCity().compareTo(t2.getTrader().getCity())).collect(Collectors.toList());
		CollectionUtils.printf(tv300);
		
		//3.What are all the unique cities where the traders work?
		System.out.println("========3========");
		
		List<Trader> data = uniqueBy(traders, Trader::getCity);//getX X: properties
		CollectionUtils.printf(data);
		
		//4.Find all traders from Cambridge and sort them by name desc.
		System.out.println("========4========");
		
		List<Trader> trc = traders.stream().filter(a->a.getCity().equals("Cambridge"))
				.sorted(Comparator.comparing(Trader::getName,Comparator.reverseOrder())).collect(Collectors.toList());
		CollectionUtils.printf(trc);
		
		//5.Return a string of all traders’ names sorted alphabetically.
		System.out.println("========5========");
		
		List<Trader> Alltrc = traders.stream()
				.sorted(Comparator.comparing(Trader::getName)).collect(Collectors.toList());
		CollectionUtils.printf(Alltrc);
		
		//6.Are any traders based in Milan?
		System.out.println("========6========");
		
		boolean anyTrd = traders.stream().anyMatch(a->a.getCity().equals("Milan"));
	    System.out.println(anyTrd); 
		
	    //7.Count the number of traders in Milan.
	  	System.out.println("========7========");
	  		
	  	long count = traders.stream().filter(a -> a.getCity().equals("Milan")).count();
	    System.out.println("Count = " + count);
	    
	    //8.Print all transactions’ values from the traders living in Cambridge.
		System.out.println("========8========");
	    List<Transaction> travl = transactions.stream().filter(a -> a.getTrader().getCity().equals("Cambridge"))
				.collect(Collectors.toList());
		CollectionUtils.printf(travl);
	    
		//9.What’s the highest value of all the transactions?
		System.out.println("========9========");
		 Transaction max = transactions.stream()
	                .max(Comparator.comparing(Transaction::getValue))
	                .get(); 
		 System.out.println(max.getValue());
		 
		 //10. Find the transaction with the smallest value.
		System.out.println("========10========");
		Transaction min = transactions.stream()
                .min(Comparator.comparing(Transaction::getValue))
                .get(); 
		System.out.println(min.getValue());
		
	}
	
	public static <T,R> List<T> uniqueBy(List<T> list, Function<T,R> func){
		Map<R, List<T>> map = list.stream()
				.collect(Collectors.groupingBy(func));
		
		return map.entrySet() 
				.stream() 
				.filter(e -> e.getValue().size() == 1)
				.map(e -> e.getValue().get(0))
				.collect(Collectors.toList());
	
	}
}
