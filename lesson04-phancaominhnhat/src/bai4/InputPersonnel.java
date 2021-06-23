package bai4;

import java.util.Scanner;

public class InputPersonnel {
	public static Scanner scanner = new Scanner(System.in);
	
	public static void inputEmployee(Employee employee) {
		System.out.print("Input your name: ");
		String name = scanner.nextLine();
		employee.setFullName(name);
		
		System.out.print("Input your birthday: ");
		String birthday = scanner.nextLine();
		employee.setBirthDay(birthday);
		
		System.out.print("Input your coefficients salary: ");
		float coefficientsSalary = scanner.nextFloat();
		scanner.nextLine();
		employee.setCoefficientsSalary(coefficientsSalary);
		
		System.out.print("Input your name department: ");
		String nameDepartment = scanner.nextLine();
		employee.setNameDepartment(nameDepartment);
		
		while(true) {
			System.out.print("Enter 1 to back menu: ");
			int back = Integer.parseInt(scanner.nextLine());
			if(back == 1) {
				App.menu();
			}
		}
	}
	
	public static void inputHeadOfDepartment(HeadOfDepartment headOfDepartment) {
		System.out.print("Input your name: ");
		String name = scanner.nextLine();
		headOfDepartment.setFullName(name);
		
		System.out.print("Input your birthday: ");
		String birthday = scanner.nextLine();
		headOfDepartment.setBirthDay(birthday);
		
		System.out.print("Input your coefficients salary: ");
		float coefficientsSalary = Float.parseFloat(scanner.nextLine());
		headOfDepartment.setCoefficientsSalary(coefficientsSalary);
		
		System.out.print("Input amount employee which head of department manager: ");
		int amountEmployee = Integer.parseInt(scanner.nextLine());
		headOfDepartment.setAmountEmployee(amountEmployee);
		
		while(true) {
			System.out.print("Enter 1 to back menu: ");
			int back = Integer.parseInt(scanner.nextLine());
			if(back == 1) {
				App.menu();
			}
		}
	}
	
	public static void inputDirector(Director director) {
		System.out.print("Input your name: ");
		String name = scanner.nextLine();
		director.setFullName(name);
		
		System.out.print("Input your birthday: ");
		String birthday = scanner.nextLine();
		director.setBirthDay(birthday);
		
		System.out.print("Input your coefficients salary: ");
		float coefficientsSalary = Float.parseFloat(scanner.nextLine());
		director.setCoefficientsSalary(coefficientsSalary);
		
		System.out.print("Input your job coefficient: ");
		float jobCoefficient =Float.parseFloat(scanner.nextLine());
		director.setJobCoefficient(jobCoefficient);
		
		while(true) {
			System.out.print("Enter 1 to back menu: ");
			int back = Integer.parseInt(scanner.nextLine());
			if(back == 1) {
				App.menu();
			}
		}
	}
}
