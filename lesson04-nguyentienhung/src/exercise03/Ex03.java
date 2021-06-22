package exercise03;
import java.util.Scanner;

public class Ex03 {
	private static Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
		int A[][] = new int[10][10];
		int h;
		int i,j;
		do {
			System.out.printf("\n Nhap chieu cao cua tam giac pascal = ");
	       h=input.nextInt();
		}while(h>10);
		System.out.printf("\n==========Tam giac Pascal h = %d=============\n", h);
	    for(i = 0;i < h;i++)
	    {
	        for(j = 0; j <= i; j++)
	        {
	            if(i == j || j == 0)
	            {
	                A[i][j] = 1;
	                System.out.printf("%d\t", A[i][j]);
	            }
	            else
	            {
	                A[i][j] = A[i-1][j-1] + A[i-1][j];
	                System.out.printf("%d\t", A[i][j]);
	            }
	        }
	        System.out.printf("\n");
	    }
	}
}
