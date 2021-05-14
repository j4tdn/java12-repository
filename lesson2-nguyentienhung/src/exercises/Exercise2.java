package exercises;

public class Exercise2 {
	// Hàm tính giai thừa
	public static long GiaiThua(int number) {
		if (number == 1 || number == 0)
			return 1;
		else
			return GiaiThua(number - 1) * number;
	}

	public static void main(String[] args) {
		System.out.println(GiaiThua(4) + GiaiThua(7) + GiaiThua(12) + GiaiThua(18));
	}

}
