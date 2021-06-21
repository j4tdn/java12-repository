package ex05;

public class Customer {
	String maKH;
	String name;
	String phoneNumber;
	String addRess;
	@Override
	public String toString() {
		return "Customer [maKH=" + maKH + ", name=" + name + ", phoneNumber=" + phoneNumber + ", addRess=" + addRess
				+ "]";
	}
	public Customer(String maKH, String name, String phoneNumber, String addRess) {
		super();
		this.maKH = maKH;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.addRess = addRess;
	}
	public String getMaKH() {
		return maKH;
	}
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddRess() {
		return addRess;
	}
	public void setAddRess(String addRess) {
		this.addRess = addRess;
	}
}
