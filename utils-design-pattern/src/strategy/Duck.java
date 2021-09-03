package strategy;

public class Duck {
	private String name;
	private FlyBehavior flyBehavior;
	private QuackBehavior quackBehavior;
	private SwimBehavior swimBehavior;
	
	public Duck() {
	}

	public Duck(String name, FlyBehavior flyBehavior, QuackBehavior quackBehavior, SwimBehavior swimBehavior) {
		super();
		this.name = name;
		this.flyBehavior = flyBehavior;
		this.quackBehavior = quackBehavior;
		this.swimBehavior = swimBehavior;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public FlyBehavior getFlyBehavior() {
		return flyBehavior;
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public QuackBehavior getQuackBehavior() {
		return quackBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	public SwimBehavior getSwimBehavior() {
		return swimBehavior;
	}

	public void setSwimBehavior(SwimBehavior swimBehavior) {
		this.swimBehavior = swimBehavior;
	}
	
	@Override
	public String toString() {
		return "Duck " + name + " has behaviors " + flyBehavior.print() + " " + quackBehavior.print() + " " + swimBehavior.print();
	}
}
