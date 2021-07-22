package sorting;

import bean.Item;
import utils.ArraysUtils;

public class Ex03 {
	public static void main(String[] args) {
		Item item1 = new Item(12, "A", 10);
		Item item2 = new Item(24, "C", 20);
		Item item3 = new Item(18, "F", 30);
		Item item4 = new Item(24, "D", 18);
		Item item5 = new Item(18, "E", 30);
		
		Item[] items = {item1, item2, item3, item4, item5};
				
		// sorting items ascending with bubble sort
		for(int i = 0; i < items.length; i++) {
			for(int j = 0; j < items.length - i - 1; j++) {
				
				Item pre = items[j];
				Item next = items[j+1];
				
//				if(pre.getId() - next.getId() < 0) {
//					continue;
//				}
//				
//				if(pre.getId() - next.getId() > 0) {
//					Item item = items[j];
//					items[j] = items[j + 1];
//					items[j + 1] = item;
//					continue;
//				}
//				
//				if(items[j].getName().compareTo(items[j + 1].getName()) < 0) {
//					Item item = items[j];
//					items[j] = items[j + 1];
//					items[j + 1] = item;
//				}
				
				if(pre.compareTo(next) > 0) {
					Item item = items[j];
					items[j] = items[j + 1];
					items[j + 1] = item;
				}
			}
		}
		
		ArraysUtils.printf(items);
	}
}
