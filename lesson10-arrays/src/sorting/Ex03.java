package sorting;

import bean.Item;
import utils.ArraysUtils;

public class Ex03 {
	public static void main(String[] args) {
		Item item1 = new Item(12, "A", 10);
		Item item2 = new Item(24, "B", 20);
		Item item3 = new Item(12, "G", 100);
		Item item4 = new Item(28, "H", 110);
		Item item5 = new Item(31, "K", 101);

		Item[] items = { item1, item2, item3, item4, item5 };

		// sorting items
		for (int i = 0; i < items.length; i++) {
			for (int j = 0; j < items.length - i - 1; j++) {
				Item pre= items[j];
				Item next = items[j+1];
				if(pre.compareTo(next)>0) {
					Item tmp = items[j];
					items[j] = items[j + 1];
					items[j + 1] = tmp;
				}
//				if (items[j].getId() > items[j + 1].getId()) {
//					Item tmp = items[j];
//					items[j] = items[j + 1];
//					items[j + 1] = tmp;
//					continue;
//				}
//				if (items[j].getId() < items[j + 1].getId()) {
//					continue;
//				}
//
//				if (items[j].getName().compareTo(items[j + 1].getName()) > 0) {
//					Item tmp = items[j];
//					items[j] = items[j + 1];
//					items[j + 1] = tmp;
//				}
			}

		}
		ArraysUtils.printf(items);
	}
}
