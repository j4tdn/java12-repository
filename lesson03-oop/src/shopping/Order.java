package shopping;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Order {
	private Customer customer;
	private ItemDetail[] itemDetail;
	private LocalDateTime datetime;
	 public Order() {
	}
	public Order(Customer customer, ItemDetail[] itemDetail, LocalDateTime datetime) {
		super();
		this.customer = customer;
		this.itemDetail = itemDetail;
		this.datetime = datetime;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public ItemDetail[] getItemDetail() {
		return itemDetail;
	}
	public void setItemDetail(ItemDetail[] itemDetail) {
		this.itemDetail = itemDetail;
	}
	public LocalDateTime getDatetime() {
		return datetime;
	}
	public void setDatetime(LocalDateTime datetime) {
		this.datetime = datetime;
	}
	@Override
	public String toString() {
		return "Order [customer=" + customer + ", itemDetail=" + Arrays.toString(itemDetail) + ", datetime=" + datetime
				+ "]";
	}
}