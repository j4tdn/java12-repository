package data;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a=20;
         a=30;
         Integer age=20;
         //print obiect's memory address
         System.out.println("Hash age 1: "+System.identityHashCode(age));
         age=30;
         System.out.println("Hash age 2: "+System.identityHashCode(age));
         System.out.println("age 1:"+age);
         increase(age);
         System.out.println("age 2:"+age);
	}
private static void increase(Integer input) {
	input =input+1;
}
}

