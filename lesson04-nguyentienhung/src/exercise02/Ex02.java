package exercise02;

import java.util.ArrayList;

public class Ex02 {
	public static void main(String[] args) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		int[] sequence = { 5, 10, 15, 7, 49, 14, 35, 70 };
		for (int i = 0; i < sequence.length; i++) {
			if (sequence[i] % 7 == 0 && sequence[i] % 5 != 0)
				result.add(sequence[i]);
		}
		for (int i = 0; i < sequence.length; i++) {
			if (sequence[i] % 7 == 0 && sequence[i] % 5 == 0)
				result.add(sequence[i]);
		}
		for (int i = 0; i < sequence.length; i++) {
			if (sequence[i] % 5 == 0 && sequence[i] % 7 != 0)
				result.add(sequence[i]);
		}
		for(int item : result) {
			System.out.println(item);
		}
	}
}
