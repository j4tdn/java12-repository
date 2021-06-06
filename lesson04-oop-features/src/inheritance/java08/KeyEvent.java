package inheritance.java08;

public interface KeyEvent {
	//abstract method
	void keyPress();
	void keyEnter();
	void keyClick();
	
	
	//JAVA08: defauly, static method with body
	default void keyExit() {
		System.out.println("KeyExit");
	};
	
	static void keyRelease() {
		System.out.println("KeyReleased");
	};

	
}
