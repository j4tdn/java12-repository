package ex01;

public class PointUtils {
	private PointUtils() {
		
	}
	
	public static void Circle(Point a, Point o, double r) {
		double distance = Math.sqrt(Math.pow(a.getX() - o.getX(), 2) + Math.pow(a.getY() - o.getY(), 2));
		if (distance == r ) {
			System.out.println("A nam tren duong tron");
		} else if (distance < r) {
			System.out.println("A nam trong duong tron");
		} else {
			System.out.println("A nam ngoai duong tron");
		}
	}
}
