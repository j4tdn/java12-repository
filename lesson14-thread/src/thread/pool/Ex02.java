package thread.pool;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import static utils.ThreadUtils.*;

public class Ex02 {

	private static long start = 0;
	private static int capacity = 20;
	private static Random rd = new Random();

	public static void main(String[] args) {

		start = System.currentTimeMillis();

		// blocking queue
		List<Task> tasks = new ArrayList<>(capacity);
		for (int i = 0; i < capacity; i++) {
			tasks.add(new Task());
		}

		// thread pool
		int processors=Runtime.getRuntime().availableProcessors();
		System.out.println("processor");
		
		ExecutorService service = Executors.newFixedThreadPool(4);
		for (Task task : tasks) {
			
		}
		service.shutdown();
		System.out.println("thread end");
	}

	private static class Task implements Runnable {
		

		@Override
		public void run() {
			starThread();
			doTask(3, TimeUnit.SECONDS);
			endThread(start);
		}
	}
}
