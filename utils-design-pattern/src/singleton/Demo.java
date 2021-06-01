package singleton;

public class Demo {

	public static void main(String[] args) {
		
		DateTimeHelper d1 = DateTimeHelper.getInstance();
		DateTimeHelper d2 = DateTimeHelper.getInstance();
		hash(d1);
		hash(d2);

	}

	private static void hash(DateTimeHelper d1) {
		System.out.println(System.identityHashCode(d1));
	}
}
