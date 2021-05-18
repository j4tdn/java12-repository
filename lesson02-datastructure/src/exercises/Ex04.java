package exercises;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Ex04 {
    private static final String SYSTEM_USERNAME = "admin";
    private static final String SYSTEM_PASSWORD = "237";
    private static final Random rd = new Random();

    public static void main(String[] args) {
        String username = "admin";
        String passwork = null;
        int noe = 1;
        int i = 0;
        String[] wp = new String[1000]; //1000 null elements

        do {
            // random
            passwork = "" + rd.nextInt(10) + rd.nextInt(10) + rd.nextInt(10);

            //require : max 1000 unique elements
            //     print random elements

            if (contains(wp, passwork,i)) {
                continue;
            }
            // put unique elements into arrays
            wp[i++] = passwork;
            sleep(10);
            System.out.print(passwork + "  ");
            if (noe++ % 13 == 0) {
                System.out.println();
            }
            noe++;
        } while (!loginIn(username, passwork));

        System.out.println("\n========== login Succefull !!==============");
        System.out.println("Username " + username);
        System.out.println("PassWord" + passwork);
        System.out.println(" NOE " + noe);
    }

    private static boolean contains(String[] wp, String passwork,int nonNullSizes) {
        for (int i = 0; i < nonNullSizes; i++) {
            if (passwork.equals(wp[i])) {
                return true;
            }

        }return false;
    }

    private static boolean loginIn(String username, String passwork) {
        return username.equals(SYSTEM_USERNAME) && passwork.equals(SYSTEM_PASSWORD);
    }

    private static void sleep(int timeout) {
        try {
            TimeUnit.MICROSECONDS.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
