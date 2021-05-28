package shopping;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;

public class Order {

        /**
         *
         */
        private Customer customer;
        private ItemDetail[] itemDetails;
        //        private String datetime; worst case 10:10:10 08.05.2021
        private LocalDate orderDate;

        public Order(Customer c1, ItemDetail[] itemDetails, LocalDateTime of) {
        }

        public Order(Customer customer, ItemDetail[] itemDetails, LocalDate orderDate) {
                this.customer = customer;
                this.itemDetails = itemDetails;
                this.orderDate = orderDate;
        }

        public Customer getCustomer() {
                return customer;
        }

        public void setCustomer(Customer customer) {
                this.customer = customer;
        }

        public ItemDetail[] getItemDetails() {
                return itemDetails;
        }

        public void setItemDetails(ItemDetail[] itemDetails) {
                this.itemDetails = itemDetails;
        }

        public LocalDate getOrderDate() {
                return orderDate;
        }

        public void setOrderDate(LocalDate orderDate) {
                this.orderDate = orderDate;
        }

        @Override
        public String toString() {
                return "Order{" +
                        "customer=" + customer +
                        ", itemDetails=" + Arrays.toString(itemDetails) +
                        ", orderDate=" + orderDate +
                        '}';
        }

//        public double export()  {
//
//                double totolOfMoney;
//                totolOfMoney = 0;
//                ItemDetail[] ids = getItemDetails();
//                for (ItemDetail id : ids) {
//                        Item item = id.getItem();
//                        int quantity = id.getQuantity();
//                        double idCost = item.getCost() * quantity;
//                        if (item.getCost() > 590 && LocalDate.of(2021, Month.MAY, 8).isEqual(getOrderDate().atStartOfDay().toLocalDate())) {
//
//                                idCost *= 0.9;
//                        }
//                        totolOfMoney += idCost;
//
//
//                }
//                return totolOfMoney;
        }



