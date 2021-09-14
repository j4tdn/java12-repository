package thread.core;

import java.util.concurrent.TimeUnit;

import static utils.ThreadUtils .*;

public class Ex01 {
    public static void main(String[] args) {
        // Thread t1 = new Thread( runnable)
        // t1.start

        System.out.println("main start ");


        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                // preprocessor data took 2s
                doTask(2, TimeUnit.SECONDS);

                printCurrentThreadName();
                System.out.println("running a task ....");
            }
        },"thread 1");
        t1.start(); // automatically call t1.run >> runnable
            //t1.run();


        // Current Thread
        printCurrentThreadName();

        System.out.println("main end ");

    }
}
