package ex04;

public class Manager extends People{
	private String name;
	private int yearOB;
	private double coSalary;
	private int numOfManStaff; 
	
	public Manager() {
		
	}
	public Manager(String name, int yearOB, double coSalary, int numOfManStaff) {
		super(name, yearOB, coSalary);
		this.numOfManStaff = numOfManStaff;
	}
	public double getCoPosition() {
		return numOfManStaff;
	}
	public void setCoPosition(int numOfManStaff) {
		this.numOfManStaff = numOfManStaff;
	}
	
	public double getSalary() {
		return super.getCoSalary() * 1250000;
	}
	
	@Override
	public String toString() {
		return "Manager [name=" + super.getName() + ", yearOB=" + super.getYearOB() + ", coSalary=" + super.getCoSalary() + ", numOfManStaff=" + numOfManStaff
				+  ", Salary=" + getSalary() + "]";
	}
	 
	
	
	
	
}
