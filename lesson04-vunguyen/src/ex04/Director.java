package ex04;

public class Director extends People {
    private float jobCoefficient;

    public Director() {
    }

    public Director(String name, int yearOfBirth, float coefficientsSalary, float jobCoefficient) {
        super(name, yearOfBirth, coefficientsSalary);
        this.jobCoefficient = jobCoefficient;
    }

    public float getJobCoefficient() {
        return jobCoefficient;
    }

    public void setJobCoefficient(float jobCoefficient) {
        this.jobCoefficient = jobCoefficient;
    }

    @Override
    public String toString() {
        return String.format("%-20s", "DIRECTOR") + super.toString() + String.format("job coefficient: %-20.1f", jobCoefficient);
    }
}
