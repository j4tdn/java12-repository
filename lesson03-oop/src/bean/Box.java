package bean;

/** OOP - Theory
 * System = &Object
 * Object = &Attributes + %Methods
 * OOP - In essence
 * 
 * Class > create Objects
 * Class = &Attributes 	+ %Methods
 * Object = Value 		+ Value
 */
public class Box {
	// Attributes
	private int width;
	private int height; 
	
	//Empty Constructor
	public Box() {
	
	}
	
	public Box(int width, int height) {
		this.width = width;
		this.height = height;
	}
	//setter
	public void setWith(int width) {
		this.width = width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	@Override
	public String toString() {
		return "w" + this.width + ", h" +this.height;
	}
}
