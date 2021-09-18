package thread.pool;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class Ex05 {


    private static final ExecutorService service;

    private static final int poolSize = 4;

    static {
        service = Executors.newFixedThreadPool(poolSize);
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<List<Integer>> digitTask = new FutureTask<>(Ex05::loadDigits);

        FutureTask<List<String>> textTask = new FutureTask<>(Ex05::loadTexts);

        // submits tasks
        submitTasks(Arrays.asList(digitTask, textTask));

        // get return value
        List<Integer> digits = digitTask.get();
        List<String> texts = textTask.get();

        System.out.println(digits);
        System.out.println(texts);
        service.shutdown();
    }

    private static void submitTasks(List<FutureTask<?>> tasks) {
        tasks.forEach(service::submit);
    }

    private static List<Integer> loadDigits() {
        // query from database
        return Arrays.asList(1, 2, 3, 4, 5);
    }

    private static List<String> loadTexts() {
        return Arrays.asList("a", "s", "d", "f", "d");
    }
}
