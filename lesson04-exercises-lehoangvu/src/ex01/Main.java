package ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static List<Student> list = new ArrayList<Student>();

    public static void main(String[] args) {
        Student student01 = new Student(123, "Le Hoang Vu", 5, 5);
        Student student02 = new Student(456, "Vu Hoang Le ", 6, 7);
        list.add(student01);
        list.add(student02);
        input();
        output();
    }

    private static void input() {
        Student stu03 = new Student();
        System.out.println("Enter student information");

        System.out.println("Enter MSSV: ");
        stu03.setMSSV(Integer.parseInt(sc.nextLine()));

        System.out.println("Enter name: ");
        stu03.setName(sc.nextLine());

        System.out.println("Enter diemLT: ");
        stu03.setDiemLT(Float.parseFloat(sc.nextLine()));

        System.out.println("Enter diemTH: ");
        stu03.setDiemTH(Float.parseFloat(sc.nextLine()));

        list.add(stu03);
    }

    public static void output() {
        System.out.println("-------------------------------LIST OF MEMBERS-------------------------------");

        System.out.printf("%-20s %-20s %-15s %-15s %-15s \n","MSSV","FullName","Score LT","Score TH","scoreMedium");
        for (Student i : list) {
            System.out.printf("%-20s %-20s %-15s %-15s %-15s \n", i.getMSSV(), i.getName(), i.getDiemLT(), i.getDiemTH(), i.scoreMedium());

        }
    }
}