package BaiTapjava;

import java.util.Scanner;

public class Ex03 {
	public static Scanner scanner = new Scanner(System.in);
	public static void checkSoDoiXung(Integer n)
	{
		Integer check =0;
		Integer check1;
		Integer  temp =n;
		while(temp!=0)
		{
			check1=temp%10;
			check=check*10+check1;
			temp/=10;
		}
		if(check==n) System.out.println("La so doi xung");
		else System.out.println("khong phai so doi xung");
	}
	public static void main(String[] args) {
		Integer x = Integer.parseInt(scanner.nextLine());
		checkSoDoiXung(x);
	}
}
