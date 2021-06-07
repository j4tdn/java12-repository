package inheritance.java08;

public interface Father {
   void adn();
   
   default void playSports() {
	   System.out.println("FootBall");
   }
   static void drinkAlcohol(int qty) {
	   System.out.println("Father drink "+ qty +"as max !");
   }
}
