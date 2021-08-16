package menupulation;

import java.util.Arrays;

import Utils.ArrayUtils;

import bean.Tupble;

/**
 * + Tìm max và min trong mảng chỉ với một vòng lặp 
 * + Thêm phần tử vào mảng 
 * + Xoá phần tử của mảng
 *
 */
public class Ex01 {
	public static void main(String[] args) {
		int digits[] = { 1, 9, 5, 36, 12, 33,2 };
		ArrayUtils.printf(digits);
		System.out.println("Max: "+maxmin2(digits).getMax()+" Min: "+maxmin2(digits).getMin());
		ArrayUtils.printf(insert(digits, 2, 9999));
		ArrayUtils.printf(remove(digits, 3));
	}

	
	/*
	 * Tim max va min
	 * C1:
	 */
	private static int[] maxmin(int []digits) {
		if(digits.length==0) {
			throw new IllegalArgumentException("Array should not be empty");
		}
		int max=digits[0];
		int min=digits[0];
		for(int digit: digits) {
			if(digit>max) {
				max=digit;
			}
			if(digit<min) {
				min=digit;
			}
		}
		return new int[] {max, min};
	}
	/*
	 * Tim max va min 
	 * C2:
	 */
	private static Tupble maxmin2(int[]digits) {
		if(digits.length==0) {
			throw new IllegalArgumentException("Array should not be empty");
		}
		int max=digits[0];
		int min=digits[0];
		for(int digit: digits) {
			if(digit>max) {
				max=digit;
			}
			if(digit<min) {
				min=digit;
			}
		}
		return new Tupble(max,min);
	}
	
	
	/*
	 * Them phan tu vao mang
	 */
	private static int[] insert(int[] digits, int index, int value) {
		int[] result = new int[digits.length + 1];

		// //Cach 1
		// for(int i=0;i<index;i++) {
		// result[i]=digits[i];
		// }
		// result[index] = value;
		// for(int i=index+1;i<result.length;i++) {
		// result[i]=digits[i];
		// }

		// Cach 2
		for (int i = 0; i < digits.length; i++) {
			result[i] = digits[i];
		}
		for (int i = result.length - 1; i > index; i--) {
			result[i] = result[i - 1];
		}
		result[index] = value;

		return result;
	}

	/*
	 * Xoá phần tử
	 */
	private static int[] remove(int[] digits, int index) {
		//// Cach 1
		// int[] result = new int[digits.length - 1];
		// for (int i = 0; i < index; i++) {
		// result[i] = digits[i];
		// }
		// for(int i = index+1;i < digits.length;i++) {
		// result[i-1]=digits[i];
		// }
		// return result;

		//// Cach 2 - cap nhat truc tiep mang goc
		for (int i = index + 1; i < digits.length; i++) {
			digits[i - 1] = digits[i];
		}
		return Arrays.copyOfRange(digits, 0, digits.length - 1);
	}
}
