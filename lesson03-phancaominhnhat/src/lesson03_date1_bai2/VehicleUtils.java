package lesson03_date1_bai2;

public class VehicleUtils {
	private VehicleUtils() {
		// TODO Auto-generated constructor stub
	}
	
	public static void export(Vehicle[] vehicle){
		System.out.println("       Tên chủ xe              Loại xe              Dung tích                Trị giá              Thuế phải nộp");
		System.out.println("       ============================================================================================================== ");
		
		for(Vehicle v : vehicle) {
			double tax = 0;
			tax = checkTax(v.getCapacity(), v.getCost());
			
//			System.out.println("  " + v.getNameOwner() + "               " + v.getType() + "               " 
//					+ v.getCapacity() + "               " + v.getCost() + "               " + tax);
			System.out.format("%15s%25s%20s%29f%25f\n", v.getNameOwner(),v.getType(), v.getCapacity(), v.getCost(), tax);
		}
	}
	public static double checkTax(int capacity,double cost) {
		if(capacity < 100) return cost*0.01;
		if(capacity <= 200) return cost*0.03;
		return cost*0.05;
	}
}
