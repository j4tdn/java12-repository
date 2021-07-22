package baitap3;

import java.text.Normalizer;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		String str = "Em có yêu anh không anh để anh biết còn chờ";
		
		System.out.println(chuyenChuoiKhongDau(str));
	}
	
	private static String chuyenChuoiKhongDau(String str) {
		try {
			String temp = Normalizer.normalize(str, Normalizer.Form.NFD);
			
	        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");

	        return pattern.matcher(temp).replaceAll("");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
