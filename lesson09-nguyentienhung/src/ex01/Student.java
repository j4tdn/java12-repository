package ex01;

public class Student {
	private String idStudent;
	private String fullName;
	private Equivalent equivalent;
	public Student() {
		super();
	}
	public Student(String idStudent, String fullName, Equivalent equivalent) {
		super();
		this.idStudent = idStudent;
		this.fullName = fullName;
		this.equivalent = equivalent;
	}
	public String getIdStudent() {
		return idStudent;
	}
	public void setIdStudent(String idStudent) {
		this.idStudent = idStudent;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Equivalent getEquivalent() {
		return equivalent;
	}
	public void setEquivalent(Equivalent equivalent) {
		this.equivalent = equivalent;
	}
	@Override
	public String toString() {
		return "Student [idStudent=" + idStudent + ", fullName=" + fullName + ", equivalent=" + equivalent + "]";
	}
	
}
