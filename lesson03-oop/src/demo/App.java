package demo;

import bean.Box;

public class App {
	public static void main(String[] args) {
		// Initial 2 boxes
		// Box1: w8 h4
		// Box2: w6 h3
		int a = 10; //stack
		
		//Empty constructor:
		// - tên trùng với tên class
		// - ko có dl trả về

		Box box1 = new Box(); //def null
		box1.setWith(8);
		box1.setHeight(4);
		
		System.out.println("box1-w: "+ box1.getWidth());
		System.out.println("box1-h: "+ box1.getHeight());
		System.out.println(box1);
		
		Box box2 = new Box();		
		box2.setWith(6);
		box2.setHeight(3);
		
		System.out.println("box2-w: "+ box2.getWidth());
		System.out.println("box2-h: "+ box2.getHeight());
		System.out.println(box2);
		
		Box box3 = new Box(2, 1);
		Box box4 = new Box(10, 5);
		
		System.out.println(box3);
		System.out.println(box4);
		
	}
}
