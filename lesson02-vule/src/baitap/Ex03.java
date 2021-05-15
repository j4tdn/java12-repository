package baitap;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int reversed = 0, num1,a, tmp;
		System.out.println("Enter is number: ");
		num1 = sc.nextInt();
		
		for (tmp = num1; num1 !=0 ; num1 /= 10) {
			a =num1 % 10;
			reversed = reversed * 10 + a;
		}
		if(tmp == reversed)
	         System.out.println("is a palindrome: "+tmp);
	    else
	    		System.out.println("is not a palindrome: "+tmp);
		
		
		sc.close();
	}

	// tham khao tai laptrinhkhongkho.com
}
