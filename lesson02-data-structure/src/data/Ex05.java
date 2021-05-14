package data;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a = 10;
		Integer b = 20;
		swap(a, b);
		System.out.println("a:"+a);
		System.out.println("b:"+b);

	}

	private static void swap(Integer first, Integer Second) {
		Integer temp = first;
		first = Second;
		Second = first;
	}

}
