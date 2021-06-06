package factory;

import factory.ShapeFactory.ShapeType;

public class App {
	public static void main(String[] args) {
		// 1. Shape    : drawing
		// 2. Rectangle: drawing, setBorder >> extends Shape
		// 3. Square   : drawing            >> extends Shape
		
		// Itself: new Itself
		Shape shape = new Shape();
		Square square = new Square();
		Rectangle rectangle = new Rectangle();
		
		// Parent: new Child
		Shape s1 = new Square();
		Shape s2 = new Rectangle();
		// Shape s3 = null;
		
		shape.drawing();     // 1
		square.drawing();    // 3
		rectangle.drawing(); // 2
		
		s1.drawing(); // 3
		s2.drawing(); // 2
		// s3.drawing(); NPE
		
		// compile
		// runtime: long(0-1000), int(0-100)
		// long a = 900;
		// int  b = 90;
		// a = b;
		// b = (int) a;
		
		// Child: new Parent >> Incompatible type
		// Square c1 = (Square) new Shape();
		// Rectangle c2 = (Rectangle) new Shape();
		// c1.drawing();
		// c2.setBorder();
		
		// A: new B
		// Square sr = new Rectangle();
		
		// Explain: s1(square), s2(rectangle)
		// 1: Dynamic type
		// Project: Collection(Array(static length), ArrayList(dynamic length)): 1000 -> 100000 -> 1000000000
		s2 = s1;
		s1 = s2;
		// c1 = c2;
		
		System.out.println("========================");
		// 2: Factory Pattern
		Shape f1 = ShapeFactory.get(ShapeType.RECT);
		Shape f2 = ShapeFactory.get(ShapeType.SQUARE);
		
		f1.drawing();
		f2.drawing();
	}
}
