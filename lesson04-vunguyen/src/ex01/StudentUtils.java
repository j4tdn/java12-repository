package ex01;

public class StudentUtils {
    public static float averageScore(Student student) {
        return (student.getLTScore() + student.getTHScore()) / 2;
    }
}
