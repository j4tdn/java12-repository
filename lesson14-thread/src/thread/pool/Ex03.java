package thread.pool;

import static utils.ThreadUtils.doTask;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

public class Ex03 {

	private static Random rd = new Random();
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//Thread, Runnable
		
		//Thread pool
		//+ Blocking Queue
		//+ Threads
		
		//Thread Pool
		//+ >> execute(Runnable):void
		//+ >> submit(Callable <T>): Future<T>
		
		//FutureTassk implements Runnable, Future<T>
		//+ Callable<T> >> Task
		//+ future<T> return value
		
		ExecutorService service = Executors.newSingleThreadExecutor();
		
		FutureTask<Integer> futureTask= new FutureTask<Integer>(new Task());
		
		//submit task >> set return value to FutureTask again
		service.submit(futureTask);
		
		//return
		System.out.println(futureTask.get());
		
		
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