package Ex01;

public class Ex01 {
	// Kiểm tra lũy thừa của 2
	public static void main(String[] args) {
		int x = 8;
		boolean isExp2 = isExp2(x);
		if (isExp2) {
			System.out.println(x + " la luy thua cua 2");
		}
		if (!isExp2) {
			System.out.println(x + " KHONG la luy thua cua 2");
		}
	}

	private static boolean isExp2(int x) {
		if (x == 0 || x == 1)
			return true;
		int thuong = x / 2;
		int soDu = x % 2;
		if (soDu == 1)
			return false;
		return isExp2(thuong);
	}
}
