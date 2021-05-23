package demo;

import bean.Box;

public class App {
	public static void main(String[] args) {
		// Initial 2 boxes
		// Box1: w8 h4
		// Box2: w6 h3

		Box box1 = new Box();
		box1.setWidth(7);
		box1.setHeight(5);
		System.out.println("box1-w:" + box1.getWidth());
		System.out.println("box1-h:" + box1.getHeight());
		System.out.println(box1);
		Box box2 = new Box();
		box2.setWidth(9);
		box2.setHeight(10);
		System.out.println("box2-w:" + box2.getWidth());
		System.out.println("box2-h:" + box2.getHeight());
		System.out.println(box2);
	}
}
