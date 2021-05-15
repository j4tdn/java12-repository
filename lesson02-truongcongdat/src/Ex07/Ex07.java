package Ex07;

import java.util.Random;

public class Ex07 {
	// Viết chương trình random 5 số nguyên ngẫu nhiên từ 20 – 30.
	private static int N = 5;

	public static void main(String[] args) {
		System.out.println("---------RANDOM--------");
		for (int i = 0; i < N; i++) {
			System.out.println(random(20, 30));
		}
	}

	public static int random(int first, int second) {
		Random rand = new Random();
		return first + rand.nextInt(second - first + 1);
	}
}
