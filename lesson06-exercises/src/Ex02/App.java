package Ex02;

import java.util.Scanner;

public class App {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		boolean checkk =false;
		while(!checkk)
		{
			System.out.println("Nhap mat khau");
			String test = scan.nextLine();
		switch (Check(test)) {
		case -1:
			System.out.println("Mat Khau Thoa Man");
			break;
		case 0:
			System.out.println("Mat Khau co do dai nho hon 8 hoac lon honw 256");
			break;
		case 1:
			System.out.println("Mat Khau phai chua it nhat 1 chu cai");
			break;
		case 2:
			System.out.println("Mat Khau phai chua mot ky tu in hoa");
			break;
		case 3:
			System.out.println("Mat khau phai chua 1 chu so");
			break;
		case 4:
			System.out.println("Mat khau phai chua 1 ky tu dac biet");
			break;
		case 5:
			System.out.println("Mat Khau khong duoc chua dia chi Email");
			break;
			}
		if(Check(test)==-1) checkk=true;
		}
	}
	private static int Check(String s)
	{
		int result = -1;	
		String checkGmail ="^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
		if(s.matches(checkGmail)) return 5;
		String[] check= {".*\\b{8,256}.*",".*[a-z]+.*",".*[A-Z]+.*",".*\\d+.*",".*\\S+.*"};
		for(int i =0;i<check.length;i++)
		{
			if(!s.matches(check[i]))
			{
				result=i;
				break;
			}
		}
		return result;
	}
}
