package ex04;


public class Ex04 {
	public static void main(String[] args) {
		String s = "Welcome    to     JAVA10     class    ";
		System.out.println("Chuỗi ban đầu: " + s);
		s = s.trim().replaceAll("\\s+", " ");
		System.out.println("Sau khi chuyển đổi: " + revert(s));

	}

	private static String revert(String input) {
		String[] arr = input.split(" ");
		String sReturn="";
		int i=0;
		while(i<arr.length) {
			String s = arr[i];
			arr[i++] =new StringBuffer(s).reverse().toString();	
		}
		sReturn=String.join(" ", arr);
		return sReturn;
	}

	
}
