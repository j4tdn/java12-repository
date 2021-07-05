package immutable;

public class Ex03 {
	/**
	 * 1.Tính chiều dài của chuỗi s
	 * 2.Nối chuỗi s1 vào s
	 * 3.Lấy 1 ký tự tại vị trí 
	 * 4.Duyệt từng kí tự phần tử
	 * 5.Lấy vị trí đầu tiên cuối cùng
	 * @param args
	 */
	public static void main(String[] args) {
		String s= "Gia Bảo";
		System.out.println("length: " + s.length());
		
		s+= "Layout";
		//s=s.concat("Layout");
		System.out.println("2: "+s);
		
		System.out.println("CharAt(4): " +s.charAt(4));
		
		for(int i =0;i<s.length();i++) {
			System.out.println(s.charAt(i)+"----");
		}
		
		System.out.println("\nindexOf: " + s.indexOf("x"));
		System.out.println("lastindexof: " +s.lastIndexOf("o"));
	}
}
