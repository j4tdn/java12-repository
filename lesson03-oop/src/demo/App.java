package demo;

import bean.Box;

public class App {
	public static void main(String[] args) {
		// Initial 2 boxes
		// Box1: w8 h4
		// Box2: w6 w3
		
		//initial object from class
		//Use 'new' keyword to call constructor
		Box box1 = new Box();
		box1.setWitdh(8);
		box1.setHeight(4);
		
		Box box2 = new Box();
		box2.setWitdh(6);
		box2.setHeight(3);
		
		Box box3 = new Box(2,1);
		
		System.out.println(box1);
		System.out.println(box2);
		System.out.println(box3);

	}
}
