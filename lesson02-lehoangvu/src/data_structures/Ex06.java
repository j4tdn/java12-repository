package data_structures;

public class Ex06{
	public static void main(String[] args) {

		int dem = 0, vitri = 200;

		for (int i = 0; i < 2000; i++) {
			if (isPrimeNumber(i))

			{
				++dem;
				if (dem == vitri) {
					System.out.println("Vi tri  " + dem + " " + i);
					break;
				}
			}
		}
	}

	public static boolean isPrimeNumber(int n) {
		//  so nguyen n < 2 khong phai la so nguyen to
		if (n < 2) {
			return false;
		}
		// check so nguyen to khi n >= 2
		int squareRoot = (int) Math.sqrt(n);
		for (int i = 2; i <= squareRoot; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}