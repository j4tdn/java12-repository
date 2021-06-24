package ex04;

public class People {
    private String name;
    private int yearOfBirth;
    private float coefficientsSalary;

    public People() {
    }

    public People(String name, int yearOfBirth, float coefficientsSalary) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.coefficientsSalary = coefficientsSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public float getCoefficientsSalary() {
        return coefficientsSalary;
    }

    public void setCoefficientsSalary(float coefficientsSalary) {
        this.coefficientsSalary = coefficientsSalary;
    }

    @Override
    public String toString() {
        return String.format("name: %-20syear of birth: %-20dcoefficients salary: %-20.1f", name, yearOfBirth, coefficientsSalary);
    }
}
