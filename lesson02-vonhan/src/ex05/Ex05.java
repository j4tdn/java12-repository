//chuyển đổi một số ở cơ số 10 sang cơ số 2

package ex05;

import java.util.Scanner;

public class Ex05 {
	 public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Nhập số tự nhiên :  ");
	        int n = Integer.parseInt(sc.nextLine());
	        int rem;
	        int num = n; 
	        String str="";
	     
	        while(num>0)
	        {
	            rem = num%2;
	            str = rem + str;
	            num=num/2;
	        }
	        System.out.println("Hệ cơ số 2 của "+ n +" là : "+str);
	    }
}
