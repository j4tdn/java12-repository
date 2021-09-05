import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950));


        // 1. Find all transactions in the year 2011 and sort them by value (small to high)
        System.out.println("Ex01");
        transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("====================================");


        // 2. Find all transactions have value greater than 300 and sort them by trader’s city
        System.out.println("Ex02");
        transactions.stream()
                .filter(transaction -> transaction.getValue() > 300)
                .sorted(Comparator.comparing(c -> c.getTrader().getCity()))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("=====================================");

        // 3. What are all the unique cities where the traders work?
        System.out.println("Ex03");
        transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("======================================");

        // 4. Find all traders from Cambridge and sort them by name desc.
        System.out.println("Ex04");
        transactions.stream()
                .map(Transaction::getTrader)
                .distinct()
                .filter(trader -> "Cambridge".equals(trader.getCity()))
                .sorted(Comparator.comparing(Trader::getName).reversed())
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("======================================");

        // 5. Return a string of all traders’ names sorted alphabetically.
        System.out.println("Ex05");
        transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted(Comparator.comparing(Function.identity()))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("======================================");

        // 6. Are any traders based in Milan?
        System.out.println("Ex06");
        System.out.println("Trader based in Milan: " + transactions.stream()
                .map(Transaction::getTrader)
                .distinct()
                .anyMatch(trader -> "Milan".equals(trader.getCity())));

        System.out.println("======================================");

        // 7. Count the number of traders in Milan.
        System.out.println("Ex07");
        System.out.println("Number of traders in Milan: " + transactions.stream()
                .map(Transaction::getTrader)
                .distinct()
                .filter(trader -> "Milan".equals(trader.getCity()))
                .count());

        System.out.println("======================================");

        // 8. Print all transactions’ values from the traders living in Cambridge.
        System.out.println("Ex08");
        transactions.stream()
                .filter(transaction -> "Cambridge".equals(transaction.getTrader().getCity()))
                .map(Transaction::getValue)
                .forEach(System.out::println);

        System.out.println("======================================");

        // 9. What’s the highest value of all the transactions?
        System.out.println("Ex09");
        System.out.println("highest value of all the transactions: " + transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer.MIN_VALUE, Integer::max));

        System.out.println("=======================================");

        // 10. Find the transaction with the smallest value.
        System.out.println("Ex10");
        System.out.println("smallest value of all the transactions: " + transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer.MAX_VALUE, Integer::min));
    }
}
