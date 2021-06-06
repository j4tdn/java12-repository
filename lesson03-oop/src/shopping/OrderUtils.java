package shopping;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;

/**
 * Utility of Order Class
 * Normally: Utility is place where contains utility methods
 * No cares created class's objects
 */
public class OrderUtils {
	
	private OrderUtils() {
	}
	
	// o1, o2, o3
	public static double export(Order order) {
		double totolOfMoney = 0;
		ItemDetail[] ids = order.getItemDetails();
		for (ItemDetail id : ids) {
			Item item = id.getItem();
			int quantity = id.getQuantity();
			double idCost = item.getCost() * quantity;
			if (item.getCost() > 590 && LocalDate.of(2021, Month.MAY, 8).isEqual(order.getOrderDate().toLocalDate())) {
				idCost *= 0.9;
			}
			totolOfMoney += idCost;
		}
		return totolOfMoney;
	}
	
	//     static: initial(allocate memory) at class loading time
	// non-static: initial(allocate memory) at object loading time
	// static >> non-static
	
	// static - CALL - static: YES
	// non    - CALL - non   : YES
	// static - CALL - non   : NO
	// non    - CALL - static: YES
	// non                   : Call from object
	
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		
		OrderUtils ou = new OrderUtils();
		System.out.println("result: " + ou.calculate(a, b));
	}
	
	private int calculate(int a, int b) {
		// sum
		return sum(a, b);
	}
	
	private static int sum(int a, int b) {
		return a + b;
	}
	
	private int sub(int a, int b) {
		return a - b;
	}
}
