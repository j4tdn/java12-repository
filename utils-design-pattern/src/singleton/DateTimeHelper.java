package singleton;

public class DateTimeHelper {
	/**
	 * Singleton pattern: class has only one instance follove java Canlendar class
	 * 
	 */
	private static DateTimeHelper instance = null;

	private DateTimeHelper() {

	}

	public static DateTimeHelper getInstance() {
		if (instance == null) {
			instance = new DateTimeHelper();
		}
		return instance;
	}
}
