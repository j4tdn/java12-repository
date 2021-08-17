package demo;

import java.util.List;
import java.util.function.Consumer;

import bean.Apple;
import utils.AppleUtils;

public class Ex04 {
	public static void main(String[] args) {
		List<Apple> inventory = AppleUtils.getAll();
		
		
		//pattern: instance -> ClassA.[ClassB].method(instance)
		//      -> ClassA.[ClassB]::method
		
		Consumer<Apple> c1 = a -> System.out.print(a);
		Consumer<Apple> c2 = System.out::println;
		
		inventory.forEach((Apple a) -> System.out.println(a.getId()));
	}
}
 