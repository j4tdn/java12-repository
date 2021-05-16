package enumration;

public class Ex01 {

	private static final String INSIDE = "Trong duong tron";
	private static final String ONSIDE = "Trong duong tron";
	private static final String OUTSIDE = "Trong duong tron";
	
	private static final double pi=3.14d;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point pA=new Point(5,5);
		Point pO=new Point(5,5);
		int R=5;
		Position pos=getpos(pA, pO, R);
		System.out.println("Pos"+pos);
		
		if(pos == Position.ONSIDE) {
			
			System.out.println("Calculate");
		}
		
	}
	
	private static Position getpos(Point point,Point pO,int R) {
		double distance=Math.sqrt(Math.pow((point.x-pO.y),2)+Math.pow((point.y-pO.y), 2));
		//Hardcode
		if(distance==R) return Position.ONSIDE;
		if(distance>R)return Position.OUTSIDE;
		return Position.INSIDE;
	}
}
