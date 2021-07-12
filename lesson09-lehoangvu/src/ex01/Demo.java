package ex01;

public class Demo {
    public static void main(String[] args) {

        Students[] students = {
                new Students("102", "Nam", Level.C),
                new Students("104", "Hoàng", Level.D),
                new Students("109", "Lan", Level.A),
                new Students("103", "Bảo", Level.F),
                new Students("105", "Nguyên", Level.B),
                new Students("107", "Vũ", Level.F),
                new Students("103", "Bảo", Level.F),
                new Students("202", "Đạt", Level.C),
                new Students("107", "Vũ", Level.C),
                new Students("193", "Bảo", Level.B),
                new Students("104", "Hoàng", Level.B)
        };
        System.out.println("==============================");
        System.out.println("Những học sinh đoạt loại A trong năm 2021 là:");
        studentsGetA(students);
        System.out.println("==============================");

        System.out.println("Những học sinh tham gia học lại môn cấu trúc dữ liệu trong năm 2021 là:");
        studentsLearnAgain(students);

    }

    private static void studentsGetA(Students[] students) {
        for (Students student : students) {
            if (student.getLevel() == Level.A) {
                System.out.println(student);
            }
        }
    }

    /**
     * code có tham khảo và đã debug.!!
     * @param students
     */
    private static void studentsLearnAgain(Students[] students) {

        int index = 0;

        for (int i = 0; i < students.length; i++) {
            if (students[i].getLevel() == Level.F) {
                for (int j = i + 1; j < students.length; j++) {
                    if (students[i].getId().equals(students[j].getId())) {
                        int k = 0;
                        for (k = 0; k < index; k++) {
                            if (students[k].getId().equals(students[i].getId())) {
                                break;
                            }
                        }
                        if (k == index) {
                            System.out.println(students[i]);
                        }
                    }
                }
            }
        }
    }
}

