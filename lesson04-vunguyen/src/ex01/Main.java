package ex01;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Student sv1 = new Student(1, "Nguyen Anh Vu", 10, 9);
        Student sv2 = new Student(2, "Nguyen Van A", 2, 3);
        Student sv3 = studentInput();
        Student[] students = {sv1, sv2, sv3};
        System.out.printf("%-18s%-20s%-20s%-20s%s\n", "MSSV", "ho ten", "diem LT", "diem TH", "diem TB");
        for (Student student : students) {
            System.out.printf("%-18d%-20s%-20.1f%-20.1f%.1f\n", student.getId(), student.getName(), student.getLTScore(), student.getTHScore(), StudentUtils.averageScore(student));
        }
    }

    private static Student studentInput() {
        Student student = new Student();
        System.out.println("Input ID: ");
        student.setId(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Input student name: ");
        student.setName(scanner.nextLine());
        System.out.println("Input LT score: ");
        student.setLTScore(scanner.nextFloat());
        System.out.println("Input TH score: ");
        student.setTHScore(scanner.nextFloat());
        return student;
    }
}
