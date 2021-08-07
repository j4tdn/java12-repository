package bean;

import java.util.Objects;

public class Employee {
	private int id;
	private String name;
	private int salary ;
	private int manageId;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, int salary, int manageId) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.manageId = manageId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getManageId() {
		return manageId;
	}

	public void setManageId(int manageId) {
		this.manageId = manageId;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", manageId=" + manageId + "]";
	}
	
	//List constain remove
	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(!(o instanceof Employee)){
			return false;
		}
		
		Employee that = (Employee)o;
		return getId() == that.getId();
	}
	
	//hash: mã băm >> input là data >> áp dụng 1 công thức để băm data >> return integer
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
}
