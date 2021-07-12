package declaration;

import java.util.Arrays;

import bean.Condition;

public class Ex02 {
	public static void main(String[] args) {
		int[] digits= {1,3,6,19,22,40};
		
		printf(getDigits(digits,d1->d1 %2==0));
   	}
	private static int[] getDigits(int[] digits,Condition cdt) {
		int[] result=new int[digits.length];
		int index=0;
		for(int digit:digits) {
			if(cdt.test(digit)) {
				result[index++]=digit;
			}
		}
		
		//return Arrays.copyOf(result, index);
		return Arrays.copyOfRange(result, 0, index);
	}
	private static void printf(int[] digits) {
		for(int digit:digits) {
			System.out.println(digit +" ");
		}
		System.out.println();
	}
}
