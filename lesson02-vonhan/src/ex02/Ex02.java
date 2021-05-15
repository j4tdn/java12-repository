//tính tổng của 4!+7!+12!+18!
package ex02;

public class Ex02 {
	public static void main(String[] args) {
		 long s = giaithua(4) + giaithua(7) + giaithua(12) + giaithua(18);
		 System.out.println("Tổng  là : " + s);
	}
	
	public static long giaithua(int num) {
		if(num <= 1) return 1;
		else return num * giaithua(num -1);
	}
}
