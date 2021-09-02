package exercise;

import java.util.List;

public class TransactionUtils {
	public static void printf(List<Transaction> transactions) {
		transactions.forEach(System.out::println);
	}
	
	public static Transaction minValue (Transaction t1, Transaction t2) {
		return t1.getValue() < t2.getValue() ? t1 : t2;
	}
}
