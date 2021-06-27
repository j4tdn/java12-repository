package BT4;

import java.util.Scanner;

public class BT4 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		do {
			System.out.print("\nEnter number: ");
			try {
				int number = Integer.parseInt(sc.nextLine());
				String numString = number + "";
				
				// read 1 nums
				if(numString.length() == 1) {
					if(number == 0) {
						System.out.println("Không");
					}
					readUnit(number);
				}
				
				// read 2 nums
				if(numString.length() == 2) {
					readTens(number);
					switch (number % 10) {
					case 1:
						if(number / 10 != 1) {
							System.out.print("Mốt");
						} else {
							readUnit(number % 10);
						}
						break;
					case 5:
						System.out.println("Lăm");
						break;
					default:
						readUnit(number % 10);
					}
				}
				
				// read 3 nums
				if(numString.length() == 3) {
					readHundred(number);
					readTens((number % 100));

					switch ((number % 100) % 10) {
						case 1:
							if((number % 100) > 20) {
								System.out.println("mốt");
							} else {
								readUnit((number % 100) % 10);
							}
							break;
	
						case 5:
							if((number % 100) > 10) {
								System.out.println("lăm");
							} else {
								readUnit((number % 100) % 10);
							}
							break;
						default:
							readUnit((number % 100) % 10);
							break;
					}
				}
			} catch (NumberFormatException e) {
				System.out.println("loi nhap so");
			}
		} while (true);
			
	}
	
	public static int readUnit(int number) {
		switch (number) {
			case 1:
				System.out.println("Một");
				break;
			case 2:
				System.out.println("Hai");
				break;
			case 3:
				System.out.println("Ba");
				break;
			case 4:
				System.out.println("Bốn");
				break;
			case 5:
				System.out.println("Năm");
				break;
			case 6:
				System.out.println("Sáu");
				break;
			case 7:
				System.out.println("Bảy");
				break;
			case 8:
				System.out.println("Tám");
				break;
			case 9:
				System.out.println("Chín");
				break;
		}
		return 0;
	}
	
	public static void readTens(int number) {
		if(number == 0) {
			System.out.println("");
			return;
		}
		switch (number / 10) {
			case 0:
				System.out.print("linh ");
				break;
			case 1:
				System.out.print("mười ");
				break;
			case 2:
				System.out.print("hai mươi ");
				break;
			case 3:
				System.out.print("ba mươi ");
				break;
			case 4:
				System.out.print("bốn mươi ");
				break;
			case 5:
				System.out.print("năm mươi ");
				break;
			case 6:
				System.out.print("sáu mươi ");
				break;
			case 7:
				System.out.print("bảy mươi ");
				break;
			case 8:
				System.out.print("tám mươi ");
				break;
			case 9:
				System.out.print("chín mươi ");
				break;
		}
		
	}
	
	public static void readHundred(int number) {
		switch (number / 100) {
			case 1:
				System.out.print("Một trăm ");
				break;
			case 2:
				System.out.print("Hai trăm ");
				break;
			case 3:
				System.out.print("Ba trăm ");
				break;
			case 4:
				System.out.print("Bốn trăm ");
				break;
			case 5:
				System.out.print("Năm trăm ");
				break;
			case 6:
				System.out.print("Sáu trăm ");
				break;
			case 7:
				System.out.print("Bảy trăm ");
				break;
			case 8:
				System.out.print("Tám trăm ");
				break;
			case 9:
				System.out.print("Chín trăm ");
				break;
	}
	}
}