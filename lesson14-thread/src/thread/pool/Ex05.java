package thread.pool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class Ex05 {
	
	private static ExecutorService service;
	private static int poolSize = 4;
	static {
		service = Executors.newFixedThreadPool(poolSize);
	}
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		FutureTask<List<Integer>> digitTask = new FutureTask<>(() -> loadDigits());
		FutureTask<List<String>> textTask = new FutureTask<>(() -> loadTexts());
		
		//submit tasks  : importance
		submitTask(Arrays.asList(digitTask,textTask));

		//get return value
		List<String> texts = textTask.get();
		List<Integer> digis = digitTask.get();
		
		System.out.println(digis);
		System.out.println(texts);
		
		service.shutdown();
	}
	
	private static void submitTask(List<FutureTask<?>> tasks) {
		tasks.forEach(service::submit);
	}

	//query from db
	private static List<Integer> loadDigits(){
		return Arrays.asList(1,2,3,4,5);
	}
	private static List<String> loadTexts(){
		return Arrays.asList("a","s","c","h","t");
	}
}
