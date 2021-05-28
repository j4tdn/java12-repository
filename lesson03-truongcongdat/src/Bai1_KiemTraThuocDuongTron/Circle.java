package Bai1_KiemTraThuocDuongTron;

public class Circle {
	private Point circle;
	private double r;

	public Circle(Point circle, double r) {
		this.circle = circle;
		this.r = r;
	}

	public void Check(Point A) {
		double dimen = Math.sqrt(Math.pow(A.getX() - circle.getX(), 2) + Math.pow(A.getY() - circle.getY(), 2));
		if (dimen == r) {
			System.out.println("A nằm trên đường tròn");
			return;
		}
		if (dimen > r) {
			System.out.println("A nằm ngoài đường tròn");
			return;
		}
		System.out.println("A nằm trong đường tròn");
	}
}
