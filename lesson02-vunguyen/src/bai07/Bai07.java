package bai07;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Random;

public class Bai07 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 20; i <= 30; i++) {
            numbers.add(i);
        }
        for (int i = 0; i < 5; i++) {
            int randomValue = random(numbers);
            System.out.println(randomValue);
            numbers.remove(new Integer(randomValue));
        }
    }

    public static int random(ArrayList<Integer> numbers) {
        Random random = new Random();
        return numbers.get(random.nextInt(numbers.size()));
    }
}
