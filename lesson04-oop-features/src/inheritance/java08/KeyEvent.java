package inheritance.java08;

public interface KeyEvent {
	void keyPress();
	void keyEnter();
	void keyClick();
	
	//Java08 or later
	default void keyExit() {
		System.out.println("keyExit");
	}
	static void keyReleased() {
		System.out.println("keyReleased");

	}
}
