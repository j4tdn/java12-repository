package strategy;

public class NoQuackBehaviorImpl implements QuackBehavior {
	@Override
	public String print() {
		return "Quack";
	}
}
