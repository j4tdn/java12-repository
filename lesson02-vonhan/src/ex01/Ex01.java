//kiểm tra một số có phải lũy thừa của 2
package ex01;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập một số:  ");
		int num = Integer.parseInt(sc.nextLine());
		
		if(isPowerOfTwo(num)) {
			System.out.println(num + " là lũy thừa của 2");
		}
		else {
			System.out.println(num + " không phải lũy thừa của 2");
		}
	}
	
	public static boolean isPowerOfTwo(int num) {
		return (( num!= 0) && (num&(num-1)) == 0);
	}
	
}
