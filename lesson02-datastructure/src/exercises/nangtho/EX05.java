package exercises.nangtho;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class EX05{
    private static final String SYSTEM_USERNAME = "admin";
    private static final String SYSTEM_PASSWORD = "254";
    private static final Random rd = new Random();

    public static void main(String[] args) {
        String username = "admin";
        String password = "null";
        int noe = 1;
        int i = 0;
        String[] wp = new String[1000];



        do {
            password = "" +rd.nextInt(10) + rd.nextInt(10) + rd.nextInt(10);


            if(contains(wp ,password,i)){
                continue;
            }
            wp[i++] = password;
            sleep(1000);
            System.out.print(password+" ");
            if(noe++ % 13 == 0){
                System.out.println();
            }
            noe++;


        }while(!loginIn(username,password));
        System.out.println("\n =========== login Succesfull ! ===========");
        System.out.println("Username "+username);
        System.out.println("Noe "+noe);
    }

    private static boolean contains(String[] wp,String password, int nonNullSizes){
        for (int i = 0; i < nonNullSizes; i++) {
            if(password.equals(wp[i])){
                return true;
            }

        }
        return false;
    }

    private static boolean loginIn(String username,String password){
        return username.equals(SYSTEM_USERNAME) && password.equals(SYSTEM_PASSWORD);
    }
    private static void sleep(int timeOut){
        try {
            TimeUnit.MICROSECONDS.sleep(timeOut);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
