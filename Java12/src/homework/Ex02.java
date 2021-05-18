package homework;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Ex02 {
	private static final Random rd = new Random();
	private static final String SYSTEM_USERNAME = "admin";
	private static final String SYSTEM_PASSWORD = "287";

	public static void main(String[] args) {
		String username = "admin";
		String password = null;
		String[] wp = new String[1000];
		int i = 0, noe = 1;
		do {
			password = "" + rd.nextInt(10) + rd.nextInt(10) + rd.nextInt(10);

			// require max 1000 unique elements
			// print random elements
			if (contains(wp, password, i)) {
				continue;
			}
			wp[i++] = password;
			sleep(10);
			System.out.print(password + " ");
			if (noe++ % 13 == 0) {
				System.out.println();
			}

		} while (!logIn(username, password));

		System.out.println("\n==========login successful=========");
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);

		System.out.println("Noe: " + noe);
		System.out.println("Elements: " + i);

	}

	private static boolean contains(String[] wp, String password, int nonNullsize) {
		for (int i = 0; i < nonNullsize; i++) {
			if (wp[i].equals(password)) {
				return true;
			}
		}
		return false;
	}

	private static boolean logIn(String username, String password) {

		return username.equals(SYSTEM_USERNAME) && password.equals(SYSTEM_PASSWORD);

	}

	private static void sleep(int mls) {
		try {
			TimeUnit.MILLISECONDS.sleep(mls);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
