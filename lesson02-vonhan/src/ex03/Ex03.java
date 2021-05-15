//kiểm tra một số có phải số đối xứng
package ex03;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số :  " );
		int num = Integer.parseInt(sc.nextLine());
		
		if(laSoDoiXung(num)) {
			System.out.println(num + " là số đối xứng.");
		} else {
			System.out.println(num + " không là số đối xứng.");
		}
	}
	//Tìm số ngịch đảo
	public static int timSoDao(int num)
	{
		int nSoDao = 0, nRem;

		while (num != 0)
		{
			nRem = num % 10;
			nSoDao = (nSoDao * 10) + nRem;
			num = num / 10;
		}
		return nSoDao;
	}
	
	// Hàm kiểm tra một số nguyên dương n cho trước có phải là số đối xứng hay không
	public static boolean laSoDoiXung(int num)
	{
		if (num == timSoDao(num))
			return true;
		else
			return false;
	}
}
