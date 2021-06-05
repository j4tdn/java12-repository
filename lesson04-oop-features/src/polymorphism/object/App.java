package polymorphism.object;

import polymorphism.object.ShapeFactory.ShapeType;

public class App {
	/* - Why polymorphism ?
	 *   + dynamic type : 
	 *   	ví dụ : + collection(Array(static length), ArrayList(dynamic length)) -> khi dữ liệu vượt quá Array thì có thể gán qua sử dụng ArrayList
	 *   			+ hình chữ nhật nếu thay đổi w = h thì sẽ là hình vuông
	 *  
	 *   + Factory pattern: create object without exposing creation logic. 
	 * - Cast object:
	 * 	 + Parent : new Child  : Ok
	 *   + Child : new Parent  : Not, Child can has methods than Parent 
	 */
	
	public static void main(String[] args) {
		Shape shape = new Shape();
		Square square = new Square();
		Rectangle rectangle = new Rectangle();
		
		//Parent : new Child
		Shape s1 = new Square();
		Shape s2 = new Rectangle();
		//Shape s3 = null
		
		shape.drawing();
		square.drawing();
		rectangle.drawing();
		//s3.drawing();  NullPointerException : NPE
		
//		long a = 1000;
//		int b = 1;
//		
//		a = b; 
//		b = (int) a;
		
		//Child : new Parent 
//		Square c1 = (Square) new Shape();
//		Rectangle c2 = (Rectangle) new Shape();
		
		//Factory pattern
		Shape s3 = ShapeFactory.get(ShapeType.SQUARE);
		Shape s4 = ShapeFactory.get(ShapeType.RECTANGLE);
	}

}
