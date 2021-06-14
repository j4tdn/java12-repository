package inheritance.functionalinterface;

public class OddPredicate implements Predicate{

	@Override
	public boolean strategy(int numf) {
		return numf % 2 == 0;
	}
	
}
