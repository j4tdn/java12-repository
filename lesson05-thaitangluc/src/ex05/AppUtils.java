package ex05;

import java.util.Scanner;

public class AppUtils {
	
	public static void createData(Textbook[] data) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<3; i++) {
			sc.nextLine();
			System.out.println("Nhap du lieu sach giao khoa thu " + i);
			String idS = sc.nextLine();
			double cost = sc.nextDouble();
			String author = sc.nextLine();
			String status = sc.nextLine();
			
			data[i] = new Textbook(idS, cost, author, status);
		}
		
		for(int i = 3; i<5; i++) {
			sc.nextLine();
			System.out.println("Nhap du lieu sach tham khao thu " + i);
			String idS = sc.nextLine();
			double cost = sc.nextDouble();
			String author = sc.nextLine();
			double tax = sc.nextDouble();
			
			data[i] = new RefBook(idS, cost, author, tax);
		}
		
	}

	public static RefBook searchAuthor() {
		
	}
	
	public static 
}
