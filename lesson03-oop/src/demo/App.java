package demo;
import bean.Box;

public class App {
	public static void main(String[] args) {
		//Initial 2 boxes
		//Box1 : w8 h4
		//Box2 : w6 h3
		
		//Use "new" keyword to call constructor
		//NullPointerException NPE
		Box box1 = new Box();	//def null
		box1.setWidth(8);
		box1.setHeight(4);
		
		System.out.println("box1-w: " + box1.getWidth());
		System.out.println("box1-h: " + box1.getHeight());
		System.out.println(box1);
		
		Box box2 = new Box();	//def null
		box2.setWidth(6);
		box2.setHeight(3);
		
		Box box3 = new Box(3,2);

		System.out.println(box2);
		System.out.println(box3);
	}
}
