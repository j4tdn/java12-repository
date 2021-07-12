package question04;

public class App {
	public static void main(String[] args) {
		String str = "    Welcome    to   JAVA10   class   ";
		String result = "";
		str = str.trim().replaceAll("\\s+", " ");
		String[] arrStr = str.split(" ");
		for(int i = 0; i < arrStr.length; i++) {
			StringBuilder strBuilder = new StringBuilder(arrStr[i]);
			result += daoChuoi(strBuilder) + " ";
		}
		System.out.println(result);
	}
	
	public static String daoChuoi(StringBuilder str) {
		return str.reverse().toString();
	}
}
