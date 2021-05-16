package ex05;

import java.io.IOException;

public class Ex05 {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			
			int[] a = new int[10];
			System.out.println("Nhập số: ");
			int input=readInt.ReadInt.nhapSo();;
			
			int i=0;
			while(input>0) {
				a[i] = input % 2;
				input=input/2;
				i++;
			}
			System.out.println("Chuyển sang cơ số 2: ");
			for(int j=a.length-1; j>=0 ;j--) {
				System.out.print(a[j] + "");
			}
		
	}

}
