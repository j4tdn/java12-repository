package immutable;

public class Ex06 {
	public static void main(String[] args) {
		String[] ids = {"102", "190", "789", "228"};
		// Prints: 102-190-789-228
		
		String value = String.join("-", ids);
		System.out.println(value);
		
		printf("11", "22");
	}
	
	// ... variables
	private static void printf(String... ids) {
		for(String id: ids) {
			System.out.println(id);
		}
	}
}
