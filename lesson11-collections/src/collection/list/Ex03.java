package collection.list;

import java.util.ArrayList;
import java.util.List;

public class Ex03 {
	public static void main(String[] args) {
		// Constructs an empty list with an initial capacity of ten
		// this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;

		List<String> elements = new ArrayList<>();
		
		// capacity
		elements.add("Water");
		elements.add("Bottle");
		elements.add(0, "Pater");
		
		elements.set(1, "Can");
		
		// remove index
		elements.remove(0);
		
		// remove value
		elements.remove("Can");
		
		// loop
		for (int i = 0; i < elements.size(); i++) {
			System.out.println("element " + i + ": " + elements.get(i)); 
		}
		
		
		
		System.out.println("size: " + elements.size());
		System.out.println("isEmpty: " + elements.isEmpty());
		
	}
}
