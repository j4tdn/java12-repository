package demo;

import utils.ArrayUtils;
import utils.CollectionUtils;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Ex10 {
    public static void main(String[] args) {
        List<String> s1 = Arrays.asList("a", "b", "c");
        List<String> s2 = Arrays.asList("I", "II", "III");
        List<String> s3 = Arrays.asList(".", "*", "^");

        List<List<String>> s = Arrays.asList(s1, s2, s3);

        List<String> apbData = s.stream() // Stream<List<String>>
                .flatMap(Collection::stream) // Stream<String>
                .filter(item -> item.matches("[a-zA-Z]+"))
                .collect(Collectors.toList()); // List<String>
        CollectionUtils.printf(apbData);

        System.out.println("========================");

        // array -> Arrays.stream(array) = Arrays::stream
        int[][] a = {{1, 3, 5}, {2, 4, 6}, {10, 20, 30}};
        int[] data = Arrays.stream(a) // Stream<int[]>
                .flatMapToInt(Arrays::stream) // IntStream
                .filter(item -> item % 2 != 0)
                .toArray();
        ArrayUtils.printf(data);
    }
}