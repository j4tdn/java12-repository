package Ex04;

public abstract class People {
	private String Name;
	private int YearOfBirth;
	private double Salary;

	public People(String name, int yearOfBirth, double salary) {
		super();
		Name = name;
		YearOfBirth = yearOfBirth;
		Salary = salary;
	}

	public People() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getYearOfBirth() {
		return YearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		YearOfBirth = yearOfBirth;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	public abstract String SalaryStaff();

	public abstract void PrintSalary();

	@Override
	public String toString() {

		return Name + "\t" + YearOfBirth + "\t" + Salary;
	}

}
