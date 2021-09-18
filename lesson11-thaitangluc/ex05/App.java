package ex05;

import java.util.Map;

public class App {
	public static void main(String[] args) {
		Map<String, Integer> expenses = Spend.create();
		System.out.println("List expenses over 500: ");
		Spend.listed(expenses);
		System.out.println("Sort expenses in ascending order of expenses");
		Spend.sortKey(expenses, (e1, e2) -> e1.getKey().compareTo(e2.getKey()));
		System.out.println("Sort expenses in descending order by amount");
		Spend.sortKey(expenses, (e1, e2) -> e1.getValue().compareTo(e2.getValue()));
	}
}
