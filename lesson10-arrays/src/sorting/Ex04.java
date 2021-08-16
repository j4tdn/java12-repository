package sorting;

import Utils.ArrayUtils;

/**
 * Selection sort
 * Mỗi vòng lặp sẽ chọn phần tử lớn nhất rồi đưa về cuối
 */
public class Ex04 {
	public static void main(String[] args) {
		int[] digits= {1,5,4,9,6,11};
		for(int i=digits.length-1;i>0;i--) {
			int maxIndex=-1;
			int max=Integer.MIN_VALUE;
			for(int j=0; j < i;j++) {
				//Lấy ra index cần swapS
				if(digits[j]>max) {
					max=digits[j];
					maxIndex = j;
				}
			}
			
			//nếu max > phần tử cuối => swap
			if(digits[maxIndex]>digits[i]) {
				int tmp=digits[maxIndex];
				digits[maxIndex]=digits[i];
				digits[i]=tmp;
			}
		}
		ArrayUtils.printf(digits);
	}
}
