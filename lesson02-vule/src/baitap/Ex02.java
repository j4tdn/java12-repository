package baitap;

public class Ex02 {
	public static void main(String[] args) {

		int a = 4;
		int b = 7;
		int c = 12;
		int d = 18;
		// int s = (Ex02.tinhGiaithua(a) + Ex02.tinhGiaithua(b) + Ex02.tinhGiaithua(c)
		// +Ex02.tinhGiaithua(d));

		System.out.println("Giai thừa của " + a + " là: " + Ex02.tinhGiaithua(a));
		System.out.println("Giai thừa của " + b + " là: " + Ex02.tinhGiaithua(b));
		System.out.println("Giai thừa của " + c + " là: " + Ex02.tinhGiaithua(c));
		System.out.println(
				"S = " + (Ex02.tinhGiaithua(a) + Ex02.tinhGiaithua(b) + Ex02.tinhGiaithua(c) + Ex02.tinhGiaithua(d)));
	}

	
	public static long tinhGiaithua(int n) {
		long giai_thua = 1;
		if (n == 0 || n == 1) {
			return giai_thua;
		} else {
			for (int i = 2; i <= n; i++) {
				giai_thua *= i;
			}
			return giai_thua;
		}
	}

}
