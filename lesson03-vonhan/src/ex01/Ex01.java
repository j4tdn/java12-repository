package ex01;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Nhập hoành độ tâm O của đường tròn:  ");
		int x0 = Integer.parseInt(ip.nextLine());
		
		System.out.println("Nhập tung độ tâm O của đường tròn:  ");
		int y0 = Integer.parseInt(ip.nextLine());
		
		System.out.println("Nhập bán kính R :  ");
		double R = Double.parseDouble(ip.nextLine());
		
		System.out.println("Nhập hoành độ điểm A :  ");
		int xA = Integer.parseInt(ip.nextLine());
		
		System.out.println("Nhập tung độ điểm A :  ");
		int yA = Integer.parseInt(ip.nextLine());
		
		System.out.println(checkPosition(x0, y0, xA, yA, R));

	}
	
	public static String checkPosition(int x0, int y0, int xA, int yA, double R) {
		double distance = Math.sqrt((xA-x0)*(xA-x0) + (yA-y0)*(yA-y0));
		
		if(distance < R) {
			return "Điểm A nằm trong đường tròn";
		}
		if(distance == R) {
			return "Điểm A nằm trên đường tròn";
		}
		return "A nằm ngoài đường tròn";
	}
	
}
