package Ex03;

import java.util.Scanner;

public class App {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean check = false;
		while (!check) {
		
			System.out.println("Nhap dia chi Email");
			String s = sc.nextLine();
			if (s.matches("^[a-zA-Z]+@?.*[\\S?][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$")) {
				System.out.println("Email hợp lệ");
				check = true;
			} else {
				System.out.println("vui long nhap lai dia chi Email");
			}
		}

	}
}
