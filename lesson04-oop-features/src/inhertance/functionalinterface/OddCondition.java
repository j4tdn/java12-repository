package inhertance.functionalinterface;

public class OddCondition implements Predicate{
	@Override
	public boolean test(int num) {
		return num % 2 != 0;
	}
}
