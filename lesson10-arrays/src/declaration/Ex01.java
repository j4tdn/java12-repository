package declaration;

import bean.Item;

public class Ex01 {
public static void main(String[] args) {
	int[] a = new int[3];
	int[] b = {1,5,2};
	int[] c = new int[] {4,2,3};
	System.out.println("i1: " + a.getClass());
	
	String[] s1 = new String[2];
	
	Item item1 = new Item(2, "Anh Khoa", 20);
	Item item2 = new Item(34, "Anh Khoa", 30);
	Item item3 = new Item(1, "Anh Khoa", 10);
	
	Item[] items = new Item[2];
	Item[] goods = {item1, item2,item3};
	Item[] things = new Item[] {item1};
	
	System.out.println("Items:" + items.getClass().getSimpleName());
	
}
private static int[] initNbers() {
	return new int[] {1,5,7};
}
}
