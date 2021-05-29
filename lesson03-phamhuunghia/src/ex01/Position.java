package ex01;

public enum Position {
	INSIDE("trong đường tròn"), 
	ONSIDE("trên đường tròn"),
	OUTSIDE("ngoài đường tròn");
	
	String value;
	
	private Position(String value) {
		this.value=value;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return value;
	}
}
