package exercises;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Ex02RandomPass {
    private static String USERNAME = "admin";
    private static String PASSWORD = "257";
    // null khong the goi ham.

    public static void main(String[] args) {
        String[] data = new String[1000]; // valid of String is null
        Random rd = new Random();
        String text = null;
        int breakLine = 1;
        int i = 0;

        do {
            text = "" + rd.nextInt(10) + rd.nextInt(10) + rd.nextInt(10);

            if (contains(data, text, i)) {
                continue;
            }
            data[i++] = text; // data[i] = text, i++;

            sleep(1000);
            System.out.print(text + " ");
            if (breakLine % 13 == 0) {
                System.out.println();
            }
            breakLine++;
        } while (!login("admin", text));

        System.out.println("\n===== Login successfully! ======");
        System.out.println("USER : admin ");
        System.out.println("PASS : " + text);
    }


    private static void sleep(int millis){
        try {
            TimeUnit.MICROSECONDS.sleep(millis);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    private static boolean contains(String[] data, String text, int nonNullSize) {
        for (int i = 0; i < nonNullSize; i++) {
            if (data[i].equals(text)) {
                return true;
            }
        }
        return false;
    }

    private static boolean login(String ipUN, String ipPW) {
        return ipUN.equals(USERNAME) && ipPW.equals(PASSWORD); // equals so sanh 2 gia tri
    }
}

