package collection.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Employee;

public class Ex03 {
	public static void main(String[] args) {
		// Map: Employee, List<Employee>
		List<Employee> firstList = Arrays.asList(new Employee(11,"A",50,1), new Employee(12,"B",50,1));
		List<Employee> secondList = Arrays.asList(new Employee(21,"C",10,2), new Employee(22,"D",10,2));
		List<Employee> thirdList = Arrays.asList(new Employee(31,"E",10,3), new Employee(22,"F",10,3));
		
		Map<Employee, List<Employee>>  teams = new HashMap<>();
		teams.put(new Employee(1, "John", 100, null), firstList);
		teams.put(new Employee(2, "Smith", 150, null), secondList);
		teams.put(new Employee(3, "Andy", 200, null), thirdList);
		
		teams.put(new Employee(1, "John", 100, null), firstList);
		
		System.out.println("size: " + teams.size());
	}
}
