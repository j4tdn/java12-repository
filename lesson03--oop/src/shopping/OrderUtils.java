package shopping;

import java.time.LocalDate;
import java.time.Month;

/**
 * 
 * Utility of Order Class
 * Normally: Utility is place where contains utility methods
 * No cares created class's objects
 */

public class OrderUtils {
	private OrderUtils() {
		
	}
	public static double export(Order order)
	{
		double totolOfMoney=0;
		
		ItemDetail[] ids = order.getItemdetails();
		for(ItemDetail id : ids)
		{
			Item item = id.getId();
			int quality = id.getQuantity();
			
			double idCost= item.getCost()*quality;
			if(item.getCost()>590 && LocalDate.of(2021,Month.MAY, 8).isEqual(order.getOrderDate().toLocalDate()))
			{
				idCost *= 0.9;
			}
			totolOfMoney+= idCost;
			
		}
		return totolOfMoney;
	}
}
