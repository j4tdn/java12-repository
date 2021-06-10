package ex05;

import java.util.Iterator;

public class App {
	public static void main(String[] args) {
		Book[] Book = setData();
		Show(Book);
}
	
	private static void Show(Book[] books) {
		for(Book book:books) {
			System.out.println(book);
		}
	}
	
	private Book[] findBook(Book[]books, String name) {
		
	}
	
	private static Book[] setData() {
		return new Book[] {
			new SachGK("SGK1", 15, "AAA", Status._new),
			new SachGK("SGK2", 20, "Nhi Dong", Status.old),
			new SachGK("SGK3", 25, "Nhi Dong", Status._new),
			
			
			
			new SachThamKhao("STK1", 10, "ABC",10 ),
			new SachThamKhao("STK2",20 , "CCC",5 ),
			
		};
	}
}
