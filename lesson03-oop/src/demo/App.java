package demo;

import bean.Box;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box1=new Box();
		box1.setHeight(10);
		box1.setWidth(8);
		Box box2=new Box();
		box2.setHeight(11);
		box2.setWidth(9);
		
		System.out.println(box1);
		System.out.println(box2);
	}

}
