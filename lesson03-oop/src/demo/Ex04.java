package demo;

import bean.CarAdv;

public class Ex04 {
	public static void main(String[] args) {
		//Demo static
		CarAdv c1 = new CarAdv(1,"Green");
		CarAdv c2 = new CarAdv(2,"Red");
		CarAdv c3 = new CarAdv(3,"Blue");

		CarAdv.model = "Audi";
//		c1.model = "Agent";//->c1,c2,c3 all Agent because update value static  
		
		System.out.println("c1: "+c1);
		System.out.println("c2: "+c2);
		System.out.println("c3: "+c3);

		//static : don't care to value calling
		//nonstatic: phu thuoc vao gia tri cua thuoc tinh ben trong doi tuong Helper
	}
}
