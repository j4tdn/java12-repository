package demo;

import bean.Box;

public class Ex02 {
	public static void main(String[] args) {
		//how many objects will be created following
		
		int a = 10;
		Integer b = 20;
		Integer c = new Integer(30);
		Integer d = b;
		
		String e = "text";
		String f = e;
		String g = new String("value");
		
		Box box1 = new Box();
		Box box2 = null;
		Box box3 = box1;
		box3 = new Box();
	}
}
