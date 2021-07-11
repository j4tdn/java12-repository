package immutable;

public class Ex06 {
	public static void main(String[] args) {
		String[] ids = {"102","190","789","228"};
		//print 102-190-789-228 =>join
		
		System.out.println(String.join("-", ids));
		
		String a="";
		String b="";
		
		printf("111","222","33");
	}
	
	// ... variables
	private static void printf(String... ids) {
		for(String id: ids) {
			System.out.println(id);
		}
	}
}