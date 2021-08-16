package utils;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class CollectionUtils {
private CollectionUtils() {
	// TODO Auto-generated constructor stub
}

public static <E>void printf(Collection<E> elements){
	for(E e: elements ) {
		System.out.println(e);
	}
}
public static<R,T> Set<R> map(List<T> ts,Function<T, R> function){
	Set<R> result=new LinkedHashSet<>();
	for(T t : ts) {
		result.add(function.apply(t));
	}
	return result;
}
}
