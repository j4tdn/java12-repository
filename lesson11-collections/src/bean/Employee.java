package bean;

import java.util.Objects;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private Integer managerId;
	public Employee(int id, String name, double salary, Integer managerId) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.managerId = managerId;
	}
	public Employee() {
		
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", managerId=" + managerId + "]";
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Integer getManagerId() {
		return managerId;
	}
	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}
	
	//Dung nhieu o List :2 cho #contain #remove
	//             MAp
	
		@Override
		public boolean equals(Object o) {
			if(this == o) {
				return true;
			}
			if(!(o instanceof Employee)) {
				return false;
			}
			Employee that = (Employee)o;
			return getId() == that.getId();
		}
	
	//hash: ma bam >> Input la data >> Cong thuc hash >> return integer
	//VD: GIT - 1 commit - SHA256 - hash
		//Map,Set >> HashTable
		//Equal return the nao thi hashcode truyen vao nhu vay
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


}
