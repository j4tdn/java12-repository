package BT2;

import java.util.Arrays;
import java.util.Scanner;

public class BT2 {
		public static int getMissingNumber(int[] arr) {
	        Arrays.sort(arr);     
	        int min = 1; 
	        int n = arr.length; 
	        
	        for (int i = 1; i < n ; i++){
	            if(arr[i] == min){
	                min++;
	            }
	        }   
	        return min;       
	}
		static Scanner sc = new Scanner(System.in);
		 public static void main(String[] args) {

	    		int arr[] = new int[20];
	    	    int n;
	    	    System.out.print("nhap n phan tu: ");
	    	    n = sc.nextInt(); 
	    	    
	            System.out.println("Nhap cac phan tu cua mang: ");
			    for(int i=1;i<n;i++) {
			        System.out.printf("a[%d] = ", i);
			        arr[i]= sc.nextInt();      
			    }
			    System.out.println("gia tri thieu cua mang la : "+ getMissingNumber(arr));
	    	   
	    }

}
