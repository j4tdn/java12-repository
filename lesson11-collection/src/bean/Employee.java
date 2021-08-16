package bean;

import java.util.Objects;

public class Employee {
private int id;
private double salary;
private String name;
private Integer managerId;
public Employee(int id, String name, double salary, Integer managerId) {
	super();
	this.id = id;
	this.salary = salary;
	this.name = name;
	this.managerId = managerId;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getManagerId() {
	return managerId;
}
public void setManagerId(Integer managerId) {
	this.managerId = managerId;
}
@Override
	public boolean equals(Object o) {
	if(this == o) {
		return true;
	}
	if(!(o instanceof Employee)) {
		return false;
	}
	//Khi compile thì trình biên dịch chưa nhận ra o là kiểu employee => ko thể sử dụng getter/setter
	//=>Phải ép kiểu về employee
	Employee that = (Employee)o;
	return this.getId()==that.getId();
	}
@Override
	public int hashCode() {
		return Objects.hash(id);
		//ta cũng có thể tự định nghĩa hàm hashcode ko cần phải dùng hàm Objects.hash
		//vd return id * 2 + 5
	}
	
}
