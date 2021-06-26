package Ex04;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class NhanVien extends People {

	private String RoomName;
	public NhanVien() {
		// TODO Auto-generated constructor stub
	}
	public NhanVien(String name, int yearOfBirth, double salary, String roomName) {
		super(name, yearOfBirth, salary);
		RoomName = roomName;
	}
	public String getRoomName() {
		return RoomName;
	}
	public void setRoomName(String roomName) {
		RoomName = roomName;
	}
	@Override
	public String SalaryStaff() {
		NumberFormat nf = new DecimalFormat("#,##0.0##");
		return nf.format(getSalary()*1250000) ;
	}
	@Override
	public String toString() {
	
		return super.toString()+"\t"+RoomName;
	}
	@Override
	public void PrintSalary() {
		System.out.println(getName()+"\t"+SalaryStaff());
		
	}

}
