package ex04;

public abstract class Person {
	protected String name;
	protected int yearOfBirth;
	protected float heSoLuong;

	public abstract float getSalary();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public float getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(float heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	public Person(String name, int yearOfBirth, float heSoLuong) {

		this.name = name;
		this.yearOfBirth = yearOfBirth;
		this.heSoLuong = heSoLuong;
	}

	public String getThongTinLuong() {
	 return	String.format("%-25s %-20f",name , getSalary()); 
	}
}
