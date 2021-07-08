package mutable;

// Thread -> Task
public class Ex02 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main thread start");
		
		Thread t0 = new Thread(new Task());
		t0.start();
		
		// calculation takes 2 milliseconds
		Thread.sleep(2);
		
		System.out.println("main thread end");
	}
	
	public static class Task implements Runnable {
		@Override
		public void run() {
			System.out.println("current thread: " + Thread.currentThread().getName());
			System.out.println("Executing thread!!!");
		}
	}
}
