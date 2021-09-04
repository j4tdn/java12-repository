package ex02;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public final class CDUtils {
    private static Scanner scanner = new Scanner(System.in);

    private CDUtils() {
    }

    public static int menu() {
        System.out.println("1. Add CD");
        System.out.println("2. Show number of CDs");
        System.out.println("3. Show total price of CDs");
        System.out.println("4. Sort CDs in descending order by price");
        System.out.println("5. Sort CDs in ascending order by id");
        System.out.println("6. Show CDs");
        System.out.println("7. Exit");
        System.out.println("Choose: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public static void add(CD cd, List<CD> CDs) {
        if (CDs.contains(cd)) {
            System.out.println(cd.getId() + " is already in the list");
            System.out.println("Add unsuccessfully");
        } else {
            CDs.add(cd);
            System.out.println("Add successfully");
        }
    }

    public static void showNumbersOfCDs(List<CD> CDs) {
        System.out.println("Number of CD: " + CDs.size());
    }

    public static void showTotalPrice(List<CD> CDs) {
        double totalPrice = 0d;
        for (CD cd : CDs) {
            totalPrice += cd.getPrice();
        }
        System.out.println("Total price: " + totalPrice);
    }

    public static void sortCDsByPriceDesOrder(List<CD> CDs) {
//        CDs.sort((c1, c2) -> (int) (c2.getPrice() - c1.getPrice()));
        CDs.sort(Comparator.comparing(CD::getPrice).reversed());
        System.out.println("Sort successfully");
    }

    public static void sortCdsByNameAscOrder(List<CD> CDs) {
        CDs.sort(Comparator.comparing(CD::getName));
        System.out.println("Sort successfully");
    }

    public static void printfCDs(List<CD> CDs) {
        for (CD cd : CDs) {
            System.out.println(cd);
        }
    }
}
