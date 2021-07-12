package ex04;

public class Ex04 {
	public static void main(String[] args) {
		String s = "   WELCOME to JAVA10 class   ";
		System.out.println(s);
		// s="Nguyen Van Teo";
		s = s.trim();
		String[] arr = s.split(" ");
		String sToiUu = "";
		for (String tu : arr) {
			if (tu.trim().length() != 0)
				sToiUu += tu + " ";
		}
		sToiUu = sToiUu.trim();
		
		String[] arr1 = sToiUu.split(" ");
		for (String item : arr1) {
              StringBuilder str = new StringBuilder(item);
              System.out.print(str.reverse().toString()+" ");
		}
	}
}
