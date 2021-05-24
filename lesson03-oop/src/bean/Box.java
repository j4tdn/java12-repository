package bean;

/** 
 * OOP - Theory
 * System = &Objeects
 * Object = &Attributes + &Methods
 *
 * OOP - In essence 
 * Class > create Objects
 * Class = &Attributes + &Methods
 * Object =    Value   +   Value
 */
public class Box {
	// Attrubutes
	private int width;
	private int height;
	
	//Empty contructor
	public Box() {
	}
	public Box(int width,int height) {
		this.width = width;
		this.height = height;
	}
	// Permission to access(set|get) attributes's value
	
	//setter
	public void setWitdh(int width) {
		this.width = width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	//getter
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	@Override
	public String toString() {
		return this.width + "," + this.height;
	}
}
