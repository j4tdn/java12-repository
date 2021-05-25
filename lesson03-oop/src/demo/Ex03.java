package demo;

import bean.Car;

public class Ex03 {

	public static void main(String[] args) {
		int p1=10;
		int p2=20;
		int p3=10;
		
		compare("p1==p2",p1==p2);
		compare("p1==p3",p1==p3);
		System.out.println("====================================");
		
		
		
		String o1=new String("Hello");
		String o2="Hello";
		String o3="Hello";
		
		//Demo compare 2 objects' address
		hash("o1",o1);
		hash("o2",o2);
		hash("o3",o3);
		
		compare("o1==o2",o1==o2); //false
		compare("o1==o3",o1==o3); //false	
		compare("o2==o3",o2==o3); //true	
		
		// Demo compare content of objects
		System.out.println("o1 and o2: "+o1.equals(o2));
		System.out.println("o1 and o3: "+o1.equals(o3));
		System.out.println("o2 and o3: "+o2.equals(o3));
		
		System.out.println("====================================");
		Car c1=new Car();
		Car c2=new Car();
		Car c3=null;
		
		compare("c1,c2",c1==c2);
		compare("c1,c3",c1==c3);
		compare("c2,c3",c2==c3);
		
		System.out.println("===");
		compare("c1,c2",c1.equals(c2));
		compare("c1,c3",c1.equals(c3));
		compare("c2,c3",c2.equals(c3));
	}
	
	private static void hash(String string, String input) {
		// TODO Auto-generated method stub
		System.out.println(System.identityHashCode(input));
	}

	//operator: ==
	//Compare 2 stack's values :So sánh 2 địa chỉ , ko quan tâm đến giá trị
	private static void compare(String text,boolean result) {
		System.out.println(text +": "+ result);
	}
}
