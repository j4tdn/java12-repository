package builder;

public class Person {
	private String firstname;
	private String lastname;
	private String hobbies;
	private int age;

	// will be initial from BUILDER
	private Person(Builder builder) {
		this.firstname = builder.firstname;
		this.lastname = builder.lastname;
		this.hobbies = builder.hobbies;
		this.age = builder.age;
	}
	
	public static Builder builder() {
		return new Builder();
	}

	// no sette, builder take care;
	// getter
	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getHobbies() {
		return hobbies;
	}

	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return "Person [firstname=" + firstname + ", lastname=" + lastname + ", hobbies=" + hobbies + ", age=" + age
				+ "]";
	}



	//nested class
	public static class Builder{
		private String firstname;
		private String lastname;
		private String hobbies;
		private int age;
		
		//this = builder
		private Builder() {
			
		}
		public Builder firstname(String firstname) {
			this.firstname= firstname;
			return this;
		}
		public Builder lastname(String lastname) {
			this.lastname= lastname;
			return this;
		}
		public Builder hobbies(String hobbies) {
			this.hobbies= hobbies;
			return this;
		}
		public Builder age(int age) {
			this.age= age;
			return this;
		}
		public Person builder() {
			return new Person(this);
		}
		
		
	}

}
