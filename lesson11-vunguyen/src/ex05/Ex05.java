package ex05;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Ex05 {
    public static void main(String[] args) {
        Map<String, Integer> expenses = Ex05Utils.get();

        List<String> expensesInfo = Ex05Utils.listExpenses(expenses, expense -> expense > 500);
        expensesInfo.forEach(System.out::println);

        System.out.println("=================================");

        Map<String, Integer> sortedExpensesByKey = Ex05Utils.sortExpenses(expenses, Entry.comparingByKey());
        // entrySet() in LinkedHashMap guarantee order
        // forEach in Map use entrySet() to iterate
        sortedExpensesByKey.forEach((key, value) -> System.out.println("(" + key + " , " + value + ")"));

        System.out.println("=================================");

        // Can't use Entry.comparingByValue().reversed()
        Map<String, Integer> sortedExpensesByValue = Ex05Utils.sortExpenses(expenses, (c1, c2) -> c2.getValue() - c1.getValue());
        sortedExpensesByValue.forEach((key, value) -> System.out.println("(" + key + " , " + value + ")"));

    }
}
