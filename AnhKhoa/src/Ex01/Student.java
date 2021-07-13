package Ex01;

enum Ratings {
	A, B, C, D, E, F
}

public class Student {
	private int id;
	private String name;
	private Ratings rating;

	public Student() {
		// TODO Auto-generated constructor stub
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

	public Ratings getRating() {
		return rating;
	}

	public void setRating(Ratings rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rating=" + rating + "]";
	}

	public Student(int id, String name, Ratings rating) {
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
	}

}
