package utils;

import java.util.Collection;

public class CollectionUtils {
    private CollectionUtils() {

    }
    public static <E> void Printf(Collection<E> elements) {
        elements.stream().forEach(System.out::println);
    }
}
