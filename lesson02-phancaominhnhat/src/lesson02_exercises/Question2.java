package lesson02_exercises;

public class Question2 {

	public static void main(String[] args) {
		double sum = 0;
		sum = giaiThua(18);
		System.out.println("Tổng = " + sum);
	}
	public static double giaiThua(int number) {
		if(number == 1) {
			return 1;
		}
		return number*giaiThua(number-1);
	}

}
