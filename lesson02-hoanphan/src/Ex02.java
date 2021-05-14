import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		long sum = 0;
		sum = factorial(4) + factorial(7) + factorial(12)+ factorial(18);
		System.out.println("tong cac giai thua la: " +sum);
	}
	public static long factorial(int n){
		long[] arrFact = new long[100];
		arrFact[0] = 1;
	    if(arrFact[n] == 0) {
	         for(int i = 1; i<=n; i++) {
	             if( arrFact[i] ==0)
	            	 arrFact[i] = arrFact[i-1]*i;
	         }
	    }
	    return arrFact[n];
	}
}
