package ex04;

public class HeadOfDepartment extends People {
    private int numberOfManagementStaff;

    public HeadOfDepartment() {
    }

    public HeadOfDepartment(String name, int yearOfBirth, float coefficientsSalary, int numberOfManagementStaff) {
        super(name, yearOfBirth, coefficientsSalary);
        this.numberOfManagementStaff = numberOfManagementStaff;
    }

    public int getNumberOfManagementStaff() {
        return numberOfManagementStaff;
    }

    public void setNumberOfManagementStaff(int numberOfManagementStaff) {
        this.numberOfManagementStaff = numberOfManagementStaff;
    }

    @Override
    public String toString() {
        return String.format("%-20s", "HEAD OF DEPARTMENT") + super.toString() + String.format("number of management staff: %-20d", numberOfManagementStaff);
    }
}
