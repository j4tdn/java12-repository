package bean;

@FunctionalInterface
public interface Condition {
	boolean test(int digit);
}
