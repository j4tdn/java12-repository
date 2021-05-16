package ex07;


import java.util.Arrays;
import java.util.Random;

public class Ex07 {

	 public static boolean checkDuplicate(int[] arr) {
		 Arrays.sort(arr);
		 int length=arr.length;
		 for(int i = 0; i < length-1; i++) {
			 if( arr[i] == arr[i+1]) {
				 return true;
			 }
		 }
		 return false;
	 }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd= new Random();
		int[] arr; 
		int phanTuCuaMang;
		
		do {
			arr= new int[5];
			int length=arr.length;
			
			for (int i = 0; i < length ; i++) {
				phanTuCuaMang = rd.nextInt(11) + 20;
				arr[i]=phanTuCuaMang;
			}
		}
		while(checkDuplicate(arr));
		
		
		System.out.println("5 so ngau nhien: ");
		for (int i = 0; i < arr.length ; i++) {
			System.out.print(arr[i] +" ");
		}
		
	}

}
