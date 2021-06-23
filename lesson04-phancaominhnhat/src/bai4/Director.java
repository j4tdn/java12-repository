package bai4;

public class Director extends People{
	private float jobCoefficient;
	 
	public Director() {
	}

	public Director(String fullName, String birthDay, float coefficientsSalary, float jobCoefficient) {
		super(fullName, birthDay, coefficientsSalary);
		this.jobCoefficient = jobCoefficient;
	}

	public float getJobCoefficient() {
		return jobCoefficient;
	}

	public void setJobCoefficient(float jobCoefficient) {
		this.jobCoefficient = jobCoefficient;
	}
	
	public float getSalary() {
		return (coefficientsSalary + jobCoefficient) * 3000000;
	}
	
	@Override
	public String toString() {
		return "Director [fullName=" + fullName + ", birthDay=" + birthDay
				+ ", coefficientsSalary=" + coefficientsSalary + " jobCoefficient=" + jobCoefficient + "]";
	}

	 
}
