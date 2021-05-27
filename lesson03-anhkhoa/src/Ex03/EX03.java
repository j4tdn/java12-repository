package Ex03;

import java.util.Random;
import java.util.Scanner;

public class EX03 {
	public static Random rd = new Random();
	public static Scanner sc = new Scanner(System.in);
	public static int[][] arr;
	public static int m;
	public static int n;

	public static void main(String[] args) {
		System.out.println("Nhap m: ");
		 m = Integer.parseInt(sc.nextLine());
		 System.out.println("Nhap n: ");
		 n = Integer.parseInt(sc.nextLine());
		arr = new int[m][n];
		InputArr();
		OutArr();
		System.out.println(Check());
		
	}
	public static void InputArr()
	{
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
				arr[i][j] = rd.nextInt(99)+1;
		}
	}
	public static void OutArr()
	{
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
				System.out.print(arr[i][j]+"\t");
			System.out.println();
		}
	}
	public static String Check()
	{
		String s = new String();
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(check(arr[i][j],i,j))
					s ="Co yen Ngua " + arr[i][j];
			}
		}
		if(s.isEmpty()) return "Khong có yen ngua";
		return s;
	}
	public static boolean check(int arr1,int m1,int n1)
	{
		boolean c = true;
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==m1&&j==n1)
				{
					continue;
				}
				else
				{
					if(arr1>arr[m1][j]||arr1<arr[i][n1])
					{
						c =false;
					}
				}
			}
		}
		return c;
	}
}
