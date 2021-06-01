package builder;

public class Person {
	private String firstname;
	private String lastName;
	private String hobbies;
	private int age;

	// Will be initial from Builder
	private Person(Builder builder) {
		this.firstname = builder.firstname;
		this.lastName = builder.lastName;
		this.hobbies = builder.hobbies;
		this.age = builder.age;
	}

	public static Builder builder() {
		return new Builder();
	}

	// no setter, builder takes care
	// getter
	public String getFirstname() {
		return firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public String getHobbies() {
		return hobbies;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Person [firstname=" + firstname + ", lastName=" + lastName + ", hobbies=" + hobbies + ", age=" + age
				+ "]";
	}

//nested class
	public static class Builder {
		private String firstname;
		private String lastName;
		private String hobbies;
		private int age;

		private Builder() {

		}

		public Builder firstName(String firstname) {
			this.firstname = firstname;
			return this;
		}

		public Builder lastName(String lastename) {
			this.lastName = lastename;
			return this;
		}

		public Builder hobbies(String hobbies) {
			this.hobbies = hobbies;
			return this;
		}

		public Builder age(int age) {
			this.age = age;
			return this;
		}

		public Person build() {
			return new Person(this);
		}
	}
}
