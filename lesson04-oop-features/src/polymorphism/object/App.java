package polymorphism.object;

import polymorphism.object.ShapeFactory.ShapeType;

public class App {
	public static void main(String[] args) {
    //Shape:Drawing;
	//Rectangle :drawing,setBorder>>extends Shape
    //Square    :drawing,setBorder>>extends Shape
		Shape shape=new Shape();
		Rectangle rectangle=new Rectangle();
		Square square =new Square();
		 Shape s1=new Square();
		 Shape s2=new Rectangle();
		 Shape s3=null;
		 square.drawing();
		 rectangle.drawing();
		 shape.drawing();
		
		 Square c1=(Square) new Shape();
		 c1.drawing();
		
		 //Explain: s1(square),s2(rectangle)
		 //1:Dynamic type
		 //Project:Collection(Array(static length),ArrayList(dyanmic length):1000->1000000->100000000000
		 s2=s1;
		 s1=s2;
		 
		 //2:Factory pattern
		 Shape f1=ShapeFactory.get(ShapeType.RECT);
		 Shape f2=ShapeFactory.get(ShapeType.SQUARE);
		 f1.drawing();
		 
	}
}
