package encapsulation.inside;

public class Employee {
	public static void main(String[] args) {
		Company comp = new Company();
		comp.id = 123;				// public
		comp.name = "mgm";			// protected
		comp.address = "Pasteur";	// default
//		comp.fund = 12345;			// private
	}
}
