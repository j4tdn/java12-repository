package enumeration;

public enum Position {
	// initial empty constructor
	INSIDE("Trong đường tròn"), // Position INSIDE = new Position("Trong đường tròn");
	ONSIDE("Trên đường tròn"),
	OUTSIDE("Ngoài đường tròn");
	
	public String value;
	
	Position(String value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return value;
	}
}
