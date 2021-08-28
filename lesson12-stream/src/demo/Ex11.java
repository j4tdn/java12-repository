package demo;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class Ex11 {

	public static void main(String[] args) {
		int[] digits= {1,2,1,4,5,8,10,5,4}; 
		
		//is there any element that is divisible by 10
		boolean d10=Arrays.stream(digits).anyMatch(item-> item%10==0);
		System.out.println(d10);
		
		//find the first element that is divisible by 4
		OptionalInt opInt=Arrays.stream(digits).filter(x->x%4==0).findFirst();
		if(opInt.isPresent()) {
			System.out.println(opInt.getAsInt());
		}
		
		//find the element that is divisible by 5 in the list
		OptionalInt opIntD5=Arrays.stream(digits).filter(x->x%4==0).findAny();
		if(opIntD5.isPresent()) {
			System.out.println(opInt.getAsInt());
		}
		
		//does all elements less than 100
		boolean d110=Arrays.stream(digits).allMatch(item-> item<100);
		System.out.println(d110);
		
		//does no elements greater than 0
		boolean d111=Arrays.stream(digits).noneMatch(item-> item>0);
		System.out.println(d111);
	}

}
