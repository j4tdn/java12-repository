package builder.student;

public class Student {
	private String name;
	private int age;
	private String id;
	private Boolean sex;
	private String university;
	
	private Student(BuilderStudent builderStudent) {
		this.name = builderStudent.name;
		this.age  = builderStudent.age;
		this.id = builderStudent.id;
		this.sex = builderStudent.sex;
		this.university = builderStudent.university;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getId() {
		return id;
	}

	public Boolean getSex() {
		return sex;
	}

	public String getUniversity() {
		return university;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", id=" + id + ", sex=" + sex + ", university=" + university
				+ "]";
	}
	
	public static class BuilderStudent {
		private String name;
		private int age;
		private String id;
		private Boolean sex;
		private String university;
		
		private BuilderStudent() {
			
		}
		
		public static BuilderStudent builder() {
			return new BuilderStudent();
		}
		
		public BuilderStudent name(String name) {
			this.name = name;
			return this;
		}
		public BuilderStudent age(int age) {
			this.age = age;
			return this;
		}
		public BuilderStudent id(String id) {
			this.id = id;
			return this;
		}
		public BuilderStudent sex(Boolean sex) {
			this.sex = sex;
			return this;
		}
		public BuilderStudent university(String university) {
			this.university = university;
			return this;
		}
		
		public Student build() {
			return new Student(this);
		}
	}
}
