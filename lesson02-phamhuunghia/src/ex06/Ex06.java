package ex06;

import java.io.IOException;

public class Ex06 {
	public static boolean isPrime(int input) {
	       if (input <= 1) {
	           return false;
	       }
	       for (int i = 2; i <= Math.sqrt(input); i++) {
	           if (input % i == 0) {
	               return false;
	           }
	       }
	       return true;
	   }
	
	public static int outputPrime() {
		int count=1, i=1, nPrime=0;

	
		do {
			if(isPrime(i)) {
				nPrime = i;
				count++;
			}
			i++;
		}while(count<=200);
		return nPrime;
		
	}
		
	public static void main(String[] args) throws IOException {
		System.out.println("So nguyen to thu 200 la: "+outputPrime());
	}
}
