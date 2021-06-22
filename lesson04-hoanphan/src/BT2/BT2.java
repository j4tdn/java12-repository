package BT2;

import java.util.ArrayList;

public class BT2 {
	public static void main(String[] args) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		int[] ListInt = { 20, 15, 45, 14, 49, 28, 35, 70 };
		for (int i = 0; i < ListInt.length; i++) {
			if (ListInt[i] % 7 == 0 && ListInt[i] % 5 != 0)
				result.add(ListInt[i]);
		}
		for (int i = 0; i < ListInt.length; i++) {
			if (ListInt[i] % 7 == 0 && ListInt[i] % 5 == 0)
				result.add(ListInt[i]);
		}
		for (int i = 0; i < ListInt.length; i++) {
			if (ListInt[i] % 5 == 0 && ListInt[i] % 7 != 0)
				result.add(ListInt[i]);
		}
		for(int item : result) {
			System.out.print(" "+item);
			
		}
	}

}
