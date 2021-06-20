package exception;

import java.time.LocalDate;
import java.util.Scanner;

public class Ex04 {
	private static Scanner ip = new Scanner(System.in);
//Nê�?u code xảy ra ngoại lệ => JVM ne�?m ra thông tin ngoại lệ trong console va kê�?t thu�?c chương trình
	
	public static void main(String[] args) {
       System.out.println("Enter a: ");
       int a=Integer.parseInt(ip.nextLine());
       
       System.out.println("Enter b: ");
       int b=Integer.parseInt(ip.nextLine());
       try {
       int x=div(a,b);
       System.out.println("Result: "+x);
       }catch(ArithmeticException e) {
    	   System.out.println("---Jump to catch---");
       }
      System.out.println("Thread main end !");
	}
	
	private static int div(int a,int b) {
		if(a==0) {
			System.out.println("Throw Exception");
			throw new ArithmeticException();
		}
		System.out.println("-b/a");
		return -b/a;
	}
}
