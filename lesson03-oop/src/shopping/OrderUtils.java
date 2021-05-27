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
}
