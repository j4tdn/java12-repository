package ex01;

public class Student {
	private String id;
	private String name;
	private Type type;
	private int learnTime=1;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String id, String name, Type type) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Type getType() {
		return type;
	}


	public void setType(Type type) {
		this.type = type;
	}

	public int getLearnTime() {
		return learnTime;
	}

	public void setLearnTime(int learnTime) {
		this.learnTime = learnTime;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", type=" + type + "]";
	}



	public enum Type {
		A,B,C,D,E,F
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == this) {
			return true;
		}
		if(obj == null || !(obj instanceof Student)) {
			return false;
		}
		Student student = (Student)obj;
		return student.getId().equals(getId());
	}
	
}

