package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex01 {

	public static void main(String[] args) {
		
		//Map<K,V> >> hashcode,equals of KEY
		//Set<E>   >>                    E 
		
		Set<Integer> digits = new TreeSet<>();
		digits.add(15);
		digits.add(25);
		//digits.add(null);
		digits.add(35);
		digits.add(25);

		System.out.println(digits.size());
		//c1
		for(Integer digit : digits) {
			System.out.println(digit);
		}
		
		//c2
		Iterator<Integer>each = digits.iterator();
		while(each.hasNext()) {
			System.out.println("next: "+each.next());
		}
	}
}
