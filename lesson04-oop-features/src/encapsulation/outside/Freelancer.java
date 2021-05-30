package encapsulation.outside;

import encapsulation.inside.Company;
import encapsulation.inside.Developer;

public class Freelancer extends Developer{
	public static void main(String[] args) {
		Company comp=new Company();
		comp.id=123;
//		comp.name="hihi";
//		comp.address="";
//		comp.fund=1234;
		
		Freelancer fr=new Freelancer();
		fr.getItSkills();
	}
}
