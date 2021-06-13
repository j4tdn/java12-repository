package interitance.functionalinterface;

public class EvenPredicate implements Predicate {
    @Override
    public boolean stratery(int num) {
        return num % 2 == 0;
    }
}
