package thread.pool;

import java.util.Random;
import java.util.concurrent.*;

import static utils.ThreadUtils.doTask;
import static utils.ThreadUtils.startThread;

public class Ex03 {
    private static Random rd = new Random();

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // Thread, Runnable

        // Thread Pool
        // + Blocking Queue
        // + Threads

        // Thread Pool
        // + >> execute(Runnable): void
        // + >> submit(Callable<T>): Future<T>

        // FutureTask implements RunnableFuture<V> extends Runnable, Future<V>
        // + Callable<T> >> task
        // + Future<T>   >> future

        ExecutorService service = Executors.newSingleThreadExecutor();

        FutureTask<Integer> futureTask = new FutureTask<>(new Task());

        // submit task >> set return value to FutureTask
        service.submit(futureTask);

        // return
        System.out.println(futureTask.get());
        service.shutdown();
    }

    private static class Task implements Callable<Integer> {

        @Override
        public Integer call() throws Exception {
            // task random number from 10 to 20
            int rand = 10 + rd.nextInt(11);

            startThread(rand);
            doTask(2, TimeUnit.SECONDS);
            return rand;
        }
    }
}
