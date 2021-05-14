package operator;

public class Ex01 {
	public static void main(String[] args) {
		// Toan tu mot ngoi
		int number = 8;
		//n++ <=> n= n+1 <=> n+=1
		//operator: prefix, suffix
		int result = number++ +10;
		System.out.println(number);	
		System.out.println(--result);
		
		System.out.println(!true);
		
		boolean isEven = isEven(8);
		if(isEven) {//true
			System.out.println("so chan");
		}
		if(!isEven) {//false
			System.out.println("so le");
		}
		
		int a= 2;
		int b = 2;
		//T  F  No
		if(a>3 && b++>3) {
			System.out.println("OK condition");
		}
		System.out.println(b);//b = 2 nghia la ve sau k thuc thi
		
		int c=2;
		int d=2;
		if(c>1 || d++>3) {
			System.out.println("OK condition!!!");
		}
		System.out.println(b);//b = 2 nghia la ve sau k thuc thi
	}
	private static boolean isEven (int input) {
		return input % 2 == 0;
	}

}
