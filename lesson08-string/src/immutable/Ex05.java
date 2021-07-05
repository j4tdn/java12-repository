package immutable;

import bean.Student;

public class Ex05 {
    public static void main(String[] args) {
        // File: Student.txt
        // 120130. Adam Ton , 7.9
        // 123451. Kate Hence, 8.2

        // Database : column

        String[] lines = {"120130,Adam Ton, 7.9","123451, Kate Hence, 8.2"};

        for(String line : lines) {
            String[] tokens = line.split(", ");

            Student student = new Student(tokens[0], tokens[1], Double.parseDouble(tokens[2]));

            System.out.println(student);
        }

        // Find valid numbers in the text below
        System.out.println("===================");
        String text = "ab123d87rrrre012f";

        //D:stand for not digit
        //d:stand for digit

        String[]  numbers = text.split("\\D+");
        //text.spits("[a-z]"+);
        System.out.println(numbers.length);
        for (String number : numbers){
            System.out.println(number);
        }

    }
}
