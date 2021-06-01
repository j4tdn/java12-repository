package polymorphism.object;

import polymorphism.object.ShapeFactory.ShapeType;

public class App {
	public static void main(String[] args) {
		// 1. Shape    : drawing
		// 2. Rectangle: drawing, setBorder >> extends Shape
		// 3. Square   : drawing, setBorder >> extends Shape
		Shape shape = new Shape();
		Square square = new Square();
		Rectangle rectangle = new Rectangle();
		
		Shape s1 = new Square();
		Shape s2 = new Rectangle();
		
		shape.drawing();	// 1
		square.drawing();	// 3
		rectangle.drawing();// 2
		
		s1.drawing(); // 3
		s2.drawing(); // 1
		
		
		// compile
		// runtime: long(0-1000), int(0-100)
//		 long a = 900;
//		 int b = 10;
//		 a = b;
//		 b = a;
		
		// Child: new Parent >> Incompatible type
//		Square c1 = (Square) new Shape();
//		Rectangle c2 = (Rectangle) new Shape();
//		c1.drawing();
//		c2.setBorder();
		
		// A: new B
//		Square sr = new Rectangle();
		
		// Explain: s1(square), s2(rectangle)
		// 1. Dynamic type
		// Project: Collection(Array(static length),ArrayList(dynamic length)): 1000 -> 100000 -> 1000000
		s2 = s1;
		s1 = s2;
		
		// 2. Factory pattern
		Shape f1 = ShapeFactory.get(ShapeType.RECT);
		Shape f2 = ShapeFactory.get(ShapeType.SQUARE);
		f1.drawing();
		f2.drawing();
	}
}
