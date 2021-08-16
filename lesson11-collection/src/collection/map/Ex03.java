package collection.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Employee;

public class Ex03 {
public static void main(String[] args) {
	
	List<Employee>flist=Arrays.asList(new Employee(11,"A",50,1),new Employee(12,"B",50,1));
	List<Employee>slist=Arrays.asList(new Employee(21,"C",30,2),new Employee(22,"D",10,2));
	List<Employee>tlist=Arrays.asList(new Employee(31,"E",10,2),new Employee(32,"f",10,2));
	
	//Key: Employee,value:  List<Employee>
	//put >> exist key ? -> use "hashcode" and "equal" of key
	//hashcode: default=address
	//		  : override= return calculated value from input(normal is object' atribue)
	//equal   : default =compare address
	//        :override = compare value atribute  
	
	Map<Employee, List<Employee>> teams=new HashMap<>();
	teams.put(new Employee(1,"John",100,null),flist);
	teams.put(new Employee(2,"John",150,null),slist);
	teams.put(new Employee(3,"John",200,null),tlist);
	teams.put(new Employee(1,"John",100,null),tlist);
	
	
	System.out.println("Size: "+teams.size());
}
}
