package functional;

@FunctionalInterface
public interface BiFunction<R, S, T> {
	T get(R r, S s);
}
