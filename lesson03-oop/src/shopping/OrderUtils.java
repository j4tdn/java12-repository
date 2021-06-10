package shopping;

import java.time.LocalDate;
import java.time.Month;

/**
 * Utility of Order class
 * Normally: Utility is  place where contains utility methods
 * Don't care created class's objects
 */

public class OrderUtils {
	public static double export(Order order) {
		double totalOfMoney = 0;
		ItemDetail[] ids = order.getItemDetails();
		for (ItemDetail id : ids) {
			Item item = id.getItem();
			int quantity = id.getQuantity();
			double idCost = item.getCost() * quantity;
			if (item.getCost() > 590 && LocalDate.of(2021, Month.MAY, 8).isEqual(order.getOderDate().toLocalDate())) {
				totalOfMoney += idCost * 0.9;
			} else {
				totalOfMoney += idCost;
			}
		}
		return totalOfMoney;
	}
	
	// static    : initial(allocate memory) at class loading time
	// non-static: initial(allocate memory) at object loading time
	// static >> non-static
	
	// static - CALL - static: YES
	// non    - CALL - non   : YES
	// static - CALL - non   : NO
	// non    - CALL - static: YES
	// non 				     : Call from object
	
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		
		OrderUtils ou = new OrderUtils();
		System.out.println("result: " + ou.calculate(a, b));
	}
	
	private int calculate(int a, int b) {
		// sub
		return sub(a, b);
	}
	
	private static int sum(int a, int b) {
		return a + b;
	}
	
	private int sub(int a, int b) {
		return a - b;
	}
}
