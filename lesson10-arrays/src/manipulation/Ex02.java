package manipulation;

import utils.ArraysUtils;

public class Ex02 {
public static void main(String[] args) {
	int[] a = {1,2,3,4,5};
	int[] b = {1,2,3,4,5,6};
	reverseArr(b);
	ArraysUtils.printf(b);
	
}
private static void reverseArr(int[] arr) {
	int index = arr.length/2;
	for(int i=0;i<=index;i++) {
		int t = arr[i];
		arr[i]= arr[arr.length-i-1];
		arr[arr.length-1-i]=t;
	}
}
}
