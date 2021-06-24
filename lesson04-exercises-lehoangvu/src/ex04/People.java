package ex04;

public class People {
    protected String fullName;
    protected String bornYear;
    protected float coefficientsSalary;

    public People() {
    }

    public People(String fullName, String bornYear, float coefficientsSalary) {
        this.fullName = fullName;
        this.bornYear = bornYear;
        this.coefficientsSalary = coefficientsSalary;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBornYear() {
        return bornYear;
    }

    public void setBornYear(String bornYear) {
        this.bornYear = bornYear;
    }

    public float getCoefficientsSalary() {
        return coefficientsSalary;
    }

    public void setCoefficientsSalary(float coefficientsSalary) {
        this.coefficientsSalary = coefficientsSalary;
    }

    @Override
    public String toString() {
        return "People{" +
                "fullName='" + fullName + '\'' +
                ", bornYear='" + bornYear + '\'' +
                ", coefficientsSalary=" + coefficientsSalary +
                '}';
    }
}
