package polymorphism.object;

public class ShapeFactory {
	enum ShapeType {
		SQUARE, RECTANGLE
	}
	
	private ShapeFactory() {
	}
	
	public static Shape get(ShapeType st) {
		Shape shape = null;
		switch (st) {
		case SQUARE:
			shape = new Square();
			break;
		case RECTANGLE:
			shape = new Rectangle();
			break;
		default:
			shape = new Shape();
			break;
		}
		return shape;
	}
}
