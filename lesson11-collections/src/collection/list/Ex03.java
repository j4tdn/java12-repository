package collection.list;

import java.util.ArrayList;
import java.util.List;

public class Ex03 {
	public static void main(String[] args) {
		List<String> elements = new ArrayList<>();

		elements.add("Water");
		elements.add("Bottle");
		elements.add(0, "Paper");

		System.out.println("element 0: " + elements.get(0));
		System.out.println("element 1: " + elements.get(1));
		System.out.println("element 2: " + elements.get(2));
		
		elements.set(1, "Can");
		elements.remove(0);
		
		System.out.println(elements.toString());

		System.out.println("size: " + elements.size());
		System.out.println("isEmpty: " + elements.isEmpty());
	}
}
