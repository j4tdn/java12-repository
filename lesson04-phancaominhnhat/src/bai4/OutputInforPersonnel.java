package bai4;

import java.util.Scanner;

public class OutputInforPersonnel {
	public static Scanner scanner = new Scanner(System.in);
	
	public static void listPersonnelInfo(Director director, HeadOfDepartment headOfDepartment, Employee[] employees) {
		System.out.println("---------------PERSONNEL'S INFORMATION IN THE COMPANY---------------");
		System.out.println("\n* Position : Director");
		System.out.printf("%-20s %-20s %-25s %-20s \n", "Name", "Birthday", "Coefficients Salary", "Job Coefficient");
		System.out.printf("%-20s %-20s %-25s %-20s \n", director.getFullName(), director.getBirthDay(), director.getCoefficientsSalary(), director.getJobCoefficient());
		
		System.out.println("\n* Position : Head Of Department");
		System.out.printf("%-20s %-20s %-25s %-20s \n", "Name", "Birthday", "Coefficients Salary", "Amount Employee Manage");
		System.out.printf("%-20s %-20s %-25s %-20s \n", headOfDepartment.getFullName(), headOfDepartment.getBirthDay(), headOfDepartment.getCoefficientsSalary(), headOfDepartment.getAmountEmployee());
		
		System.out.println("\n* Position : Employee");
		System.out.printf("%-20s %-20s %-25s %-20s \n", "Name", "Birthday", "Coefficients Salary", "Name Department");
		for(Employee employee: employees) {
			if(employee != null) {
				System.out.printf("%-20s %-20s %-25s %-20s \n", employee.getFullName(), employee.getBirthDay(), employee.getCoefficientsSalary(), employee.getNameDepartment());
			}
		}
		while(true) {
			System.out.print("\nEnter 1 to back menu: ");
			int back = scanner.nextInt();
			if(back == 1) {
				App.menu();
			}
		}
	}
	
	public static void listPersonnelSalary(Director director, HeadOfDepartment headOfDepartment, Employee[] employees) {
		System.out.println("---------------PERSONNEL'S SALARY IN THE COMPANY---------------");
		System.out.printf("%-20s %-20s %-25s %-20s \n", "Name", "Birthday", "Coefficients Salary", "Salary");
		System.out.println("---------------------------------------------------------------------------------");
		System.out.printf("%-20s %-20s %-25s %-20s \n", director.getFullName(), director.getBirthDay(), director.getCoefficientsSalary(), director.getSalary());
		System.out.printf("%-20s %-20s %-25s %-20s \n", headOfDepartment.getFullName(), headOfDepartment.getBirthDay(), headOfDepartment.getCoefficientsSalary(), headOfDepartment.getSalary());
		for(Employee employee : employees) {
			if(employee != null) {
				System.out.printf("%-20s %-20s %-25s %-20s\n", employee.getFullName(), employee.getBirthDay(), employee.getCoefficientsSalary(), employee.getSalary());
			}
		}
		
		while(true) {
			System.out.print("\nEnter 1 to back menu: ");
			int back = scanner.nextInt();
			if(back == 1) {
				App.menu();
			}
		}
	}
}
