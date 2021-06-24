package ex01;

public class Student {
    private int MSSV;
    private String name;
    private float diemLT;
    private float diemTH;

    public Student() {
    }

    public Student(int MSSV, String name, float diemLT, float diemTH) {
        this.MSSV = MSSV;
        this.name = name;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public int getMSSV() {
        return MSSV;
    }

    public void setMSSV(int MSSV) {
        this.MSSV = MSSV;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }

    public float getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }

    public float scoreMedium(){
        return (float) (diemLT + diemTH)/2 ;
    }

    @Override
    public String toString() {
        return "Student{" +
                "MSSV=" + MSSV +
                ", name='" + name + '\'' +
                ", diemLT=" + diemLT +
                ", diemTH=" + diemTH +
                '}';
    }
}