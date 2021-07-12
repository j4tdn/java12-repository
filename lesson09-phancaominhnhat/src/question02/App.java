package question02;

import java.util.Arrays;

public class App {
	public static void main(String[] args) {
		String[] mangChuoi = {"aa6b546c6e22h","aa6b326c6e22h"};
		int[] mangSoLonNhat = new int[mangChuoi.length];
		if(mangChuoi.length == 0) {
			System.out.println("0");
		} else {
			for(int i = 0; i < mangChuoi.length; i++) {
				mangSoLonNhat[i] = soLonNhat(mangChuoi[i]);
			}
			Arrays.sort(mangSoLonNhat);
			for(int i = 0; i < mangSoLonNhat.length; i++) {
				System.out.print(mangSoLonNhat[i] + " ");
			}
		}
	}
	
	public static int soLonNhat(String chuoi) {
		int max = Integer.MIN_VALUE;
		String[] mangSoString;
		mangSoString = chuoi.split("\\D");
		
		int[] mangSoInt = new int[mangSoString.length];
		
		for(int i = 0; i < mangSoString.length; i++) {
			if(mangSoString[i] != "") {
				mangSoInt[i] = Integer.parseInt(mangSoString[i]);
				
				if(mangSoInt[i] > max) {
					max = mangSoInt[i];
				}
			}
		}
		
		if(mangSoInt.length != 0) {
			return max;
		}
		
		return 0;
	}

}
