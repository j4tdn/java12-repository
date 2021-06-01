package exacapsulation.outside;

import exacapsulation.inside.Company;
import exacapsulation.inside.Developer;

public class Frelancer extends Developer {
	public static void main(String[] args) {
		Company comp = new Company();
		comp.id = 120;
		// comp.name="mgm";
        //	comp.address="pasteur";
       //	comp.fund=2000;
		Frelancer fr=new Frelancer();
		fr.getItSkills();
	}
//	@Override
//	protected String getItSkills() {
//		return "HTML,CSS,SQL";
//	}
	@Override
	public String getItSkills() {
		return "HTML,CSS,SQL";
	}

}
