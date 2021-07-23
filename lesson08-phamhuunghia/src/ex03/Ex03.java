package ex03;

import java.text.Normalizer;
import java.util.regex.Pattern;

import utils.Utils;

public class Ex03 {
	
	public static void main(String[] args) {
		System.out.println("Nhập");
		String name=Utils.sc.nextLine();
		System.out.println(removeAccent(name));
	}
	public static String removeAccent(String s) {
		  
		  String temp = Normalizer.normalize(s, Normalizer.Form.NFD);
		  Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
		  return pattern.matcher(temp).replaceAll("");
		 }
}
