package generic;

public class Ex03 {
	public static void main(String[] args) {
		IList<String> sequences = new JavaList<>();
		sequences.add("what's up");
		sequences.add("enjoy our page");
		sequences.add("stay safe and take care");
		
		System.out.println("size: " + sequences.size());
		System.out.println("count " + sequences.count(e -> e.startsWith("stay")));
		sequences.show();
	}
}