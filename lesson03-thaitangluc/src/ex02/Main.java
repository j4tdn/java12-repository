package ex02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		VeHicles veh= new VeHicles();
		Scanner ip = new Scanner(System.in);
		int key;
		do {
			System.out.println("Chon cong viec: ");
			System.out.println("1. Nhap thong tin va tao cac doi tuong");
			System.out.println("2. Xuat bang ke khai tien thue");
			System.out.println("3. Thoat");
			key = ip.nextInt();
			switch (key) {
				case 1:
					veh.insertInf();
					break;
				case 2: {
					veh.show();
					break;						
				}
			}
		
		}while(key!=3);

	}

	
	
}
