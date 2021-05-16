package enumration;

public enum Position {
	INSIDE("Trong duong tron"), 
	ONSIDE("Tren duong tron"),
	OUTSIDE("Ngoai duong tron");
	
	String value;
	
	private Position(String value) {
		// TODO Auto-generated constructor stub
		this.value=value;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return value;
	}
	
	
}
