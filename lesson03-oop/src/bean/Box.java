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
	
	//empty constructor
	public Box() {
		
	}
	
	public Box(int width, int height) {
		this.width = width;
		this.height = height;	
	}
	//permission to access (get|set) attribute's value
	//setter
	public void setWidth(int width) {
		this.width = width;
	}
	//setter
	public void setHeight(int height) {
		this.height = height;
	}
	//getter
	public int getWidth() {
		return width;
	}
	//getter
	public int getHeight() {
		return height;
	}
	@Override
	public String toString() {
		return "w"+width+" "+"h"+height;
	}

}
