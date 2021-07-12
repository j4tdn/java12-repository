package ex01;

import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {
        String[] strArrOfStudents = {
                " 102-Nam-C",
                " 104-Hoàng-D",
                " 109-Lan-A",
                " 103-Bảo-F",
                " 105-Nguyên-B",
                " 107-Vũ-F",
                " 103-Bảo-F",
                " 202-Đạt-C",
                " 107-Vũ-C",
                " 193-Bảo-B",
                " 104-Hoàng-B",
        };
        Student[] students = addStudents(strArrOfStudents);

        System.out.println("List of students who achieved grade A in 2021: "
                + Arrays.toString(getStudents(students, student -> student.getGrade().equals(Grade.A))));
        System.out.println("List of students who fail Date Structure course in 2021: "
                + Arrays.toString(getStudents(students, student -> student.isRetake())));
    }

    private static Student[] addStudents(String[] strArrOfStudents) {
        Student[] students = new Student[strArrOfStudents.length];
        int count = 0;
        outerLoop:
        for (String strArrOfStudent : strArrOfStudents) {
            String[] strArrOfStudentAttributes = strArrOfStudent.split("-");
            for (int j = 0; j < count; j++) {
                if (strArrOfStudentAttributes[0].equals(students[j].getId())) {
                    students[j].setGrade(Grade.valueOf(strArrOfStudentAttributes[2]));
                    students[j].setRetake(true);
                    continue outerLoop;
                }
            }
            students[count] = new Student(strArrOfStudentAttributes);
            count++;
        }
        students = Arrays.copyOf(students, count);
        System.out.println("count: " + count);
        return students;
    }

    private static Student[] getStudents(Student[] students, Comparator comparator) {
        Student[] selections = new Student[students.length];
        int count = 0;
        for (Student student : students) {
            if (comparator.compare(student)) {
                selections[count] = student;
                count++;
            }
        }
        selections = Arrays.copyOf(selections, count);
        return selections;
    }
}
