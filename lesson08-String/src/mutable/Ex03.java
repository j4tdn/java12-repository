package mutable;

//Multithread
public class Ex03 {
	public static void main(String[] args) {
		MutableTask task = new MutableTask();

		Thread tA = new Thread(task, "ThRd-A");
		tA.start();
		
		Thread tB = new Thread(task, "ThRd-B");
		tB.start();
		
		//Thread A chạy xong mới kết thúc thread main
		try {
			tA.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("length: "+task.lenghth());
		
		
	}

	public static class MutableTask implements Runnable {

		// share data:multiple threads access this task

		private StringBuffer mutable;
		private int count = 5000;

		public MutableTask() {
			mutable = new StringBuffer();
		}

		@Override
		public void run() {
			System.out.println("current thread: " + Thread.currentThread().getName());
			for (int i = 1; i <= count; i++) {
				mutable.append("a");
			}
		}
		
		public int lenghth() {
			return mutable.length();
		}
	}
}
