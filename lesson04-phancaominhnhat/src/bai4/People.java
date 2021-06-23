package bai4;


public class People {
	protected String fullName;
	protected String birthDay;
	protected float coefficientsSalary;
	
	public People() {
	}
	
	public People(String fullName, String birthDay, float coefficientsSalary) {
		super();
		this.fullName = fullName;
		this.birthDay = birthDay;
		this.coefficientsSalary = coefficientsSalary;
	}



	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public float getCoefficientsSalary() {
		return coefficientsSalary;
	}

	public void setCoefficientsSalary(float coefficientsSalary) {
		this.coefficientsSalary = coefficientsSalary;
	}

	@Override
	public String toString() {
		return "People [fullName=" + fullName + ", birthDay=" + birthDay + ", coefficientsSalary=" + coefficientsSalary
				+ "]";
	}
	
	
}
