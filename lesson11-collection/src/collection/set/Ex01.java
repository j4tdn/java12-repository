package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex01 {
	public static void main(String[] args) {
		Set<Integer>digits = new HashSet<>();
		digits.add(1);
		digits.add(13);
		digits.add(4);
		digits.add(5);
		System.out.println("Size: "+digits.size());
		
		Iterator<Integer>each= digits.iterator();
		while(each.hasNext()) {
			System.out.println(each.next());
		}
	}
	
	
}
