package immutable;

public class Ex06 {
	public static void main(String[] args) {
		// Print 102-190-798-228

		String[] ids = { "102", "190", "798", "228" };

		String value = String.join("-", ids);
		String value2=String.join("-", "102", "190", "798", "228");
		System.out.println(value);
		System.out.println(value2);

		System.out.println("==============");
		String a = "asd";
		String b = "ssss";

		printf(a, b);
		
		printf(1,2,3);
	}

	// ... variables: giống mảng và ta có thể truyền trực tiếp tham số
	private static void printf(String... ids) {
		for (String id : ids) {
			System.out.print(id+" ");
			
		}
		System.out.print("\n");
	}
	
	private static void printf(int... ids) {
		for (int id : ids) {
			System.out.print(id+" ");
		}
	}
}
