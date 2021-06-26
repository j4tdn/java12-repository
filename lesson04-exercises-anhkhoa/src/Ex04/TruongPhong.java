package Ex04;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class TruongPhong extends People {
	private int SumStaff;

	public int getSumStaff() {
		return SumStaff;
	}

	public void setSumStaff(int sumStaff) {
		SumStaff = sumStaff;
	}

	@Override
	public String SalaryStaff() {
		NumberFormat nf = new DecimalFormat("#,##0.0##");
		return nf.format(getSalary() * 2200000);
	}

	public TruongPhong(String name, int yearOfBirth, double salary, int sumStaff) {
		super(name, yearOfBirth, salary);
		SumStaff = sumStaff;
	}

	@Override
	public String toString() {

		return super.toString() + "\t" + SumStaff;
	}

	@Override
	public void PrintSalary() {
		System.out.println(getName() + "\t" + SalaryStaff());

	}
}
