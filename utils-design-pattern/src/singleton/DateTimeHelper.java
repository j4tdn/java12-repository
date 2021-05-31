package singleton;

/***
 * 
 * Singleton parttern: class has only one íntance
 * follow Java Calendar class
 *
 */
public class DateTimeHelper {
	
	private static DateTimeHelper instance = null;
	
	private DateTimeHelper() {
		
	}
	
	public static DateTimeHelper getInstance() {
		if(instance == null) {
			instance = new DateTimeHelper();
		}
		return instance;
	}
}
