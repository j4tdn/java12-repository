package bean;

//Strategy
@FunctionalInterface
public interface Condition{
	public boolean test(int digit);
}
