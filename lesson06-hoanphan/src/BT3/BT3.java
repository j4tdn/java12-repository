package BT3;

import java.util.Scanner;
public class BT3 {
	public static Scanner sc = new Scanner(System.in);
	/**
	 *  Biểu thức chính quy: ^[a-z][a-z0-9_]{2,30}@[a-z]{2,10}(\\.[a-z]{2,10}){1,2}$
	 * 		^abc$: Yêu cầu phải khớp với chuỗi abc
	 * 		[a-z][a-z0-9_]{2,30}: Chuỗi phải bắt đầu bằng 1 ký tự thường, sau đó có thể là ký tự thường hoặc số hoặc dấu '_', 
	 * 			{2,30} : chuỗi trước nó phải nằm trong khoảng 2 đến 50 ký tự
	 * 		@[a-z]{2,10} : sau ký tự '@' phải bắt đầu bằng 1 chữ thường và phải có độ dài từ 2 đến 10 ký tự
	 * 		(\\.[a-z]{2,10}){1,2} : sau dấu '.' sẽ là từ 2 đến 10 ký tự thường và được lặp lại tối đa 2 lần
	 */
	public static void main(String[] args) {
		do {		
			System.out.print("Enter your email: ");
			String email = sc.nextLine();
			if(email.matches("^[a-z][a-z0-9_]{2,50}@[a-z]{2,10}(\\.[a-z]{2,10}){1,2}$")) {
				System.out.println(email + " : Email Correct !!");
				break;
			} else {
				System.out.println(email + " : Email Wrong !!");
			}
		
		} while (true);
	
	}
}