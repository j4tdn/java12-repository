package ex02;

import java.util.Scanner;

public class VeHicles {
	int n;
	Vehicle[] vh;
	public VeHicles() {
		this.n = 0;
		vh=new Vehicle[0];
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
		vh=new Vehicle[n];
	}
	public Vehicle[] getVh() {
		return vh;
	}
	public void setVh(Vehicle[] vh) {
		this.vh = vh;
	}
	public void insertInf() {
		System.out.print("Nhap so xe : ");
		Scanner ip = new Scanner(System.in);
		this.n=ip.nextInt();
		vh=new Vehicle[n];
		for(int i= 0; i<n; i++) {
			ip.nextLine();
			System.out.println("Nhap ten chu xe, loai xe, dung tich va gia tri: ");
			String nameOwner = ip.nextLine();
			String type = ip.nextLine();
			int capatity = ip.nextInt();
			double cost = ip.nextDouble();
			vh[i] = new Vehicle(nameOwner, type, capatity, cost); 
		}
	}
	public void show() {
		VehicleUtils.export(vh);
	}
}
