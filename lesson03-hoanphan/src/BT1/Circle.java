package BT1;

public class Circle {
	private double r;
	private Point circle;
	
	public Circle(Point circle, double r) {
		this.circle = circle;
		this.r = r;
	}
	public void Determined(Point A) {
		double distance = Math.pow(A.getX() - circle.getX(), 2) + Math.pow(A.getY() - circle.getY(), 2);
		double radius = Math.pow(r,2);
		if (distance == radius) {
			System.out.println("Diem nam tren duong tron");
			return;
		}
		if (distance < radius) {
			System.out.println("Diem nam trong duong tron");
			return;
		}
		System.out.println("Diem nam ngoai duong tron");
	}
}