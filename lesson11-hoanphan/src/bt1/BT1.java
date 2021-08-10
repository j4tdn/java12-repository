package bt1;

import java.util.Scanner;

public class BT1 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
			System.out.print("Nhap n: ");
	        int n = sc.nextInt();
	        int z = 2*n - 1 ;
	     
	        for (int i = 1; i <= n-1; i++)
	        {
	            for (int j = 1; j <= i; j++)
	            {
	            	 System.out.print(j);
	            }
                int kt = 2*(n-i) - 1;
                for(int k = 1; k <= kt; k++) {
                	System.out.print(" ");
	              
	            }
                for(int t = z-i+1; t<=z; t++) {
                	System.out.print(t);
                }
                System.out.println();
	        }
	        
	        for(int a=1;a<=z;a++) {
	            System.out.print(a);
	        }
	        System.out.println();
	        for(int i=n-1;i>=1;i--){
	            for(int j = 1;j<=i;j++) {
	                System.out.print(j);
	            }
	            int kt = 2*(n-i)-1;
	            for(int k=1;k<=kt;k++) {
	                System.out.print(" ");
	            }
	            for(int t=z-i+1;t<=z;t++) {
	            	System.out.print(t);
	            }
		        System.out.println();

	        }
	}
}
