package utils;

import java.util.concurrent.TimeUnit;

public class ThreadUtils {
    private ThreadUtils(){
    }

    public static void printCurrentThreadName(){
        // Current Thread
        System.out.println(" >> thread # "+Thread.currentThread().getName());
    }

    public static String getThreadName(){
        // Current Thread
        return Thread.currentThread().getName();
    }


    public static void startThread(){
        // Current Thread
        System.out.println(" >> thread # "+Thread.currentThread().getName()+" is running");
    }

    public static void startThread(long time ) {
        // Current Thread
        System.out.println(" >> thread # " + Thread.currentThread().getName() + " is running.... " +time);
    }

    public static void endThread(long start){
        System.out.println(Thread.currentThread().getName()+" took "+(System.currentTimeMillis() - start));
    }

    // virtual task with a certain time
    public static void doTask(long time , TimeUnit unit){
        try {
            unit.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // block current thread
    public static void join(Thread thread){
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
