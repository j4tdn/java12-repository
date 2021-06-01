package factory;

import factory.ShapeFactory.ShapeType;

public class App {
	public static void main(String[] args) {
		// shape: drawing
		// rectangle: drawing setborder >> extends shape
		// Square: drawing setborder ->> extends shape
		
		Shape shape = new Shape();
		Square square = new Square();
		Rectangle rectangle = new Rectangle();
		
		Shape s1 = new Square();
		Shape s2 = new Rectangle();
		//Shape s3 = null;
		
		//compile
		//runtime 
		//long a=900; int b=90;
		//a=b;
		//b=a;
		
		shape.drawing();
		square.drawing();
		rectangle.drawing();
		
		s1.drawing();
		s2.drawing();
		//s3.drawing(); //NPE
		
		//Child new Parent
		//Square c1 = (Square) new Shape();
		//Rectangle c2 = (Rectangle) new Shape();
		
		//Explain: s1(quare), s2(retangle)
		//1: Dymatic type
		//Project: collection ()
		//s2=s1;
		//s1=s2;
		
		System.out.println("=============================");
		//Factory Pattern
		Shape f1 = ShapeFactory.get(ShapeType.RECT);
		Shape f2 = ShapeFactory.get(ShapeType.SQUARE);
		
		f1.drawing();
		f2.drawing();
		
	}
}
