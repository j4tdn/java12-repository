package collection.list;

import java.util.ArrayList;
import java.util.List;

public class Ex03 {
	public static void main(String[] args) {
		List<String> elements = new ArrayList<>();

		elements.add("water");
		elements.add("bottles");
		elements.add(0, "paper");

		elements.set(1, "Can");
		
		// remove index
		elements.remove(0);

		// remove value
		elements.remove("Can");

		//get element
		for (int i = 0; i < elements.size(); i++) {
			System.out.println("elements " + i + ": " + elements.get(i));
		}

		System.out.println("Size: " + elements.size());
		System.out.println("isEmpty: " + elements.isEmpty());
	}
}
