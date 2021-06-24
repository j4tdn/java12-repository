package ex04;

public class Staff extends People {
    private String departmentName;

    public Staff() {
    }

    public Staff(String name, int yearOfBirth, float coefficientsSalary, String departmentName) {
        super(name, yearOfBirth, coefficientsSalary);
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return String.format("%-20s", "STAFF") + super.toString() + String.format("department name: %-20s", departmentName);
    }
}
