package inheritance.java08;

public interface KeyEvent {
	//abstract method
	void keyPress();
	void keyEnter();
	void keyClick();
	
	//Java version 8: Default, static method with body
	default void keyExit() {
		System.out.println("KeyExit");
	};
	static void keyReleased() {
		System.out.println("KeyReleased");
	};
}
