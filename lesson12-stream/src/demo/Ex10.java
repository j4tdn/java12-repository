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


        //list->list.stream() == COllection::stream
        List<String> appData = s.stream()//Stream<List<String>>
                .flatMap(Collection::stream) //Stream<String>
                .filter(item -> item.matches("[a-z]+"))
                .collect(Collectors.toList());
        CollectionUtils.printf(appData);

        System.out.println("=================");
        int[][] a = {{1, 3, 4}, {2, 4, 6}, {7, 8, 9}};
        int[] data = Arrays.stream(a)
                .flatMapToInt(Arrays::stream)
                .filter(item -> item % 2 != 0)
                .toArray();
        ArrayUtils.printf(data);
    }
}