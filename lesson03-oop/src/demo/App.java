package demo;

import bean.Box;

public class App {
	public static void main(String[] args) {
		//init 2 boxes
		//box1: w8 h4
		//box2: w6 h3
		
		//int a = 10; //stack
		Box box1 = new Box();
		box1.setWidth(8);
		box1.setHeight(4);
		
		Box box2 = new Box();
		box2.setWidth(6);
		box2.setHeight(3);
		
		Box box3 = new Box(2,1);
		
		System.out.println(box1);
		System.out.println(box2);
		System.out.println(box3);

		
	}
}
