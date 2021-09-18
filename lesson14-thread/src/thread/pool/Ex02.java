package thread.pool;


import utils.ThreadUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

import static utils.ThreadUtils.*;

/**
 * Thread Pool
 * + pool size: numbers of thread
 * + blocking queue : numbers of tasks
 */
public class Ex02 {
    private static Random rd = new Random();
    private static long start = 0;
    private static int capacity = 20;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("Thread start");

        // blocking queue
        List<Task> tasks = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            tasks.add(new Task());
        }

        // Thread pool - idea processors
        ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        for (Task task : tasks) {
            Future<Integer> future = service.submit(task);
            System.out.println("random : "+future.get());
        }
        // shutdown thread pools
        service.shutdown();

        System.out.println("Thread end");

    }

    private static class Task implements Callable<Integer> {
        @Override
        public Integer call() throws Exception {
            // task random numbers from 10 to 20

            int rand = 10 + rd.nextInt(11);
            ThreadUtils.startThread(rand);
            doTask(2,TimeUnit.SECONDS);
            return 10 + rd.nextInt(11);
        }
    }
}
