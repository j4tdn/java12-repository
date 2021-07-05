package immutable;

import java.util.Iterator;

public class Ex03 {
public static void main(String[] args) {
	String s="Box";
	System.out.println("Length: "+s.length());
	
	s=s+"Layout";
	s=s.concat("Layout: ");
	System.out.println("2: "+s);
	
	s.charAt(4);
	System.out.println("charAt(4): "+s.charAt(4));
	
	//for index
	
	for(int i=0;i<s.length();i++) {
		System.out.println(s.charAt(i)+".........");
	}
	
	System.out.println("\nindexOf: "+s.indexOf("x"));
	System.out.println("\nindexOf: "+s.indexOf("box"));
	System.out.println("\nlastindexOf: "+s.lastIndexOf("t"));
}
}
