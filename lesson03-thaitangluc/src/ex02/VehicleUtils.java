package ex02;

public class VehicleUtils {
	private VehicleUtils() {
	}
	
	public static void export(Vehicle[] vehicals) {
		System.out.printf("%-20s%-15s%-15s%-20s%s\n","Ten chu xe","Loai xe","Dung Tich", "Tri gia", "Thue phai nop");
		System.out.println("=========================================================================================");
		for (Vehicle i : vehicals) {
			i.toString();
		}
	}
	
}
