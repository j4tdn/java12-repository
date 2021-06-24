package ex01;

public class Student {
    private int id;
    private String name;
    private float LTScore;
    private float THScore;

    public Student() {
    }

    public Student(int studentId, String studentName, float LTScore, float THScore) {
        this.id = studentId;
        this.name = studentName;
        this.LTScore = LTScore;
        this.THScore = THScore;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getLTScore() {
        return LTScore;
    }

    public void setLTScore(float LTScore) {
        this.LTScore = LTScore;
    }

    public float getTHScore() {
        return THScore;
    }

    public void setTHScore(float THScore) {
        this.THScore = THScore;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + "LT:" + LTScore + " " + "TH:" + THScore;
    }

}
