package bai4;

import java.util.Scanner;

public class Main {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		while(true) {
			try {
				System.out.print("\nEnter number: ");
				int number = Integer.parseInt(scanner.nextLine());
		
				String numString = number + "";
				
				// Đọc số 1 chữ số
				if(numString.length() == 1) {
					if(number == 0) {
						System.out.println("Không");
					}
					docHangDonVi(number);
				}
				
				// Đọc số 2 chữ số
				if(numString.length() == 2) {
					docHangChuc(number);
					switch (number % 10) {
					case 1:
						if(number / 10 != 1) {
							System.out.print("Mốt");
						} else {
							docHangDonVi(number % 10);
						}
						break;
					case 5:
						System.out.println("Lăm");
						break;
					default:
						docHangDonVi(number % 10);
					}
				}
				
				// Đọc số 3 chữ số
				if(numString.length() == 3) {
					docHangTram(number);
					docHangChuc((number % 100));

					switch ((number % 100) % 10) {
						case 1:
							if((number % 100) > 20) {
								System.out.println("Mốt");
							} else {
								docHangDonVi((number % 100) % 10);
							}
							break;
	
						case 5:
							if((number % 100) > 10) {
								System.out.println("Lăm");
							} else {
								docHangDonVi((number % 100) % 10);
							}
							break;
						default:
							docHangDonVi((number % 100) % 10);
							break;
					}
				}
			} catch (NumberFormatException e) {
				e.printStackTrace();
				sleep();
			}
		}
	}
	
	public static int docHangDonVi(int number) {
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
	
	public static void docHangChuc(int number) {
		if(number == 0) {
			System.out.println("");
			return;
		}
		switch (number / 10) {
			case 0:
				System.out.print("Linh ");
				break;
			case 1:
				System.out.print("Mười ");
				break;
			case 2:
				System.out.print("Hai mươi ");
				break;
			case 3:
				System.out.print("Ba mươi ");
				break;
			case 4:
				System.out.print("Bốn mươi ");
				break;
			case 5:
				System.out.print("Năm mươi ");
				break;
			case 6:
				System.out.print("Sáu mươi ");
				break;
			case 7:
				System.out.print("Bảy mươi ");
				break;
			case 8:
				System.out.print("Tám mươi ");
				break;
			case 9:
				System.out.print("Chín mươi ");
				break;
		}
		
	}
	
	public static void docHangTram(int number) {
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
	public static void sleep() {
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
