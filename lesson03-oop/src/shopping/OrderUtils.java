package shopping;

import java.time.LocalDate;
import java.time.Month;

/**
 * Utility of Order Class
 * Normally: Utility is place where contains utility methods
 *No Care created class's objects
 */
public class OrderUtils {
	private OrderUtils() {
		// TODO Auto-generated constructor stub
	}
	//o1,o2,o3
	public static double export(Order order) {
		double totalOfMoney = 0;
		ItemDetail[] ids = order.getItemDetails();
		for (ItemDetail id : ids) {
			Item item = id.getItem();
			int quantity = id.getQuantity();
			double idCost = item.getCost() * quantity;
			if (item.getCost() > 590 && LocalDate.of(2021, Month.MAY, 8).isEqual(order.getOrderDate().toLocalDate()))
				idCost *= 0.9;
			totalOfMoney += idCost;
			// totalOfMoney+=id.getItem().getCost()*id.getQuantity();
		}
		return totalOfMoney;
	}
	
	//static call static :yes
	//non    call non    yes
	//static call non    no
	//non call static    yes
	public static void main(String[] args) {
		int a=5,b=10;
		OrderUtils ou=new OrderUtils();
		System.out.println(ou.calculate(a, b));
	}
	private int calculate(int a,int b) {
		return sum(a,b);
	}
	private static int sum(int a,int b) {
		return a+b;
	}
	private int sub(int a,int b) {
		return a-b;
	}
}