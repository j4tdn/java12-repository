package enumeration;

public enum Position {
//    initial empty constructor
    INSIDE("Trong Đường Tròn"),// Position INSIDE = new Position("Trong đường tròn")
    ONSIDE("Trên Đường Tròn"),
    OUTSIDE("Ngoài Đường Tròn");

    public String value;

    Position(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
