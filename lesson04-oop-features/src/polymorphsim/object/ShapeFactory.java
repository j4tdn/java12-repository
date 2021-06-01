package polymorphsim.object;

public class ShapeFactory {
	 enum ShapeType{
		 SQUARE,RECT
	 }
	 private ShapeFactory() {
		 
	 }
	 //create object with exposing creating logic
	 public static Shape get(ShapeType st) {
		 Shape shape = null;
		 switch(st) {
		 case SQUARE :
			 shape = new Square();
			 break;
		 case RECT:
			 shape = new Rectangle();
			 break;
		 default:
			 shape = new Shape();
		 }
		 return shape;
	 }
}
