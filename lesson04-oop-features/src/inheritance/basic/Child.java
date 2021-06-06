package inheritance.basic;

public class Child extends Parent {
	// No @Override thuoc tinh
	@Override
	void log(String message) {
		super.log(message);
	}

	@Override
	void text() {
		super.text();
	}
	
}
