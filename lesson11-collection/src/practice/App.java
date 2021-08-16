package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import bean.Trader;
import bean.Transaction;
import utils.CollectionUtils;

public class App {
	public static void main(String[] args) {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		List<Trader> traders = Arrays.asList(raoul, mario, alan, brian);
		List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000), new Transaction(raoul, 2011, 400), 
				new Transaction(mario, 2012, 710),
				new Transaction(mario, 2012, 700), new Transaction(alan, 2012, 950));
		
		// Q1: 1.Find all transaction in the year 2012 and sort by value(small to high)
		List<Transaction> ty2012 = new ArrayList<>();
		for (Transaction tran : transactions) {
			if (tran.getYear() == 2012) {
				ty2012.add(tran);
			}
		}
		ty2012.sort(Comparator.comparing(Transaction::getValue));
		//tương đương:  ty2012.sort(Comparator.comparing(t->t.getValue()));
		CollectionUtils.printf(ty2012);
		
		System.out.println("=================================================");
		//Q2: Find all transiction have value greater than 30 sort them by trader's city asc
		List<Transaction> tv300 = new ArrayList<>();
		for (Transaction tran : transactions) {
			if (tran.getValue() > 300) {
				tv300.add(tran);
			}
		}
		Comparator<Transaction> comp= new Comparator<Transaction>() {
			@Override
			public int compare(Transaction o1, Transaction o2) {
				return o1.getTrader().getCity().compareTo(o2.getTrader().getCity());
			}
		};
		tv300.sort(comp);
		CollectionUtils.printf(tv300);
		
		System.out.println("====================================");
		//Q3: Find all unique(distinctly) city where trader work
		
		/*Set<String >cities =new HashSet<String>();
		for(Trader td: traders) {
			cities.add(td.getCity());
		}*/
		
		//cach2:
		List<String> cities=new ArrayList<String>();
		for(Trader td: traders) {
			if(!cities.contains(td.getCity())) {
				cities.add(td.getCity());
			}
		}
		
		for(String city: cities) {
			System.out.print(city+", ");
		}
		
		System.out.println("\n======================================");
		//Q3: find all trader from cambride and sort them by name desc
		List<Trader> tdCambrides =new ArrayList<Trader>();
		for(Trader td: traders) {
			if("Cambridge".equals(td.getCity())) {
				tdCambrides.add(td);
			}
		}
		
		/*Comparator<Trader> comp2=new Comparator<Trader>() {
			@Override
			public int compare(Trader o1, Trader o2) {
				// TODO Auto-generated method stub
				return o2.getName().compareTo(o1.getName());
			}
		};
		tdCambrides.sort(comp2);*/
		
		tdCambrides.sort(Comparator.comparing(Trader::getName,Comparator.reverseOrder()));
		CollectionUtils.printf(tdCambrides);
	}
	
	
}
