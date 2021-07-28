package ex04;


import java.util.ArrayList;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		long m = 0, n = 0;
		Scanner sc = new Scanner(System.in);
		ArrayList<Long> listM = new ArrayList<>();
		ArrayList<Long> listN = new ArrayList<>();

		m = Long.parseLong(sc.nextLine());
		n = Long.parseLong(sc.nextLine());
		
		for (long i = 2; i <= m; i++) {
			if (m % i == 0) {
				listM.add(i);
				while (m % i == 0) {
					m /= i;
				}
			}
		}

		for (long j = 2; j <= n; j++) {
			if (n % j == 0) {
				listN.add(j);
				while (n % j == 0) {
					n /= j;
				}
			}
		}
		
		if (isEqual(listM, listN)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

	private static boolean isEqual(ArrayList<Long> listM, ArrayList<Long> listN) {
		int maxLengthM = listM.size();
		int maxLengthN = listN.size();

		if (maxLengthM != maxLengthN) {
			return false;
		}

		for (int i = 0; i < maxLengthM; i++) {
			if (listM.get(i) != listN.get(i)) {
				return false;
			}
		}
		return true;
	}
}
