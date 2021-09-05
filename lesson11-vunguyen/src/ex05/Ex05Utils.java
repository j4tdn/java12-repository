package ex05;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.Predicate;

public final class Ex05Utils {
    private Ex05Utils() {
    }

    public static Map<String, Integer> get() {
        Map<String, Integer> expenses = new HashMap<>();
        expenses.put("D", 12);
        expenses.put("C", 400);
        expenses.put("B", 50000);
        expenses.put("A", 10000);
        return expenses;
    }

    public static List<String> listExpenses(Map<String, Integer> expenses, Predicate<Integer> predicate) {
        List<Entry<String, Integer>> entries = new LinkedList<>(expenses.entrySet());
        List<String> expensesInfo = new ArrayList<>();

        for (Entry<String, Integer> entry : entries) {
            if (predicate.test(entry.getValue())) {
                expensesInfo.add(entry.getKey());
            }
        }

        return expensesInfo;
    }

    public static Map<String, Integer> sortExpenses(Map<String, Integer> expenses, Comparator<Entry<String, Integer>> comparator) {
        List<Entry<String, Integer>> entries = new LinkedList<>(expenses.entrySet());

        entries.sort(comparator);

        Map<String, Integer> results = new LinkedHashMap<>();
        for (Entry<String, Integer> entry : entries) {
            results.put(entry.getKey(), entry.getValue());
        }

        return results;
    }
}
