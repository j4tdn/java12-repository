package generic;

public class Ex03 {
	public static void main(String[] args) {
		IList<String> sequences = new JavaList();
		sequences.add("how are you");
		sequences.add("enjoy our page");
		sequences.add("how are you");
		sequences.add("enjoy our page");
		sequences.add("how are you");
		sequences.add("enjoy our page");
		
		sequences.show();
		
		System.out.println("size:" +  sequences.size());
		
		
	}
}
