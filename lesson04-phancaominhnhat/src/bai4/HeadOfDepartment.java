package bai4;

public class HeadOfDepartment extends People{
	private int amountEmployee;
	
	public HeadOfDepartment() {
	}

	public HeadOfDepartment(String fullName, String birthDay, float coefficientsSalary, int amountEmployee) {
		super(fullName, birthDay, coefficientsSalary);
		this.amountEmployee = amountEmployee;
	}

	public int getAmountEmployee() {
		return amountEmployee;
	}

	public void setAmountEmployee(int amountEmployee) {
		this.amountEmployee = amountEmployee;
	}
	
	public float getSalary() {
		return (coefficientsSalary) * 2200000;
	}
	
	@Override
	public String toString() {
		return "HeadOfDepartment [fullName=" + fullName + ", birthDay="
				+ birthDay + ", coefficientsSalary=" + coefficientsSalary + " amountEmployee= " + amountEmployee +"]";
	}
	
	
	
}
