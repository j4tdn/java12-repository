package singleton;

public class Demo {

	public static void main(String[] args) {
		DateTimeHelper d1 = DateTimeHelper.getInstance();
		DateTimeHelper d2 = DateTimeHelper.getInstance();
		//d1 , d2 on 1 address
		hash(d1);
		hash(d2);
	}
	private static void hash(DateTimeHelper input) {
		System.out.println(System.identityHashCode(input));
	}
}
