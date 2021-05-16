package data;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer age=20;
		System.out.println("Hash age 1: "+System.identityHashCode(age));
		age=30;
		System.out.println("Hash age 2: "+System.identityHashCode(age));
		increse(age);	
		System.out.println("Hash age 3: "+System.identityHashCode(age));
		
		
		
		int a=20;
		a=30;	
	}

	private static void increse(Integer input) {
		input += 1;
	}

}