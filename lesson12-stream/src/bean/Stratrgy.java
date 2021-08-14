package bean;

@FunctionalInterface
public interface Stratrgy<T> {
	boolean behavior(T t);
}
