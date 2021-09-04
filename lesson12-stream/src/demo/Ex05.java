package demo;
import java.util.function.Supplier;
import bean.Apple;
import funtional.BiFuntion;
import funtional.BuFuntion;
/*
 * Construction reference
 */
public class Ex05 {
	public static void main(String[] args) {
		
		
		//Default constructor
		//Supplier<Apple> supplier = () -> new Apple();
		Supplier<Apple> supplier = Apple::new;
		Apple apple =supplier.get();
		System.out.println(apple);
		
		//full constructor
		BuFuntion<Apple, Integer, String, Double, String> buFuntion=Apple::new;
		Apple apple2=buFuntion.get(1, "green", 12d, "Vietnam");
		System.out.println(apple2);
		
		//Constructor with 2 params
		BiFuntion<Apple, Integer, String> biFuntion = Apple::new;
		Apple a3 = biFuntion.get(1, "VN");
		System.out.println(a3);
		
		
		System.out.println("=================================");
		test(Apple::new,12,"Italu",(x,y)->new Apple(x,y));
		test(()->new Apple(),0,"Italu",Apple::new);
	}
	
	private static void test(Supplier<Apple> sup, int id, String country , BiFuntion<Apple, Integer, String>bi) {
		Apple a = null;
		if(id==0 || country == null) {
			a = sup.get();
		}
		else {
			a=bi.get(id, country);
		}
		System.out.println(a);
	}
	
	
}
