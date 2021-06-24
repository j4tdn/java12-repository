package bai4;

import java.util.Scanner;

public class App {
	private static Scanner scanner = new Scanner(System.in);
	static int count;
	static Director director = new Director();
	static HeadOfDepartment headOfDepartment = new HeadOfDepartment();
	static Employee[] employees = new Employee[2];
	static int i = -1;
	public static void main(String[] args) {
		menu();			
	}
		
	public static void menu() {
		System.out.println("=====================Menu====================");
		System.out.println("1.Input director's information.");
		System.out.println("2.Input information of a head department.");
		System.out.println("3.Input employee's information.");
		System.out.println("4.Print list personnel's information.");
		System.out.println("5.Print personnel's salary");
		System.out.println("6.Exit.");
		System.out.println("=============================================");
		System.out.print("Enter your choose: ");
		count = Integer.parseInt(scanner.nextLine());
		choose(count);
	}
	
	public static void choose(int count) {
		switch (count) {
			case 1:
				InputPersonnel.inputDirector(director);
				break;
			case 2:
				InputPersonnel.inputHeadOfDepartment(headOfDepartment);
				break;
			case 3:
				if(i == 1) {
					System.out.println("Can not input employee anymore");
					menu();
				}
				i++;
				employees[i] = new Employee();
				InputPersonnel.inputEmployee(employees[i]);
				break;
			case 4:
				OutputInforPersonnel.listPersonnelInfo(director, headOfDepartment, employees);
				break;
			case 5:
				OutputInforPersonnel.listPersonnelSalary(director, headOfDepartment, employees);
				break;
			case 6:
				System.exit(0);;
		}
	}
}
