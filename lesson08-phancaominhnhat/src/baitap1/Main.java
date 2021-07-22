package baitap1;

public class Main {
	public static void main(String[] args) {
		String str = "Đây là chuỗi có dấu tiếng việt và dấu cách";
		
		inMoiKyTuMotDong(str);
		inMoiTuMotDong(str);
		inChuoiDaoNguoc(str);
	}
	
	private static void inMoiKyTuMotDong(String str) {
		for(int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}
	
	private static void inMoiTuMotDong(String str) {
		String[] arrStrings = str.trim().replace("\\s+", " ").split(" ");
		
		for(int i = 0; i < arrStrings.length; i++) {
			System.out.println(arrStrings[i]);
		}
	}
	
	private static void inChuoiDaoNguoc(String str) {
		String[] arrStrings = str.trim().replace("\\s+", " ").split(" ");
		int length = arrStrings.length;
		
		for(int i = 0; i < length / 2; i++) {
			String temp = arrStrings[i];
			arrStrings[i] = arrStrings[length - i - 1];
			arrStrings[length - i - 1] = temp;
		}
		
		for(int i = 0; i < length; i++) {
			System.out.print(inChuoiDaoNguocTheoTu(arrStrings[i]) + " ");
		}
	}
	
	private static String inChuoiDaoNguocTheoTu(String str) {
		StringBuilder stringBuilder = new StringBuilder(str);
		
		return stringBuilder.reverse().toString();
	}
}
