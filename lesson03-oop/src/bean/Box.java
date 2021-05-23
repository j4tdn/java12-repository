package bean;

/**
 * OOP - Theory
 * 
 * System=&Object Object=&Attributes + %Methods
 *
 * OOP - In essence System=&Object Object=&Attributes + %Methods
 *
 * Class > create Objects Class = &Attributes + %Methods Object=Value + Value
 */
public class Box {
// Attributes
	private int width;
	private int height;
	public Box(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "Box [width=" + width + ", height=" + height + "]";
	}
	

}
