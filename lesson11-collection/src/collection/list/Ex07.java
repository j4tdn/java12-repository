package collection.list;

import java.util.ArrayList;
import java.util.List;

import bean.Item;

/**
 * Nếu sử dụng hàm remove hay contains trong List(kiểu object)
 * Ta phải override lại hàm equals
 * Vì hàm equals mặc định chỉ so sánh heap (hoặc so sánh các ký tự trong string)
 */
public class Ex07 {
	public static void main(String[] args) {
		List<Item> items=getItems();
		
		Item itemA= new Item(1,12,"A12",100);
		Item itemB=new Item(1,10,"A10",100);
		Item itemC=items.get(2);
		
		System.out.println("ItemA exist > "+items.contains(itemA));
		System.out.println("ItemB exist > "+items.contains(itemB));
		System.out.println("ItemC exist > "+items.contains(itemC));
		
		items.remove(itemB);
		
		System.out.println("Size: "+items.size());
	}
	
	private static List<Item> getItems(){
		List<Item> items=new ArrayList<Item>();
		
		items.add(new Item(1,10,"A10",100));
		items.add(new Item(2,30,"A20",200));
		items.add(new Item(3,20,"A30",300));
		items.add(new Item(1,12,"A12",120));
		
		return items;
	}
}
