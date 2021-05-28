package shopping;

import java.time.LocalDate;
import java.time.Month;

/*
    Utility of Order class
    Normally: Utility is place where contains utility method
    No care created class's object
 */
public class OrderUtils {

    public static double export(Order order) {

        double totolOfMoney;
        totolOfMoney = 0;
        ItemDetail[] ids = order.getItemDetails();
        for (ItemDetail id : ids) {
            Item item = id.getItem();
            int quantity = id.getQuantity();
            double idCost = item.getCost() * quantity;
            if (item.getCost() <= 590 && LocalDate.of(2021, Month.MAY, 8).isEqual(order.getOrderDate().atStartOfDay().toLocalDate())) {
            } else {

                idCost *= 0.9;
            }
            totolOfMoney += idCost;


        }
        return totolOfMoney;

    }
}
