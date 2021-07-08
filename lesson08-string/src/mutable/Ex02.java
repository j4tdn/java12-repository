package mutable;

//Thread -> Task
public class Ex02 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main thread start");
		
		Thread to = new Thread(new Task(),"thread0");
		to.start();
		
//		Task task = new Task();
//		task.run();
		//2 dòng trên k tạo ra bất kì 1 thread nào cả;
		
		//Calculation takes 2 seconds
		Thread.sleep(2);
		System.out.println("main thread end");
		
	}
	public static class Task implements Runnable{
			@Override
			public void run() {
				System.out.println("current thread: " + Thread.currentThread().getName());
				// TODO Auto-generated method stub
				 System.out.println("Excuting thread!!!");
				}
	}
}
