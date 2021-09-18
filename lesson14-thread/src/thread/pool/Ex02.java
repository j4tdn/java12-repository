package thread.pool;

import static utils.ThreadUtils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * 
 * Thread Pool + pool size: number of threads + blocking queue: number of task
 *
 */

public class Ex02 {
	private static int capacity = 20;
	private static Random rd = new Random();

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		System.out.println("thread start...");

		// blocking queue
		List<Task> tasks = new ArrayList<>(capacity);
		for (int i = 0; i < capacity; i++) {
			tasks.add(new Task());
		}
		// thread pool
		ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		for (Task task : tasks) {
			Future<Integer> futures = service.submit(task);
			System.out.println("random:" + futures.get());
		}

		// shutdown threads pools
		service.shutdown();

		System.out.println("thread end");
	}

	private static class Task implements Callable<Integer> {
		@Override
		public Integer call() {
			int rand = 10 + rd.nextInt(20);
			startThread(rand);
			doTask(1, TimeUnit.SECONDS);
			return rand;
		}
	}
}
