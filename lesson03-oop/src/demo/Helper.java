package demo;

public class Helper {
	private int a;
	private int b;

	public Helper(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int sum() {
		return a + b;
	}

	public static void main(String[] args) {
		Helper h1 = new Helper(5,6);
		System.out.println(h1.sum());
		
		Helper h2 = new Helper(5,10);
		System.out.println(h2.sum());
		
		Helper h3 = new Helper(12,6);
		System.out.println(h3.sum());
	}
}
