package encapsulation.outside;

import encapsulation.inside.Company;
import encapsulation.inside.Developer;

public class Freelancer extends Developer {
	public static void main(String[] args) {
		Company comp = new Company();
		comp.id = 123;				// public
//		comp.name = "mgm";			// protected
//		comp.address = "Pasteur";	// default
//		comp.fund = 12345;			// private
		
		Freelancer fr = new Freelancer();
		fr.getItSkills();
	}
}
