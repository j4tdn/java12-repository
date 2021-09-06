package sorting;

import bean.Item;
import utils.ArraysUntils;

public class Ex03 {
	public static void main(String[] args) {
		Item item1 = new Item(1, "A", 10);
		Item item2 = new Item(2, "B", 20);
		Item item3 = new Item(3, "C", 30);
		Item[] items = { item1, item2, item3 };

		// sorting items ascending with bubble sort
		for (int i = 0; i < items.length; i++) {
			for (int j = 0; j < items.length - i - 1; j++) {
				String a = String.valueOf("k");
				System.out.println(a);
				Item pre = items[j];
				Item next = items[j + 1];

				if (pre.compareTo(next) > 0) {
					Item item = items[j];
					items[j] = items[j + 1];
					items[j + 1] = item;
				}
			}
		}
		ArraysUntils.printf(items);
	}
}
