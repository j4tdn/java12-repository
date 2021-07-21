package learn.again;

@FunctionalInterface
interface Strategy {
	boolean condition(int a);
}
