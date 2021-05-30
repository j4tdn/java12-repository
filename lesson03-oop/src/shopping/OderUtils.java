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
public class OderUtils {
	
	private OderUtils() {
		
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
	/**
	 * static luôn được khởi tạo ở bộ nhớ heap khi chạy 1 class
	 * non chỉ khởi tạo khi tạo 1 đối tượng của lớp
	 * 
	 * static and non static
	 * static call static: YES
	 * non call non: YES
	 * static call non: NO => khởi tạo đối tượng sau đó mới gọi được
	 * non call static: YESS
	 */
}
