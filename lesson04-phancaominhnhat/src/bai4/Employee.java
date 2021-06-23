package bai4;

public class Employee extends People{
	private String nameDepartment;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String fullName, String birthDay, float coefficientsSalary, String nameDepartment) {
		super(fullName, birthDay, coefficientsSalary);
		this.nameDepartment = nameDepartment;
	}

	public String getNameDepartment() {
		return nameDepartment;
	}

	public void setNameDepartment(String nameDepartment) {
		this.nameDepartment = nameDepartment;
	}
	
	public float getSalary() {
		return (coefficientsSalary) * 1250000;
	}
	
	@Override
	public String toString() {
		return "Employee [fullName=" + fullName + ", birthDay=" + birthDay
				+ ", coefficientsSalary=" + coefficientsSalary + " nameDepartment=" + nameDepartment + "]";
	}
	
}
