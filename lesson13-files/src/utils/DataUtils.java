package utils;

import java.util.Arrays;
import java.util.List;

import common.Trader;
import common.Transaction;

public class DataUtils {
	public static List<Trader> getTrader() {
		Trader raoul = new Trader("", "Milan");
		Trader mario = new Trader("", "Milan");
		Trader brian = new Trader("", "Cambrigde");
		Trader vahein = new Trader("", "Cambrigde");
		Trader alan = new Trader("", "Milan");
		
		return Arrays.asList(raoul,mario,brian,vahein,alan);
	}
	
//	public static List<Transaction> getTransaction() {
//		
//	}
}
