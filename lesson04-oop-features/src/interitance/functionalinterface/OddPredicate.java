package interitance.functionalinterface;

public class OddPredicate implements Predicate {

    @Override
    public boolean stratery(int num) {
        return num % 2 != 0;
    }
}
