package generic;

public class Ex03 {
	public static void main(String[] args) {
		Ilist<String> sequences = new JavaList<>();
		sequences.add("how are you?");
		sequences.add("enjoy our page");
		sequences.add("how are you?");
		sequences.add("enjoy our page");
		sequences.add("how are you?");
		sequences.add("enjoy our page");

		System.out.println("size: " + sequences.size());
		sequences.show();
		
		System.out.println("count: " + sequences.count(str -> str.startsWith("how")));
	}
}
