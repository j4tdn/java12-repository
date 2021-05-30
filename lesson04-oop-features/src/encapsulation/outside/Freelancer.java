package encapsulation.outside;

import encapsulation.inside.Company;
import encapsulation.inside.Developer;

public class Freelancer extends Developer {
	public static void main(String[] args) {
		Company comp = new Company();
		comp.id=123;
//		comp.name ="mgm";
//		comp.address ="pasteur";
//		comp.fun=123;
		
		Developer dv = new Developer();
		//dv.getItSkills();
	}

}
