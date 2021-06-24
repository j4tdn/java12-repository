package ex01;

public class Student {
	private int id;
	private String name;
	private float markLT;
	private float markTH;
	public Student() {
		this.id=0;
		this.markLT=0;
		this.markTH=0;
		this.name="";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMarkLT() {
		return markLT;
	}
	public void setMarkLT(float markLT) {
		this.markLT = markLT;
	}
	public float getMarkTH() {
		return markTH;
	}
	public void setMarkTH(float markTH) {
		this.markTH = markTH;
	}
	@Override
	public String toString() {
		 return String.format("%-5d %-20s %-20.2f %-20.2f %-20.2f ",id,name,markLT,markTH,DTB());
	}
	public Student(int id, String name, float markLT, float markTH) {
		this.id = id;
		this.name = name;
		this.markLT = markLT;
		this.markTH = markTH;
	}
	public float DTB() {
		return (float)(markLT+markTH)/2;
	}
}
