package inheritance.ssuper;

public class BussinessEmail extends AbstractEmail {

	@Override
	void login() {
		System.out.println("BussinessEmail >> login ...");
	}

	@Override
	void loginWith2Steps() {
		System.out.println("BussinessEmail >> loginWith2Steps ...");
	}
}
