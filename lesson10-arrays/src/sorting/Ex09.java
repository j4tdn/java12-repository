package sorting;

import java.util.Arrays;

import bean.Item;
import utils.ArraysUtils;

public class Ex09 {
	public static void main(String[] args) {
		Item item1 = new Item(12, "A", 10);
		Item item2 = new Item(24, "C", 20);
		Item item3 = new Item(18, "F", 30);
		Item item4 = new Item(24, "D", 18);
		Item item5 = new Item(18, "E", 30);	
		Item[] items = { item1, item2, item3, item4, item5 };
		
		Arrays.sort(items);
		ArraysUtils.printf(items);
	}
}
