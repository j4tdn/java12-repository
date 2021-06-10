package ex01;

public class Ex01 {
	static int count = 0;

	public static void main(String[] args) {
		int[] input = { 3, 15, 21, 0, 15, 17, 21 };
		int[] output = getUniqueNumbers(input);
		System.out.print("Output: ");
		for (int i = 0; i < count; i++) {
			System.out.print(output[i] + ", ");
		}
	}

	private static int[] getUniqueNumbers(int[] input) {
		int[] output = new int[input.length];
		int tmp;
		for (int i = 0; i < input.length; i++) {
			if (!isExit(input, input[i], i)) {
				output[count] = input[i];
				count++;
			}
		}
		for (int i = 0; i < count - 1; i++) {
			if (output[i] > output[i++]) {
				tmp = output[i];
				output[i] = output[i++];
				output[i++] = tmp;
			}
		}
		return output;
	}

	private static boolean isExit(int[] input, int value, int index) {
		for (int i = 0; i < input.length; i++) {
			if (input[i] == value && i != index) {
				return true;
			}
		}
		return false;
	}
}
