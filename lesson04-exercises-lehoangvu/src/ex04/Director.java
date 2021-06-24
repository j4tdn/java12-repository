package ex04;

public class Director extends People{
    private float coefficientPosition;

    public Director() {
    }

    public Director(String fullName, String bornYear, float coefficientsSalary, float coefficientPosition) {
        super(fullName, bornYear, coefficientsSalary);
        this.coefficientPosition = coefficientPosition;
    }

    public float getCoefficientPosition() {
        return coefficientPosition;
    }

    public void setCoefficientPosition(float coefficientPosition) {
        this.coefficientPosition = coefficientPosition;
    }

    public float getSalary(){
        return (coefficientsSalary + coefficientPosition) * 3000000;
    }

    @Override
    public String toString() {
        return "Director{" +
                "coefficientPosition=" + coefficientPosition +
                ", fullName='" + fullName + '\'' +
                ", coefficientsSalary=" + coefficientsSalary +
                "} " + super.toString();
    }
}
