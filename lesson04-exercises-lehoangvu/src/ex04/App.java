package ex04;


import java.util.ArrayList;
import java.util.Scanner;

public class App {

    private static ArrayList<People> personnel = new ArrayList<People>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        input();
        int line;

        while (true) {
            System.out.println("=====================Menu====================");
            System.out.println("1 - Enter an employee information ");
            System.out.println("2 - Enter information into a Chief. ");
            System.out.println("3 - Enter the information a director.");
            System.out.println("4 - Print out a list of Personnel.");
            System.out.println("5 - Payroll for personnel.");
            System.out.println("6 - Exit.............");
            System.out.println("=============================================");
            System.out.print("Enter choose: ");
            line = Integer.parseInt(sc.nextLine());

            switch (line) {
                case 1: {
                    Employee e1 = new Employee();
                    inputEmployee(e1);
                    personnel.add(e1);
                    break;
                }
                case 2: {
                    ChiefOfDepartment tp1 = new ChiefOfDepartment();
                    inputChief(tp1);
                    personnel.add(tp1);
                    break;
                }
                case 3: {
                    Director d1 = new Director();
                    inputDirector(d1);
                    personnel.add(d1);
                    break;
                }
                case 4: {
                    System.out.println("======================== Print out a list of Personnel ========================");
                    for (People people : personnel) {
                        System.out.println(people.toString());
                    }
                    break;
                }
                case 5: {
                    System.out.println("======================== Payroll for personnel ========================");
                    System.out.printf("%-15s%-15s\n","FullName ", "Salary ");
                    for (People people : personnel) {
                        System.out.printf("%-15s%-15s\n", people.fullName, people.getCoefficientsSalary());
                    }
                    break;
                }
                case 6: {
                    break;
                }
                default:
                    System.out.println("Invalid !!!!");
                    continue;
            }
        }
    }

    private static void inputPeople(People people) {
        System.out.println("Enter information: ");

        System.out.print("Enter FullName: ");
        people.setFullName(sc.nextLine());

        System.out.print("Enter BornYear: ");
        people.setBornYear(sc.nextLine());

        System.out.print("Enter CoefficientsSalary: ");
        people.setCoefficientsSalary(Float.parseFloat(sc.nextLine()));
    }

    public static void inputEmployee(Employee employee) {
        inputPeople(employee);

        System.out.print("Enter NameDepartment:");
        employee.setNameDepartment(sc.nextLine());
    }

    public static void inputChief(ChiefOfDepartment tpOne) {
        inputPeople(tpOne);
        System.out.print("Enter Staff MemBers : ");
        tpOne.setStaffMembers(Integer.parseInt(sc.nextLine()));
    }

    public static void inputDirector(Director dir){
        inputPeople(dir);
        System.out.println("Enter Coefficient Position: ");
        dir.setCoefficientPosition(Float.parseFloat(sc.nextLine()));
    }

    public static void input(){
        Director dirrector = new Director("Nguyen van A","1996",4.0f,1.2f);
        ChiefOfDepartment chiefOfDepartment = new ChiefOfDepartment("Nguyen van B", "4000",3.2f,9);
        personnel.add(dirrector);
        personnel.add(chiefOfDepartment);
    }
}

