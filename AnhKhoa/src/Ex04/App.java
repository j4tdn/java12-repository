package Ex04;

public class App {
	private static String s ="Welcome   to JAVA10  class";
	private static StringBuilder str;
	public static void main(String[] args) {
		String [] string = s.split("\\s+");
		String result = "";
		for(String item : string)
		{
			str = new StringBuilder(item);
			result+= str.reverse()+" ";
		}
		
		result= result.trim();
		System.out.println(result);
	}
}
