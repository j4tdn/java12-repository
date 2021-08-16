package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Ex04 {
	/**
	 * Xoá phần tử với điều kiện
	 * +Dùng removeIf()
	 * +Dùng iterator
	 * 
	 */
	public static void main(String[] args) {
		List<String> elements = new ArrayList<String>();
		elements.add("Item - 5");
		elements.add("Item - 6");
		elements.add("Item - 2");
		elements.add("Item - 3");
		elements.add("Item - 4");
		elements.add("Item - 7");
		elements.add("Item - 1");
		elements.add("Item - 0");

		for (String element : elements) {
			System.out.println(element);
		}
		
		System.out.println("============");
		remove2(elements);
		
		System.out.println("============");
		for (int i = 0; i < elements.size(); i++) {
			String item = elements.get(i);
			System.out.println(" " + item);
		}
	}
	private static void remove1(List<String> elements) {
		for (int i = 0; i < elements.size(); i++) {
			String item = elements.get(i);
			int remainingDays = Integer.parseInt("" + item.charAt(item.length() - 1));
			if (remainingDays <= 3) {
				System.out.println("remove elemnt: " + item);
				elements.remove(item);
				//elements.remove(i);
				i--;
			}
		}
	}
	
	/*
	 *Use  Iterator
	 */
	private static void remove2(List<String> elements) {
		Iterator <String> iterator=elements.iterator();
		while(iterator.hasNext()) {
			String item = iterator.next();
			int remainingDays = Integer.parseInt("" + item.charAt(item.length() - 1));
			if (remainingDays <= 3) {
				System.out.println("remove elemnt: " + item);
				iterator.remove();
			}
		}
	}
	
	/*
	 * Use removeIf
	 */
	private static void remove3(List<String> elements) {
		//do element la list<String> nen compile sẽ tự hiểu item là string
		elements.removeIf(item -> Integer.parseInt("" + item.charAt(item.length() - 1))<=3);
	}
}
