package ex03;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Ex03 {
    private static final String INPUT_PATH = "input.txt";
    private static final String OUTPUT_PATH = "output.txt";

    public static void main(String[] args) {
        File input = new File(INPUT_PATH);
        List<String> lines = null;
        try {
            lines = Files.readAllLines(input.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<Integer> maxValues = new LinkedList<>();
        for (String line : lines) {
            String[] nums = line.split("[a-zA-Z]+");
            OptionalInt max = Arrays.stream(nums)
                                    .filter(num -> !num.isBlank())
                                    .mapToInt(Integer::parseInt)
                                    .max();
            max.ifPresent(maxValues::add);
        }
        List<String> results = maxValues.stream().sorted().map(String::valueOf).collect(Collectors.toList());

        File output = new File(OUTPUT_PATH);
        try {
            Files.write(output.toPath(), results, StandardOpenOption.WRITE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
