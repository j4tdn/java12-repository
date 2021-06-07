package inheritance.functionalinterface;

public class OddCondition implements Condition {

	@Override
	public boolean strategy(int number) {
		return number %2==0;
	}
	
}
