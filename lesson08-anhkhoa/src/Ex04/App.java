package Ex04;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		System.out.println(Same(75, 15));
	}

	private static List<Integer> FindDivisor(int number) {
		List<Integer> collect = new ArrayList<>();
		for (int i = 1; i <= number; i++) {
			if (number % i == 0)
				collect.add(i);
		}
		return collect;
	}

	private static boolean PrimeNumber(int number) {
		for (int i = 2; i < number / 2; i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}

	private static List<Integer> SameNumber(List<Integer> a, List<Integer> b) {
		List<Integer> rs = new ArrayList<>();
		for (Integer item : a) {
			for (Integer itemm : b) {
				if (item == itemm)
					rs.add(item);
			}
		}
		return rs;
	}

	private static boolean Same(int a, int b) {
		List<Integer> rs1 = FindDivisor(a);
		List<Integer> rs2 = FindDivisor(b);
		List<Integer> rs3 = SameNumber(rs1, rs2);
		List<Integer> rs4 = new ArrayList<>();
		for (Integer item : rs3) {
			if (PrimeNumber(item))
				rs4.add(item);
		}
		if (rs4.size() < 1)
			return false;
		return true;
	}
}
