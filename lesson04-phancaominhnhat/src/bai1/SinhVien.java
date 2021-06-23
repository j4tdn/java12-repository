package bai1;

public class SinhVien {
	private int studentCode;
	private String name;
	private float pointTheory;
	private float pointPractice;
	
	public SinhVien() {}

	public SinhVien(int studentCode, String name, float pointTheory, float pointPractice) {
		this.studentCode = studentCode;
		this.name = name;
		this.pointTheory = pointTheory;
		this.pointPractice = pointPractice;
	}

	public int getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(int studentCode) {
		this.studentCode = studentCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPointTheory() {
		return pointTheory;
	}

	public void setPointTheory(float pointTheory) {
		this.pointTheory = pointTheory;
	}

	public float getPointPractice() {
		return pointPractice;
	}

	public void setPointPractice(float pointPractice) {
		this.pointPractice = pointPractice;
	}
	
	public float getPointMedium() {
		return (float)((pointTheory + pointPractice) / 2);
	}

	@Override
	public String toString() {
		return "SinhVien [studentCode=" + studentCode + ", name=" + name + ", pointTheory=" + pointTheory
				+ ", pointPractice=" + pointPractice + "]";
	}
}
