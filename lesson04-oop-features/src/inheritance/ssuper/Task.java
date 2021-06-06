package inheritance.ssuper;

public class Task implements Runnable, Callable{
	//Interface : Runnable
	@Override
	public void run() {
		System.out.println("Run");
	}
	 @Override
	public void stop() {
		
	}
	
	//Interface: Callable
	@Override
	public void call() {
		
	}
}
