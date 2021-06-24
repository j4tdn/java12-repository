package ex04;

public class Employee extends People{
    private String nameDepartment;

    public Employee() {
    }

    public Employee(String fullName, String bornYear, float coefficientsSalary, String nameDepartment) {
        super(fullName, bornYear, coefficientsSalary);
        this.nameDepartment = nameDepartment;
    }




    public String getNameDepartment() {
        return nameDepartment;
    }

    public void setNameDepartment(String nameDepartment) {
        this.nameDepartment = nameDepartment;
    }

    public float getSalary(){
        return this.coefficientsSalary * 1250000;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "nameDepartment='" + nameDepartment + '\'' +
                ", fullName='" + fullName + '\'' +
                ", bornYear='" + bornYear + '\'' +
                ", coefficientsSalary=" + coefficientsSalary +
                "} " + super.toString();
    }
}
