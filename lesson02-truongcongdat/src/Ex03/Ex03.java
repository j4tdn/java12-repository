package Ex03;

public class Ex03 {
	public static void main(String[] args) {
		int number = 121;
		if (isSymmetry(number))
			System.out.println(number + " là số đối xứng.");
		else
			System.out.println(number + " không là số đối xứng.");
	}

	// Kiểm tra số đó có phải là số đối xứng hay không
	private static boolean isSymmetry(int number) {
		int temp = 0;
		int thuong = number;
		// 121
		while (thuong != 0) {
			temp = temp * 10 + thuong % 10;
			thuong /= 10;
		}
		return temp == number;
	}
}
