package factory;

import factory.Shapefactory.ShapeType;

public class App {
	public static void main(String[] args) {
	    	//Shape:Drawing;
			//Rectangle :drawing,setBorder>>extends Shape
	    	//Square    :drawing,setBorder>>extends Shape
			
			//itself new itself
			Shape shape=new Shape();
			Rectangle rectangle=new Rectangle();
			Square square =new Square();
			 Shape s1=new Square();
			 Shape s2=new Rectangle();
			 Shape s3=null;
			 
			 square.drawing();
			 rectangle.drawing();
			 shape.drawing();
			
			 //Parent: new child
			 s1.drawing();
			 s2.drawing();
			
			 //Child: new Parent 
			 //Square c1=new Shape();// Ko cho phép new kiểu này
			 Square c1=(Square) new Shape();
			 c1.drawing();  // ko chạy đc vì drawing đã đc hàm con override => Shape ko có phương thức đó
			 Rectangle c2= (Rectangle) new Shape();
			 c2.setBorder(); //Tương tự thế, ko chạy đc
			 	 
			 //s1(Square),s2(Rectangle)
			 s2=s1;
			 s1=s2;
			 
			 //2. Factory pattern
			 Shape f1=Shapefactory.get(ShapeType.RECT);
			 Shape f2=Shapefactory.get(ShapeType.SQUARE);
			 
			 f1.drawing();
			 f2.drawing();
	}
}
