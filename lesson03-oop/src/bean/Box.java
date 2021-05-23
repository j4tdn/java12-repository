package bean;
/** 
 * OOP - Theory
 * System = &Objects
 * Object = &Attributes + %Methods
 * 
 * OOP - In essence
 * System = &Objects
 * Object = &Attributes + %Methods
 * 
 * Class > create Objects
 * Class  = &Attributes + %Methods
 * Object = Value       + Value
 */

public class Box {
	//Attributes
	private int width;
	private int height;
	
	//Empty constructor
	public Box() {

	}
	
	public Box(int width, int height) {
		this.width=width;
		this.height=height;
	}
	
	//Permission to access(set,get) attributes's value
	//setter
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
		// TODO Auto-generated method stub
		return "w: " + width + ", h: " + height;
	}
}
