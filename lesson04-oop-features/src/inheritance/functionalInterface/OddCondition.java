package inheritance.functionalInterface;

public class OddCondition implements Predicate {

	@Override
	public boolean strategy(int num) {
		return num%2 == 0;
	}
  
}
