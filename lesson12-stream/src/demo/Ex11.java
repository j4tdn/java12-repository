package demo;

import java.util.Arrays;
import java.util.OptionalInt;

public class Ex11 {
	public static void main(String[] args) {
		int[] digits = {1,2,1,4,5,8,10,4,12};
		
		//1st: is there any element that iss divisible 10
		System.out.println("elements divided 10: " +Arrays.stream(digits).anyMatch(d->d%10==0));
		
		//2: find the first element that iss divisible ny 4
		OptionalInt value = Arrays.stream(digits)
							.filter(d->d%4==0)
							.findFirst();
		
		if(value.isPresent()) {
			System.out.println(value.getAsInt());
		}
		
		
		//3: find the elements that is divisible 5
		OptionalInt rs = Arrays.stream(digits) 
									.filter(d->d%5==0)
									.findAny();
		if(rs.isPresent()) {
			System.out.println(rs.getAsInt());
		}
		
		
		//4: does all elemnents less that 100
		boolean isValid = Arrays.stream(digits).allMatch(p->p<100);
		System.out.println("all elements less than 100: "+isValid);
		
	}
}
