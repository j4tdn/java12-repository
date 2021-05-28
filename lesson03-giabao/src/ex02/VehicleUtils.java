package ex02;

public class VehicleUtils {
	private VehicleUtils() {

	}

	public static double thuexe(Vehicle v) {
		if (v.getDungtich() < 100) {
			return (double) (v.getTrigia() * 0.01);
		}
		if (v.getDungtich() < 200) {
			return (double) (v.getTrigia() * 0.03);
		} else
			return (double) (v.getTrigia() * 0.05);
	}
}
