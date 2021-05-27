package Ex01;

public class Circle {
	private static Point Center;
	private static double Diameter;

	public static Point getCenter() {
		return Center;
	}

	public static void setCenter(Point center) {
		Center = center;
	}

	public static double getDiameter() {
		return Diameter;
	}

	public static void setDiameter(double diameter) {
		Diameter = diameter;
	}

	public static String Check(Point A)
	{	
		 double a= Math.pow(squaredistance(A, getCenter()),2);
		 double b = Math.pow(getDiameter(),2);
		 if(a>b) return "Điểm A nằm ngoài đường tròn";
		 else if(a<b) return "Điểm A nằm trong đường tròn";
		 else return "Điểm A nằm trên đường tròn";
	}

	public static double squaredistance(Point A, Point B) {
		return Math.sqrt(Math.pow(A.getX() - B.getX(), 2) + Math.pow(A.getY() - B.getY(), 2));
	}
}
