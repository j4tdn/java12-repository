package ex03;
public class Ex03 {
	static String input = "xyz";

	public static void main(String[] args) {
		permutation("", input);
	}

	private static void permutation(String prefix, String input) {
		int n = input.length();
		// nếu string rỗng
		if (n == 0)
			System.out.println(prefix);
		else {
			for (int i = 0; i < n; i++) {
				char c = input.charAt(i);

				// Các kí tự còn lại sau khi loại bỏ kí tự c
				String ros = input.substring(0, i) + input.substring(i + 1);

				permutation(prefix + c, ros);
			}
		}
	}
}
