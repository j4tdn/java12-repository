package ex01;

import utils.Utils;

public class EX01 {
	public static void main(String[] args) {
		String s2=Utils.sc.nextLine();
		
		print1(s2);
		print2(s2);
		print3(s2);
		
	}
	private static void print3(String input) {
		System.out.println("\n============ Dao chuoi========");
		for(int i=0;i<input.length();i++) {
			System.out.print(input.charAt(input.length()-i-1)+" ");
		}
		
	}
	static void print1(String input) {
		System.out.println("\n============ In ký tự trên 1 dòng========");
		for(int i=0;i<input.length();i++) {
			System.out.print(input.charAt(i)+" ");
		}
	}
	static void print2(String input) {
		System.out.println("\n============ In ký tự trên mỗi dòng========");
		for(int i=0;i<input.length();i++) {
			System.out.println(input.charAt(i));
		}
	}
	
	
}
