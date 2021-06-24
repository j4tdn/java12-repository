package ex04;

public class ChiefOfDepartment extends People{
    private int staffMembers;

    public ChiefOfDepartment() {
    }

    public ChiefOfDepartment(String fullName, String bornYear, float coefficientsSalary, int staffMembers) {
        super(fullName, bornYear, coefficientsSalary);
        this.staffMembers = staffMembers;
    }

    public int getStaffMembers() {
        return staffMembers;
    }

    public void setStaffMembers(int staffMembers) {
        this.staffMembers = staffMembers;
    }

    public float getSalary(){
        return coefficientsSalary * 2200000;
    }

    @Override
    public String toString() {
        return "ChiefOfDepartment{" +
                "staffMembers=" + staffMembers +
                ", fullName='" + fullName + '\'' +
                ", bornYear='" + bornYear + '\'' +
                ", coefficientsSalary=" + coefficientsSalary +
                "} " + super.toString();
    }
}
