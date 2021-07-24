package colection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Ex04 {
	public static void main(String[] args) {
		List<String> elements = new ArrayList<>();
		elements.add("Item - 5");
		elements.add("Item - 1");
		elements.add("Item - 26");
		elements.add("Item - 0");
		
		
		/*for(int i =0;i<elements.size();i++) {
			String item = elements.get(i);
			int remainningDays= Integer.parseInt("" + item.charAt(item.length()-1));
			if(remainningDays<3) {
				System.out.println("removed element: " + item);
				elements.remove(item);
				i--;
			}
		}*/
		
		
		
		/*Iterator<String> iterator = elements.iterator();
		while(iterator.hasNext()) {
			String item = iterator.next();
			int remainningDays= Integer.parseInt("" + item.charAt(item.length()-1));
			
			if(remainningDays<3) {
				System.out.println("removed element: " + item);
				iterator.remove();
			}
		}*/
		elements.removeIf(item -> Integer.parseInt("" + item.charAt(item.length()-1)) <=3);
		
		
		System.out.println("================");
		for(String element:elements) {
			System.out.println(element);
		}
	}
}
