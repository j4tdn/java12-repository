package BT3;

import java.util.Scanner;

public class BT3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap a: ");
		int a = scanner.nextInt();
		System.out.println("nhap b: ");
		int b = scanner.nextInt();
		System.out.println(isPowerOf(a,b));
		
	}
    public static boolean isPowerOf(int x, int y)
    {
        if (x == 1)
            return (y == 1);
       
        
        while (x%y == 0)  x = x / y;
        	return x == 1;
       
    }

}
