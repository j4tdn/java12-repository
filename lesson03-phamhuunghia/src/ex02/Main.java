package ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {
	
	

	private static void getInforTax(List<Vehicle> listVehicles) {
		// TODO Auto-generated method stub
		System.out.printf("%-20s %-15s %-15s %-15s %-15s \n", "Tên chủ xe", "Loại xe", "Dung tích", "Giá trị",
				"Thuế phải nộp");;
		System.out.println("================================================================================");
		for (Vehicle vehicle : listVehicles) {
			System.out.println(vehicle);
		}
	
	}

	private static Vehicle creatNewCar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("<Nhập thông tin xe>");
		System.out.println("-Người sở hữu:");
		String name=sc.nextLine();
		System.out.println("-Loại xe:");
		String type=sc.nextLine();
		System.out.println("-Dung tích:");
		int dungTich=sc.nextInt();
		System.out.println("-Giá:");
		double gia=sc.nextDouble();
		return new Vehicle(name,type,dungTich,gia);
	}
	public static void main(String[] args) {
		List<Vehicle> ListVehicles=new ArrayList<Vehicle>();
		ListVehicles.add(new Vehicle("Nguyễn Thu Loan","Future Neo",100,35000000));
		ListVehicles.add(new Vehicle("Lê minh tính","Ford Ranger",3000,250000000));
		ListVehicles.add(new Vehicle("Nguyễn Minh Triết","Landscape",1500,1000000000));
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("		][==============Menu==============][");
			System.out.println("		][1.Nhập thông tin và tạo mới 1 xe][");
			System.out.println("		][2.Xuất bản kê khai tiền thuế    ][");
			System.out.println("		][3.Đóng                          ][");
			System.out.println("		][================================][");
			System.out.println("		Bạn chọn?						  ");
			choice = sc.nextInt();
			switch (choice) {
			case 1: {
				ListVehicles.add(creatNewCar());
				break;
			}
			case 2: {
				getInforTax(ListVehicles);
				break;
			}
			case 3: {
				System.out.println("Bye");
				System.exit(0);
			}
			
			default:
				System.out.println("Lựa chọn ko hợp lệ, chọn lại\n");
			}

		} while (true);
		
		
	}
}
