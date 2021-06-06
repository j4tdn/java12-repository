package polymorphism.method;
import static polymorphism.method.MathUtils.*;

import encapsulation.inside.Developer;
public class Demo {

	public static void main(String[] args) {
		
		//overloading
		MathUtils.sum(1, 2);
		sum(1.2f, 2.2f); //Sau khi import thì ko cần MathUtils
		sum(1, 2, 3);
	}

}
