package inheritance.functionalinterface;

public class OddCondition implements Condition{

	@Override
	public boolean strategy(int num) {
		return num%2==0;
	}

}
