
package operator;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=8;
		int result=number++ + 10;

		System.out.println(number);
		System.out.println(result);

		System.out.println(!true);
		
		boolean isEven=isEvent(7);
		
		if(isEven) System.out.println("So chan");
		if(!isEven) System.out.println("So le");
		
		
		//Conditon operator
		
	}

	private static boolean isEvent(int input) {
		return (input % 2==0);
	}
}