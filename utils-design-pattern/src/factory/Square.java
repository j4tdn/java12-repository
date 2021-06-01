package factory;

public class Square extends Shape {
	@Override
	void drawing() {
		System.out.println("Square >>> drawing...");
	}
	void setBorder() {
		System.out.println("Square >>> setBorder...");
	}
}
