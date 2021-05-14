package enumeration;

public class Ex01 {

	 public static void main(String[] args) {
		 
		Point pA = new Point(3,4);
		Point p0 = new Point(0,0);
		int R = 5;
		
		Position pos = getPos(pA, p0, R);
		System.out.println("pos +" +pos);
		if(pos == Position.ONSIDE) {
			
			System.out.println("calculate");
		}
		
	 }
	  private static Position getPos(Point point, Point p0, int R) {
		 double distance =   Math.sqrt(Math.pow((point.x - p0.x),2) + Math.pow((point.y - p0.y),2));
		 if(distance == R) {
			 return Position.ONSIDE;
		 }
		 if(distance > R) {
			 return Position.OUTSIDE;
		 }
		 else return Position.INSIDE;
	 }
}
