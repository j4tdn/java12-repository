package ex05;

public class AppUtils {
	
	public static Book[] createData() {
		
		Book[] data=new Book[5];
		data[0] = new Textbook("SGK1", 45, "Nhi Dong", true);
		data[1] = new Textbook("SGK2", 125, "Nhat anh", false);
		data[2] = new Textbook("SGK3", 25, "Minh Nhat", true);
		data[3] = new RefBook("STK1", 210, "Nhi Dong", 0.1);
		data[4] = new RefBook("STK2", 105, "An Khang", 0.15);
		
		return data;
	}
	
	public static void searchAuthor(Book[] data) {
		System.out.println("Sach co nha xuat ban Nhi Dong: " );
		for(Book x : data) {
			if(x.getAuthor()=="Nhi Dong") System.out.println(x);
		}
	}
	
	public static void searchCost(Book[] data) {
		System.out.println("Toan bo sach co don gia nho hon 50 " );
		for(Book x : data) {
			if(x.getCost()<50) System.out.println(x);
		}
	}
	
	public static void searchCostTextbook(Book[] data) {
		System.out.println("Toan bo sach giao khoa 	co don gia tu 100 den 200: " );
		for(Book x : data) {
			if(x.getCost()<200 && x.getCost()>100 && x.getId().startsWith("SGK")) System.out.println(x);
		}
	}
	
	public static double buyBook(Buying buy) {
		double price = 0;
		Textbook book1 = (Textbook) buy.getTextbook();
		RefBook book2 = (RefBook) buy.getRefBook();
		if(book1.getStatus()== "Cu") {
			price = book1.getCost() * 0.7;
		}
		else price = book1.getCost();
		price += book2.getCost()*(1+book2.getTax());
		return price;
		
	}
	
	
}
