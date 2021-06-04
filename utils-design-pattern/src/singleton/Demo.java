package singleton;

public class Demo {
	public static void main(String[] args) {
		DateTimeHelper d1 = DateTimeHelper.getInstance();
		DateTimeHelper d2 = DateTimeHelper.getInstance();
		
		d1.setDay(21);
		d2.setMonth(4);
		d1.setYear(2021);
		System.out.println(d2);
		
		hash(d1);
		hash(d2);
	}
	
	private static void hash(DateTimeHelper input) {
		System.out.println(System.identityHashCode(input));
	}
}
