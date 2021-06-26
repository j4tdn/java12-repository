package Ex01;

public class Student {
	private int  Id;
	private String Name;
	private float LT;
	private float TH;
	public Student() {
		
	}
	public Student(int id, String name, float lT, float tH) {
		Id = id;
		Name = name;
		LT = lT;
		TH = tH;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public float getLT() {
		return LT;
	}
	public void setLT(float lT) {
		LT = lT;
	}
	public float getTH() {
		return TH;
	}
	public void setTH(float tH) {
		TH = tH;
	}
	public float AverageScore()
	{
		return (LT+TH)/2;
	}
	@Override
	public String toString() {
		
		return Id+"\t"+Name+"\t"+ LT+ "\t"+TH;
	}
	
}
