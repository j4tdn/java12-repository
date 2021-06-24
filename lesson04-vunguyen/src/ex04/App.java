package ex04;

import java.util.ArrayList;
import java.util.List;

public class App {
    private static List<Integer> directorIndexes = new ArrayList<>();
    private static List<Integer> headOfDepartmentIndexes = new ArrayList<>();
    private static List<Integer> staffIndexes = new ArrayList<>();
    private static List<People> employees = new ArrayList<>();

    public static void main(String[] args) {
        int index = 0;
        while (true) {
            int selection = AppUtils.menu();
            switch (selection) {
                case 1:
                    employees.add(AppUtils.input(1));
                    directorIndexes.add(index);
                    index++;
                    break;
                case 2:
                    employees.add(AppUtils.input(2));
                    headOfDepartmentIndexes.add(index);
                    index++;
                    break;
                case 3:
                    employees.add(AppUtils.input(3));
                    staffIndexes.add(index);
                    index++;
                    break;
                case 4:
                    System.out.println("============= EMPLOYEES =============");
                    employeesOutput();
                    System.out.println();
                    break;
                case 5:
                    System.out.println("============= SALARY =============");
                    salaryOutput();
                    System.out.println();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid selection!");
                    break;
            }
        }
    }

    private static void employeesOutput() {
        for (int i : directorIndexes) {
            System.out.println(((Director) employees.get(i)).toString());
        }
        for (int i : headOfDepartmentIndexes) {
            System.out.println(((HeadOfDepartment) employees.get(i)).toString());
        }
        for (int i : staffIndexes) {
            System.out.println(((Staff) employees.get(i)).toString());
        }
    }

    private static void salaryOutput() {
        double salary = 0;
        for (int i : directorIndexes) {
            salary = (employees.get(i).getCoefficientsSalary() + ((Director) employees.get(i)).getJobCoefficient()) * 3000000;
            System.out.println(employees.get(i).getName() + ": " + salary);
        }
        for (int i : headOfDepartmentIndexes) {
            salary = employees.get(i).getCoefficientsSalary() * 2200000;
            System.out.println(employees.get(i).getName() + ": " + salary);
        }
        for (int i : staffIndexes) {
            salary = employees.get(i).getCoefficientsSalary() * 1250000;
            System.out.println(employees.get(i).getName() + ": " + salary);
        }
    }
}
