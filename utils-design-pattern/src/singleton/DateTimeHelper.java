package singleton;

/**
 * Singleton pattern : class has only one instance
 * Follow Java Calendar class
 */
public class DateTimeHelper {
		
		private int day;
		private int month;
		private int year;
		
		
		public int getDay() {
			return day;
		}

		public void setDay(int day) {
			this.day = day;
		}

		public int getMonth() {
			return month;
		}

		public void setMonth(int month) {
			this.month = month;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}
		
		@Override
		public String toString() {
			return "DateTimeHelper [day=" + day + ", month=" + month + ", year=" + year + "]";
		}

		
//		public static void setInstance(DateTimeHelper instance) {
//			DateTimeHelper.instance = instance;
//		}

		public static DateTimeHelper instance = null;
		
		private DateTimeHelper() {
			
		}
		
		public static DateTimeHelper getInstance() {
			if(instance == null) {
				instance =  new DateTimeHelper();
			}
			return instance;
		}

}
