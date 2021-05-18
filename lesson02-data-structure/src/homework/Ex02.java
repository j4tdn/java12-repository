package homework;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Ex02 {
	
	private static final Random rd = new Random();
	
	// from system
	private static final String SYSTEM_USERNAME = "admin";
	private static final String SYSTEM_PASSWORD = "259";
	
	public static void main(String[] args) {
		// input from user
		String username = "admin";
		String password = null;
		int noe = 1; int i = 0;
		String[] wp = new String[1000]; // 1000 null elements
		do {
			// max: 1000
			password = "" + rd.nextInt(10) +  rd.nextInt(10) +  rd.nextInt(10);
			
			// require: max 1000 unique elements
			// i: nonNullSize
			if (contains(wp, password, i)) {
				continue;
			}
			
			// put unique element into array
			wp[i++] = password;
			
			
			// print random element
			sleep(10);
			System.out.print(password + "  ");
			if (noe++ % 13 == 0) {
				System.out.println();
			}
		} while(!logIn(username, password));
		
		System.out.println("\n============ LogIn Successful ============");
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
		
		System.out.println("NOE: " + noe);
	}
	
	private static boolean contains(String[] wp, String password, int nonNullSize) {
		// null.equals("text"); => NPE
		// "text".equals(null); => false
		for (int i = 0; i < nonNullSize; i++) {
			if (password.equals(wp[i])) {
				return true;
			}
		}
		return false;
	}

	private static boolean logIn(String usename, String password) {
		return usename.equals(SYSTEM_USERNAME) && password.equals(SYSTEM_PASSWORD);
	}
	
	private static void sleep(int timeout) {
		// todo: try-catch
		try {
			TimeUnit.MILLISECONDS.sleep(timeout);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
