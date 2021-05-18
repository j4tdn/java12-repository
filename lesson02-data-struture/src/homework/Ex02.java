package homework;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Ex02 {
	private static final Random rd = new Random();
	private static final String SYSTEM_USERNAME = "admin";
	private static final String SYSTEM_PASSWORD = "259";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username = "admin";
		String password = null;
		int noe = 1;
		String[] wp = new String[1000]; // 1000 null elements
		int i = 0;
		do {
			password = "" + rd.nextInt(10) + rd.nextInt(10) + rd.nextInt(10);
			if (contains(wp, password, i)) {
				continue;
			}

			wp[i++] = password;
			sleep(10);

			System.out.print(password + " ");
			if (noe % 13 == 0) {
				System.out.println();
			}
			noe++;
		} while (!LogIn(username, password));

		System.out.println("\n===========Login Sucsecc");
		System.out.println("User name: " + username);
		System.out.println("pass: " + password);
	}

	private static boolean contains(String[] wp, String password, int nonNullSize) {
		for (int i = 0; i < nonNullSize; i++) {
			if (password.equals(wp[i])) {
				return true;
			}
		}
		return false;
	}

	private static boolean LogIn(String username, String password) {
		// TODO Auto-generated method stub
		return username.equals(SYSTEM_USERNAME) && password.equals(SYSTEM_PASSWORD);
	}

	private static void sleep(int timeout) {
		try {
			TimeUnit.MILLISECONDS.sleep(timeout);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
