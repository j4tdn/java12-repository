package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex01 {
	public static void main(String[] args) {
		//Map<K,V> hashcode,equal theo key
		//set<E> ...................... E
		
		
		Set<Integer> digits = new HashSet<Integer>();
		digits.add(15);
		digits.add(22);
		digits.add(null);
		digits.add(18);
		digits.add(22);
		
		System.out.println(digits.size());
		
		Iterator<Integer> each = digits.iterator();
		while(each.hasNext()) {
			System.out.println("next: " + each.next());
		}
	}
}
