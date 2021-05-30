package shopping;

import java.time.LocalDate;
import java.time.Month;

/**
 * Utility of Order Class
 * Normally: Utility is place where contains utility methods
 * No cares created class's objects
 */
public class OrderUtils {
	private OrderUtils() {
	}
	
	public static void export(Order order) {
		double totalOfMoney = 0;
		Customer customer = order.getCustomer();

		ItemDetail[] ids = order.getItemDetails();
		System.out.println("\n========== Hoa don cua khach hang " + customer.getName() + " ==========\n");
		for(ItemDetail id : ids) {
			Item item = id.getItem();
			int quantity = id.getQuantity();
			System.out.println("Thong tin san pham: " + item);
			System.out.println("So luong: " + quantity);
			double idCost = item.getCost() * quantity;
			if(item.getCost() > 590 && LocalDate.of(2021, Month.MAY, 8).equals(order.getOrderDate().toLocalDate())) {
				idCost = idCost * 0.9; 
			}
			totalOfMoney += idCost;
		}
		System.out.println("=> Tong tien khach hang " + customer.getName() + " phai tra la: " + totalOfMoney);
		System.out.println("\n              ====================\n");
	}
	
	//      static: initial(allocate memory) at class loading time
	// none-static: initial(allocate memory) at object loading time
	// static >> non-static
	// can't use function none-static inside function static
	// static - CALL - static: YES
	// non    - CALL - non   : YES
	// static - CALL - none  : NO 
	// non    - CALL - static: YES
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		
		OrderUtils ou = new OrderUtils();
		System.out.println("result: " + ou.calculate(a, b));
	}
	
	private int calculate(int a, int b) {
		return sum(a, b);
	}
	
	private static int sum(int a, int b) {
//		sub(a, b);
		return a + b;
	}
	
	private int sub(int a, int b) {
		return a - b;
	}
}
