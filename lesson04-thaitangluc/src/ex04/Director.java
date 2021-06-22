package ex04;

public class Director extends People{
	private String name;
	private int yearOB;
	private double coSalary;
	private double coPosition;
	
	public Director() {
		
	}

	public Director(String name, int yearOB, double coSalary, double coPosition) {
		super(name, yearOB, coSalary);
		this.coPosition = coPosition;
	}

	public double getCoPosition() {
		return coPosition;
	}

	public void setCoPosition(double coPosition) {
		this.coPosition = coPosition;
	}
	
	public double getSalary() {
		return (super.getCoSalary() + coPosition) * 1250000;
	}

	@Override
	public String toString() {
		return "Director [name=" + super.getName() + ", yearOB=" + super.getYearOB() + ", coSalary=" + super.getCoSalary() + ", coPosition=" + coPosition
				+ ", Salary=" + getSalary() +"]";
	}
	
}
