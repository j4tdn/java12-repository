package inheritance.java08;

public interface KeyEvent {
  void keyPress();
  void keyEnter();
  void keyClick();
  
  //Java08: Defaully, Statix methods with body
  default void keyExit() {
	  System.out.println("Key Enit");
  }
  static void keyRelease() {
	  System.out.println("keyReleased");
  }
}
