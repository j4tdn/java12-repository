package ex02;

public class Ex02 {
	public static void main(String[] args) {
		for (int i : sort(getLargestNumberInArr("aa6b546c6e22h", "aa6b326c6e22h"))) {
			System.out.println(i);
		}
		
		System.out.println(getLargestNumber("a01a2b3456cde478ss"));
	}

	private static int getLargestNumber(String input) {
		int max = 0;
		if (input.equals("")) {
			return max;
		}
		String[] digits = input.split("[a-zA-Z]+");
		if (digits.length == 0) {
			return max;
		}
		for (String s : digits) {
			if(!s.isEmpty()) {
				int temp = Integer.parseInt(s);
				if (temp > max) {
					max = temp;
				}
			}
		}
		return max;
	}

	private static int[] getLargestNumberInArr(String... arr) {
		int[] dgReturn = new int[arr.length];
		int i = 0;
		for (String s : arr) {
			dgReturn[i++] = getLargestNumber(s);
		}
		return dgReturn;
	}
	
	private static int[] sort(int[] sort) {
		for (int i = 0; i < sort.length - 1; i++) {
			for (int j = i + 1; j < sort.length; j++) {
				if (sort[i] > sort[j]) {
					int tmp = sort[i]; 
					sort[i] = sort[j]; 
					sort[j] = tmp;
				}
			}
		}
		return sort;
	}
}
