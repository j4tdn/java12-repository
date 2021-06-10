package ex01;

public class Function {
	static  int[] getUniqueNumbers(int[] digits) {
		int temp[]=new int[digits.length];
		int count;
		int index=0;
		for(int i=0;i<digits.length;i++) {
			count=0;
			for(int j=0;j<digits.length;j++)
		       {
		           if(digits[i]==digits[j]&&i!=j)
		              count =1;
		       }
			if(count==0) {
				temp[index++] = digits[i];
			}
		}
		int[] result= new int [index];
		for (int i=0;i<index;i++) {
			result[i]=temp[i];
		}
		return result;
	}
}
