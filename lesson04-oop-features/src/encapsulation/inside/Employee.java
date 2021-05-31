package encapsulation.inside;

public class Employee {
	public static void main(String[] args) {
	Company comp = new Company();
	comp.id=123;			 //public
	comp.address="Pasteur"; //protected
	comp.name ="mgm"; 		//default
//	comp.fun; 				//private
}
}
