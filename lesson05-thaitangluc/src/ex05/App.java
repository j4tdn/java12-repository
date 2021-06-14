package ex05;

import java.text.DecimalFormat;

public class App {


	public static void main(String[] args) {
		Book[] data = null;
		data = AppUtils.createData(); 
		for(int i=0;i<data.length;++i) {
			System.out.println(data[i]);
		}
		System.out.println("===========================================");
		AppUtils.searchAuthor(data);
		System.out.println("===========================================");
		AppUtils.searchCost(data);
		System.out.println("===========================================");
		AppUtils.searchCostTextbook(data);
		System.out.println("===========================================");
		Customer customer = new Customer(1, "Nam", 87901, "Nguyen Hue");
		Textbook textbook= new Textbook("SGK3", 195, "Minh Nhat", false);
		RefBook refBook= new RefBook("STK1", 220, "Nhi Dong", 0.1);
		Buying buy = new Buying(customer, textbook, refBook);
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println(df.format(AppUtils.buyBook(buy)) );
	}
}
