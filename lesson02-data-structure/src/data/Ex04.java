package data;

public class Ex04 {

	public static void main(String[] args) {
		Integer oa = 20;
		Integer ob = 20;
         String s1="a";
         //...............
         String s100="b";
        
		Integer oc = new Integer(40);
		Integer od = new Integer(40);
	}
	private static void hash(String text,Integer input) {
		System.out.println(text+System.identityHashCode(input));
	}

}
