package thread.pool;

import utils.ThreadUtils;

import java.util.Random;
import java.util.concurrent.*;

import static utils.ThreadUtils.doTask;

public class Ex03 {
    private static Random rd = new Random();

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // Thread , Runnable
        // Thread Pool
        // + Blocking Queue
        // + Threads

        // Thread Pool
        // + >> execute(Runnable) : void
        // +>> submit(Callable<T>):Future<T>


        ExecutorService service = Executors.newSingleThreadExecutor();

        FutureTask<Integer> futureTask = new FutureTask<>(new Task());

        // submit : task >>set return value to FutureTask
        service.submit(futureTask);


        // return
        System.out.println(futureTask.get());
        service.shutdown();
    }
    private static class Task implements Callable<Integer> {
        @Override
        public Integer call() throws Exception {
            // task random numbers from 10 to 20

            int rand = 10 + rd.nextInt(11);
            ThreadUtils.startThread(rand);
            doTask(2, TimeUnit.SECONDS);
            return rand;
        }
    }
}
