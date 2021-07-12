package ex01;

public class Student {
    private String id;
    private String name;
    private Grade grade;
    private boolean retake = false;

    public Student() {
    }

    public Student(String[] str) {
        if (str.length != 3) {
            throw new IllegalArgumentException();
        }
        this.id = str[0];
        this.name = str[1];
        this.grade = Grade.valueOf(str[2]);
    }

    public Student(String id, String name, Grade grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public boolean isRetake() {
        return retake;
    }

    public void setRetake(boolean retake) {
        this.retake = retake;
    }

    @Override
    public String toString() {
        return id + "-" + name + "-" + grade;
    }
}
