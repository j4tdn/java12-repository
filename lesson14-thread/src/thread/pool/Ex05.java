package thread.pool;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class Ex05 {
    private static ExecutorService service;
    private static int poolSize = 4;
    static {

        service = Executors.newFixedThreadPool(poolSize);
    }
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        FutureTask<List<Integer>> digitTask = new FutureTask<>(() -> loadDigits());

        FutureTask<List<String>> textTask = new  FutureTask<>(() -> loadTexts());


        // submit tasks

        submitTasks(Arrays.asList(digitTask,textTask));
        List<Integer> digits = digitTask.get();
        List<String> texts = textTask.get();

        System.out.println(digits);
        System.out.println(texts);

        service.shutdown();

        }

        private static void submitTasks(List<FutureTask<?>>tasks) {
            tasks.forEach(service::submit);
        }

    private static List<String> loadTexts() {

        return Arrays.asList("a","s","d","f","g");
    }

    private static List<Integer> loadDigits() {
        // query form database
        return Arrays.asList(1,2,3,4,5);
    }
}
