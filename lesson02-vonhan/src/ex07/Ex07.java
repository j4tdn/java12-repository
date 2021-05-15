//random ngẫu nhiên 5 số trong khoảng 20 - 30
package ex07;

import java.awt.font.NumericShaper.Range;
import java.security.SecureRandom;
import java.util.Random;

public class Ex07 {
	static int[] range(int min, int max) {
		int n = max - min + 1;
		
		// array store all number in range
		int a[] = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = i;
			 
		}
		//array to store result
		int[] result = new int[n];
		
		int x= n;
		SecureRandom rd = new SecureRandom();
		for(int i = 0; i < n; i++) {
			//k is random index in [0, x]
			int k = rd.nextInt(x);
			
			result[i] = a[k];
			
			//we got value from a[k].
			//we replace its value by the value from last index
			//so that we will do not get the value(a[k]) any more
			a[k] = a[x - 1];
			
			//then we decrease x by 1 to get a random index from 0 to x only
			x--;
		}
		return result;
	}
	public static void main(String[] args) {
		int[] result = range(4, 15);
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
}
