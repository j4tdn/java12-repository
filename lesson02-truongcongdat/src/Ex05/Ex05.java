package Ex05;

public class Ex05 {
	// Viết chương trình chuyển đổi một số tự nhiên ở hệ cơ số 10 thành số ở hệ
	// cơ số 2
	public static void main(String[] args) {
		int num = 9;
		System.out.println(num + " -> (BIN) " + decToBin(num));
	}

	private static String decToBin(int dec) {
		int bin[] = new int[50];
		int index = 0;
		String result = "";
		while (dec != 0) {
			bin[index++] = dec % 2;
			dec /= 2;
		}

		for (int i = index - 1; i >= 0; i--) {
			result += bin[i];
		}
		return result;
	}
}
