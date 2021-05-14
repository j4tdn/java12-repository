package enumeration;

public class Ex01 {

	public static void main(String[] args) {
		Point pA = new Point(3, 6);
		Point pO = new Point(0, 0);
		int R = 5;

		Position pos = getPos(pA, pO, R);
		System.out.println("pos: " + pos);
		if (pos == Position.ONSIDE) {
			System.out.println("Calculate");
		}
		

	}

	private static Position getPos(Point point, Point pO, int R) {
		double distance = Math.sqrt(Math.pow((point.x - pO.x), 2) + Math.pow((point.y - pO.y), 2));
		if (distance == R) {
			return Position.ONSIDE;
		}
		if (distance > R) {
			return Position.OUTSIDE;
		}
		return Position.INSIDE;
	}
}
