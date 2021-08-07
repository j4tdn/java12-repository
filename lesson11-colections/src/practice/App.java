package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

import bean.Trader;
import bean.Transaction;

public class App {
	// traders executing transactions
	public static void main(String[] args) {

		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		List<Trader> traders = Arrays.asList(raoul, mario, alan, brian);
		List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000), new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710), new Transaction(mario, 2012, 700), new Transaction(alan, 2012, 950));

		// Q1: 1.Find all transaction in the year 2011 and sort by value(small to high)
		List<Transaction> ty2011 = new ArrayList<Transaction>();
		for (Transaction tran : transactions) {
			if (tran.getYear() == 2011) {
				ty2011.add(tran);
			}
		}
		ty2011.sort(Comparator.comparing(Transaction::getValue));
		utils.CollectionUtils.printf(ty2011);

		// Q2: 2.Find
		System.out.println("======================");
		List<Transaction> t300 = new ArrayList<Transaction>();
		for (Transaction tran : transactions) {
			if (tran.getValue() > 300)
				t300.add(tran);
		}
		Comparator<Transaction> comp = new Comparator<Transaction>() {
			@Override
			public int compare(Transaction o1, Transaction o2) {
				return o1.getTrader().getCity().compareTo(o2.getTrader().getCity());
			}
		};
		t300.sort(comp);
		utils.CollectionUtils.printf(t300);
		
		//Q3: Find
		System.out.println("======================");
		Set<String> cities = new HashSet<String>();
		for(Trader tra : traders) {
			cities.add(tra.getCity());
		}
		
		for(String citi : cities) {
			System.out.println(citi);
		}
		
		//Q4:
		System.out.println("======================");
		List<Trader> tCam = new ArrayList<Trader>();
		for (Trader tra : traders) {
			if (tra.getCity().equals("Cambridge"))
				tCam.add(tra);
		}
		Comparator<Trader> comp1 = new Comparator<Trader>() {
			@Override
			public int compare(Trader o1, Trader o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};
		tCam.sort(comp1);
		utils.CollectionUtils.printf(tCam);
		
		//Q5:
		
	}

}
