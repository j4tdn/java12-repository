package inheritance.basic;

public class Demo {
	public static void main(String[] args) {
		Child child = new Child();
		System.out.println("Number: " + child.number);
		child.text();
		child.log("abc xyz");
	}
}
