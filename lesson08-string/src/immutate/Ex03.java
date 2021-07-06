package immutate;

public class Ex03 {
	/**
	 1. Tính chiều dài của chuỗi s
	 2. Nối chuỗi s1 vào chuỗi s
	 3. Lấy một ký tự tại vị trí index trong chuỗi s
	 4. Duyệt từng phần tử trong chuỗi
	 5. Tìm vị trí xuất hiện đầu tiên, cuối cùng của kí tự  trong chuỗi s
	 */
	public static void main(String[] args) {
		String s = "box";
		System.out.println(s.length());
		
		s = s + "layout";
		s = s.concat("layout");
		System.out.println(s);
		
		System.out.println("charAt(4)" + s.charAt(4));
		
		System.out.println("indexOf" + s.indexOf("x"));
		System.out.println("indexOf : " + s.indexOf("box"));
		System.out.println("lastIndexOf : " + s.lastIndexOf("t"));
	}
}
