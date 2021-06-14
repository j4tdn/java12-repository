package ex05;

public class Customer {
	private int id;
	private String name;
	private int num;
	private String add;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Customer(int id, String name, int num, String add) {
		this.id = id;
		this.name = name;
		this.num = num;
		this.add = add;
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

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", num=" + num + ", add=" + add + "]";
	}
	
	
}
