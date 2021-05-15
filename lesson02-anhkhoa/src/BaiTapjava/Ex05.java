package BaiTapjava;

import java.util.Scanner;

public class Ex05 {
	public static Scanner scanner = new Scanner(System.in);
	public static void Convert(Integer x)
	{
		 int arr[] = new int[100];
	        Integer index = 0;
	        while(x > 0){
	            arr[index++] = x%2;
	            x = x/2;
	        }
	        for(int i = index-1;i >= 0;i--){
	            System.out.print(arr[i]);
	        }
	}
	public static void main(String[] args) {
		System.out.println("Nhap vao so can chuyen doi he co so:");
		Integer n = Integer.parseInt(scanner.nextLine());
		Convert(n);  
	}
}
