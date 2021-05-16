package ex04;

import java.io.IOException;

public class Ex04 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int length;
		System.out.println("Nhập độ dài của mảng: ");
		length=readInt.ReadInt.nhapSo();
		
		System.out.println("Nhập phan tu của mảng: ");
		int[] arr = new int[length];
		int lengthOfarr=arr.length;
		for(int i=0;i<lengthOfarr;i++) {
			arr[i]=readInt.ReadInt.nhapSo();
		}
		
		System.out.println("So le lon nhat cua mang la: "+TimsoleMax( arr) );
		
	}
	
	
	 static int TimsoleMax(int[] arr) {
		int max=0;
		int lengthOfarr=arr.length;
		for(int i=0;i<lengthOfarr;i++) {
			if( (arr[i]>max) && (arr[i]%2!=0) ) {
				max=arr[i];
			}
		}
		return max;
	}
	
}
