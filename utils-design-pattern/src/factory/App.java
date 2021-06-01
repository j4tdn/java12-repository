package factory;

import factory.ShapeFactory.ShapeType;

public class App {
	public static void main(String[] args) {
		//Shape : drawing
		//Retangle: drawing,setBorder >>extends Shape
		//Square: drawing,  		  >> extend Shape
		
		Shape shape = new Shape();
		Square square = new Square();
		Rectangle  rectangle = new Rectangle();
		
		Shape s1 = new Square();
		Shape s2 = new Rectangle();
		//Shape s3 = null
		
		shape.drawing();
		square.drawing();
		rectangle.drawing();
		
		//Parent: new Child
		s1.drawing();
		s2.drawing();
		//s3.drawing(); NPE

		//Child: new Parent >> Incompactible Type 
		//can not cuz child have methods Parent haven't 
		//Square c1 = (Square) new Shape();
		//Rectangle c2 = (Rectangle) new Shape(); 
		//c1.drawing();
		//c2.drawing();
		
		//A: new B
		//Square sr = new Rectangle();
		
		//Explain: s1(square),s2(rectangle)
		//1: Dynamic type
		//Project: Array: Collection(Array(static length), ArraList(dynamic length))1000
		s2 = s1;
		s1 = s2;
		//c1 = c2
		System.out.println("------------------------");
		
		//2: Factory Pattern
		Shape f1 = ShapeFactory.get(ShapeType.RECT);
		Shape f2 = ShapeFactory.get(ShapeType.SQUARE);
		
		f1.drawing();
		f2.drawing();
	}

}
