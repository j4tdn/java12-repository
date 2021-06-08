package inheritance.java08;

public interface Father {
	void adn();
	default void playSport() {
		System.out.println("Badmiton");
	}
	static void drinkAlcohol(int qty) {
		System.out.println(qty +"glass are not problem with mom!" );
	}
}
