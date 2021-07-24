package colection.list;

import java.util.ArrayList;
import java.util.List;

public class Ex03 {
	public static void main(String[] args) {
		List<String> elements = new ArrayList<>();
		
		//add Count++
		//add(e,elementData,size);
		elements.add("Water");
		elements.add("Bottle");
		elements.add(0,"Paper");
		
		elements.set(1, "Can");
		
		elements.remove(1);
		
		for(String element:elements) {
		System.out.println("Element: " + elements);
		}
		
		System.out.println("size: " + elements.size());
		System.out.println("isEmptu: " + elements.isEmpty());
	}
}
