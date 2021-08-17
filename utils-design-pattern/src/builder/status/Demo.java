package builder.status;

public class Demo {
	public static void main(String[] args) {
		Status status = Status.builder().like(50).comment(3).build();
		Status s2 = Status.builder().share(30).build();
		System.out.println(s2);
		System.out.println(status);
	}
}
