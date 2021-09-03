package strategy;

public class Main {
	public static void main(String[] args) {
		Duck mallard = new Duck("Mallard", new FlyBehaviorImpl(), new QuackBehaviorImpl(), new SwimBehaviorImpl());
		
		System.out.println(mallard);
	}
}
