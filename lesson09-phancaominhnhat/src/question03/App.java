package question03;

public class App {
	public static void main(String[] args) {
		String inputString = "xyz";
		
		hoanVi(inputString, "");
	}
	
	public static void hoanVi(String inputString, String ketqua) {
		if(inputString.length() == 0) {
			System.out.println(ketqua + " ");
			return;
		}
		
		for(int i = 0; i < inputString.length(); i++) {
			
			char ch = inputString.charAt(i);
			String outputString = inputString.substring(0, i) + inputString.substring(i + 1);
			
			hoanVi(outputString, ketqua + ch);
		}
	}
}
