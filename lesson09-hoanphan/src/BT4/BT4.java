package BT4;

public class BT4 {

	public static void main(String[] args) {
		String s="Welcome     to JAVA10   class";
		System.out.println("Input: "+s);
		s =s.replaceAll("\\s+"," ").trim();
		System.out.println("Spacing: "+s);

		System.out.println("ReverseWord: "+reverseWord(s));
		System.out.println("===============");
		
	}
	public static String reverseWord(String str){  
	    String words[]=str.split("\\s");  
	    String reverseWord="";  
	    for(String w:words){  
	        StringBuilder sb=new StringBuilder(w);  
	        sb.reverse();  
	        reverseWord+=sb.toString()+" ";  
	    }  
	    return reverseWord.trim();  
	}  
	
}
