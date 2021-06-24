package ex04;

public class Staff extends People{
	private String name;
	private int yearOB;
	private double coSalary;
	private String departmentName;
	
	public Staff() {
		
	}

	public Staff(String name, int yearOB, double coSalary, String departmentName) {
		super(name, yearOB, coSalary);
		this.departmentName = departmentName;
	}

	public double getCoSalary() {
		return coSalary;
	}

	public void setCoSalary(double coSalary) {
		this.coSalary = coSalary;
	}

	public double getSalary() {
		return super.getCoSalary() * 1250000;
	}
	
	@Override
	public String toString() {
		return "Staff [name=" + super.getName() + ", yearOB=" + super.getYearOB() + ", coSalary=" + super.getCoSalary() + ", departmentName="
				+ departmentName + ", Salary=" + getSalary() + "]";
	}
	
	
}
