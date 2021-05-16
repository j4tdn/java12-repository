package data_structures;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		// chuyen doi he thap phan sang nhi phan.
		
		
		long dec, rem, i = 1, sum = 0;
		
		System.out.println("Enter the decimal to be converted:");
		Scanner sc = new Scanner(System.in);
		
		dec = Integer.parseInt(sc.nextLine());
		do
	    {
	        rem=dec%2;
	        sum=sum + (i*rem);
	        dec=dec/2;
	        i=i*10;
	        
	        
	    }while(dec > 0);
		
		System.out.println("The binary of the given number is: "+sum);
		
		// nguon google.
	}

}
