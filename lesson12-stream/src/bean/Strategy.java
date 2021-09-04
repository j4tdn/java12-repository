package bean;

public interface Strategy<T> {
	boolean behavior(T e);
}
