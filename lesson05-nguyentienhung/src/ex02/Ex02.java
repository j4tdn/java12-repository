package ex02;

import java.util.Arrays;

public class Ex02 {
	public static int getMisingNumber(int []array) {
		int num;
		Arrays.sort(array);
		int []arr=new int[array.length+1];
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+1;
		}
		int temp=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]!=arr[i]) {
				temp=arr[i];
				break;
			}
		}
		num=temp;
		return num;
	}
public static void main(String[] args) {
	int arr[]= {3,2,1,6,5};
	int array=getMisingNumber(arr);
	
	System.out.println(array);
}
}
