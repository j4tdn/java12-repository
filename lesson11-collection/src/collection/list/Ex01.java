package collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Ex01 {
	public static void main(String[] args) {
		//prior ver1.5
		List l1 = new ArrayList(); 
		//no elements
		//required: list of numbers
		//output: double value of numbers
		
		//Using add
		l1.add("elements");
		l1.add(new Integer(10));
		
		
		System.out.println("l1 size: "+l1.size());
		for(int i=0;i< l1.size();i++) {
			System.out.println(i+ ": "+l1.get(i));
		}
	}
	
}
