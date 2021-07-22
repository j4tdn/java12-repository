package immutable;

public class Ex03 {
	/*
	 * 1.Tính chiều dài của chuối 
	 * 2.Nối chuỗi s1 vào chuỗi s 
	 * 3.Lấy ký tự từ một vị
	 * trí của chuỗi 4.Duyệt từng phần tử trong chuỗi 
	 * 5. Tìm vị trí xuất hiện đầu
	 * tiên, cuối cùng của ký tự trong chuỗi s
	 */
	public static void main(String[] args) {
		String s = "Box";
		System.out.println("Lenghth: " + s.length());

		// s += "Layout";
		s = s.concat("Layout");
		System.out.println(s);

		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i) + " ");
		}

		System.out.println("\nindexOf x: " + s.indexOf("x"));
		System.out.println("last index of y: " + s.lastIndexOf("y"));
		System.out.println("first index of Box: " + s.indexOf("Box")); // == last index of Box
	}

}
