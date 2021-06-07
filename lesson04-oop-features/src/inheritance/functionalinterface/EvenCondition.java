package inheritance.functionalinterface;

public class EvenCondition implements Condition{

	@Override
	public boolean stategy(int num) {
		// TODO Auto-generated method stub
		return num % 2 == 0;
	}
	
}
