package lesson03_date1_bai1;

public class PointInCoordinateUtils {
	private PointInCoordinateUtils() {
		// TODO Auto-generated constructor stub
	}
	
	public static boolean isBelongToCircle(PointInCoordinate pointCenterCircle, PointInCoordinate pointInCoordinate) {
		
		double distance = Math.sqrt(Math.pow((pointCenterCircle.getxAxis() - pointInCoordinate.getxAxis()),2)
									+ Math.pow((pointCenterCircle.getyAxis() - pointInCoordinate.getyAxis()),2));

		// check: Have point A belong to circle
		boolean result = (pointCenterCircle.getRadius() == distance) ?  true : false;
		return result;
	}
}
