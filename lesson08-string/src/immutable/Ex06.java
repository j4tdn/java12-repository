package immutable;

public class Ex06 {
	public static void main(String[] args) {
		String[] ids = {"102", "190", "789", "228"};
		// Print: 102-190-789-228 => Join with delimiter
		
		System.out.println(String.join("-", ids));

		printf("11", "22");
		
	}
	
	// ... variables
	private static void printf(String... ids) {
		for (String id: ids) {
			System.out.println(id);
		}
	}
}
