package Ex04;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class GiamDoc extends People {
	private int Position;
	public int getPosition() {
		return Position;
	}
	public void setPosition(int position) {
		Position = position;
	}
	public GiamDoc() {
		// TODO Auto-generated constructor stub
	}
	public GiamDoc(String name, int yearOfBirth, double salary, int position) {
		super(name, yearOfBirth, salary);
		
		Position = position;
	}
	
	@Override
	public String toString() {
		
		return super.toString()+ "\t" +Position;
	}
	@Override
	public String SalaryStaff() {
		//NumberFormat nf = new DecimalFormat("#,##0.0##");
		NumberFormat nf = NumberFormat.getNumberInstance();
		return nf.format((getSalary()+Position)*3000000);
	}
	@Override
	public void PrintSalary() {
		
		System.out.println(getName()+"\t"+SalaryStaff());		
	}
	
}
