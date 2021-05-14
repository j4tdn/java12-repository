package exercises;

public class Exercise6 {
	//Hàm kiểm tra số nguyên tố
	public static boolean KiemTraSNT(int n) {
		if (n < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int count = 0;
		int i = 1, SNT;
		//Tìm số nguyên tố thứ 200
		do {
			if (KiemTraSNT(i)) {
				SNT = i;
				++count;
				if (count == 200)
					break;
			}
			i++;
		} while (true);
		//Xuất kết quả
		System.out.println("KQ: " + SNT);
	}

}
