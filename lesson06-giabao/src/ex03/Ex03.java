package ex03;

import java.util.Scanner;

public class Ex03 {
	// : @abc.com @abc abd acd@, @ahu@, abc@d : Không hợp lệ
	// a@b.com abc@gmail.com.vn : Hợp lệ
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String email = isRightEmail();
		System.out.println(email + ": is your Email address.");
	}

	private static boolean isAccepted(String email) {
		return email.matches("\\w+@\\w+\\.(?i)(?:com.vn|com|edu|outlook)");
	}

	// ^\\w+@\\w+(\\.\\[a-zA-Z]+)+$
	private static String isRightEmail() {
		String email = "";
		do {
			System.out.println("Enter the Email address:");
			email = sc.nextLine();
			if (isAccepted(email)) {
				break;
			} else {
				System.out.println("Error!");
			}
		} while (true);
		System.out.println("The address email is correct!");
		return email;
	}
}
