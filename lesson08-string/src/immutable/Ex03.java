package immutable;

public class Ex03 {
	/**
	 * 1. Tính chiều dài của chuỗi s
	 * 2. Nối chuỗi s1 vào chuỗi s
	 * 3. Lấy một ký tự tại vị trí index trong chuỗi s
	 * 4. Duyệt từng phần tử trong chuỗi
	 * 5. Tìm vị trí xuất hiện đầu tiên, cuối cùng của kí tự  trong chuỗi s
	 */
	public static void main(String[] args) {
		String s = "Box"; // H1
		System.out.println("Length: " + s.length());
		
		s = s + "Layout"; // H2
		s = s.concat("Layout");
		System.out.println("2: " + s);
		
		System.out.println("chatAt(4): " + s.charAt(4));
		
		// for index
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i) + "---");
		}
		
		System.out.println("\nindexOf: " + s.indexOf("x"));
		System.out.println("\nindexOf: " + s.indexOf("Box"));
		System.out.println("lasIndexOf: " + s.lastIndexOf("t"));
	}
}
