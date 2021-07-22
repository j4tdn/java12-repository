package baitap4;

public class Main {
	public static void main(String[] args) {
		int a = 75;
		int b = 15;
		
		int smallerNumber = a > b ? b : a;
		int biggerNumber = a > b ? a : b;
		
		for(int i = 2; i < smallerNumber; i++) {
			if(isPrime(i) && smallerNumber % i == 0) {
				if(biggerNumber % i == 0) {
					System.out.println("YES");
					return;
				}
			}
		}
		System.out.println("NO");
	}
	
	private static boolean isPrime(int number) {
		for(int i = 2; i <= Math.sqrt(number); i++) {
			if(number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
