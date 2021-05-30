package singleton;

public class Demo {
	public static void main(String[] args) {
		Integer a=10;
		Integer b=20;
		
		DateTimeHelper d1 = DateTimeHelper.getInstance();
		DateTimeHelper d2 = DateTimeHelper.getInstance();
		
		hash(d1);
		hash(d2);
	}
	private static void hash(DateTimeHelper input) {
		System.out.println(System.identityHashCode(input));
	}
}
