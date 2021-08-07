package collection.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Employee;

public class Ex03 {
	public static void main(String[] args) {
		//Map: Employee, List<Employee>
		List<Employee> fList = Arrays.asList(new Employee(11,"A",40,1), new Employee(12,"B",50,1));
		List<Employee> sList = Arrays.asList(new Employee(21,"C",30,2), new Employee(22,"D",10,2));
		List<Employee> tList = Arrays.asList(new Employee(31,"E",10,3), new Employee(32,"F",10,3));
		
		
		//put >> exist ? hashcode , equals of key
		//
		Map<Employee, List<Employee>> teams = new HashMap<>();
		teams.put(new Employee(1,"John",100,1), fList);
		teams.put(new Employee(2,"Smith",150,2), sList);
		teams.put(new Employee(3,"Andy",200,3), tList);
		
		teams.put(new Employee(1,"John",100,1), tList);
		
		System.out.println("size: " + teams.size());
	}
}
