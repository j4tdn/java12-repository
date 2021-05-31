package shopping;

import java.time.LocalDate;
import java.time.Month;

/**
 * 
 * Utility of Order class
 * Normally: Utility is place where contains utility method
 * No care created class's object
 * 
 */
public class OrderUtils {
	
	private OrderUtils() {
		
	}
	public static double export(Order order) {
		double totalofMoney = 0;
		ItemDetail[] ids = order.getItemDetail();
		// foreach
		for (ItemDetail id : ids) {
			Item item = id.getItem();
			int amount = id.getAmount();
			double idCost = item.getCost() * amount;
			if (item.getCost() > 590 && LocalDate.of(2021, Month.MAY, 8).isEqual(order.getDatetime().toLocalDate())) {
				totalofMoney += idCost * 0.9;
			} else {
				totalofMoney += idCost;
			}
		}

		return totalofMoney;
	}
	//static:    initial (allocate memory) at class loading time
	//non static:initial (allocate memory) at object loading time
	//static >> non-static
	
	//static call static -->ok
	//non static call static -> ok
	//non call non -> ok
	//static call non --> not ok
	//non         : call from object create by class (ex: ou)
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		OrderUtils ou = new OrderUtils();
		ou.calculate(a, b);
		System.out.println("result: "+ou.calculate(a, b));
	}
	private  int calculate(int a, int b) {
		return sub(a,b);
	}
	private static int sum(int a, int b) {
		return a+b;
	}
	
	private int sub(int a, int b) {
		return a-b;
	}
}
