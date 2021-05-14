
import java.util.Scanner;
import java.util.Arrays;

public class Ex09 {

	public static boolean SoHanhPhuc(int n) {
		int f = n;
		int m = n;
		if (n <= 100)
			return true;
		int count = 0;
		while (f != 0) {
			f /= 10;
			count++;
		}
		int[] arr = new int[count];
		for (int i = 0; i < count; i++) {
			arr[i] = m % 10;
			m /= 10;
		}
		Arrays.sort(arr);
		int count1 = 0;
		for (int i = 0; i < count - 1; i++) {
			if (arr[i] != arr[i + 1])
				++count1;
		}
		if (count1 > 1)
			return false;

		return true;
	}

	public static void main(String[] args) {
		int n;
		int count = 0;
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		for (int i = 0; i < n; i++) {
			if (SoHanhPhuc(i)) {
				System.out.println(i);
				++count;
			}
		}

		System.out.println(count);
	}

}
