package ex02;

import java.util.Scanner;

public class VehicleUtils {
	private VehicleUtils() {
	}
	
	public static void export(VeHicles veh) { 
		System.out.printf("%-20s%-15s%-15s%-20s%s\n","Ten chu xe","Loai xe","Dung Tich", "Tri gia", "Thue phai nop");
		System.out.println("=========================================================================================");
		for (int i=0;i<veh.getN();++i) {
			veh.vh[i].toString();
		}
	}
	
	public static void insertInf(VeHicles veh) {
		System.out.print("Nhap so xe : ");
		Scanner ip = new Scanner(System.in);
		int n=ip.nextInt();
		Vehicle[] vh=new Vehicle[n]; 
		for(int i= 0; i<n; i++) {
			ip.nextLine();
			System.out.println("Nhap ten chu xe, loai xe, dung tich va gia tri: ");
			String nameOwner = ip.nextLine();
			String type = ip.nextLine();
			int capatity = ip.nextInt();
			double cost = ip.nextDouble();
			vh[i] = new Vehicle(nameOwner, type, capatity, cost); 
		}
		veh.SetVeHicles(n, vh);
	}
	
}
