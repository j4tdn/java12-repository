package demo;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

import bean.Apple;
import utils.AppleUtils;
import utils.CollectionUtils;


/*
 * Method reference
 */
public class Ex04 {
public static void main(String[] args) {
	List<Apple> inventory =AppleUtils.getAll();
	// instance -> ClassA.[ClassB.ClassC...].method(instance)   
	// <=> ClassA.[ClassB.ClassC...]::method
	
	Consumer<Apple> c1 = a-> System.out.println(a);
	Consumer<Apple> c11 = System.out::println;
	
	Consumer<Apple> c2 = a-> System.out.println(a.getCountry());
	inventory.forEach(c2);
	
	
	
	System.out.println("\n===================");
	inventory.forEach(c11);
	
	
	//EX02
	System.out.println("\n===================");
	List<String> sequences= Arrays.asList("asd","vs","avcx","aaaaa","a");
	System.out.println(CollectionUtils.map(sequences, String::length));
	/*System.out.println(map(sequences, s -> s.length()));*/
	
	System.out.println("\n===================");
	System.out.println(CollectionUtils.map(inventory, Apple::getColor));
	
	//Ex03
	Function<String , Integer>f1 = Integer::parseInt;
	/*Function<String , Integer>f1 = s-> Integer.parseInt(s);*/

	
	//Ex04
	compare(inventory, inventory, Apple::getId);
	/*compare(inventory, inventory, x->x.getId());  */
}
private static boolean compare(List<Apple> a1,List<Apple> a2,Function<Apple, Integer> func) {
	if(a1.size()!=a2.size())return false;
	
	for(int i=0; i< a1.size();i++) {
		if(!(func.apply(a1.get(i)).equals(func.apply(a2.get(i))))) {
			return false;
		}
	}
	return true;
}


}
