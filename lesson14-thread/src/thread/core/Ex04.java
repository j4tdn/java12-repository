package thread.core;


import java.util.concurrent.TimeUnit;

public class Ex04 {
    //      task : Took 3 seconds
    //      Demo performance case with 3 calculation
    //      Run parallel took ~3 seconds
    //      Run single thread : Took 9 seconds
    //      Run parallel with 3 thread : Took 3 seconds

    private  static long start = 0;
    public static void main(String[] args) {
        Task  task1 = new Task(3, TimeUnit.SECONDS );
        Task  task2 = new Task(4, TimeUnit.SECONDS);
        Task  task3 = new Task(3, TimeUnit.SECONDS);

         start = System.currentTimeMillis();

        Thread t1 = new Thread(task1, "thread 1");
        t1.start();


        Thread t2 = new Thread(task1, "thread 2");
        t2.start();


        Thread t3 = new Thread(task1, "thread 3");
        t3.start();

    }


    private static  class  Task implements Runnable{

        private long time ;
        private TimeUnit unit ;
        public Task(long time , TimeUnit unit){
            this.time = time ;
            this.unit = unit;
        }
        @Override
        public synchronized void run() {
            utils.ThreadUtils.startThread();
            utils.ThreadUtils.doTask(3, TimeUnit.SECONDS);
            demoSync();
            System.out.println(utils.ThreadUtils.getThreadName()+"Tooks "+(System.currentTimeMillis() - start) +"ms");

        }

        private synchronized void demoSync() {
            System.out.println(utils.ThreadUtils.getThreadName()+" accessed synchronized method ");
            System.out.println("end synchronized ");
        }
    }

}
