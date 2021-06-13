package inheritance.java8;

public interface Father {
    void adn();

    default void playSports(){
        System.out.println("Fooball ");
    }

    static void drinkAlcohol(int qty){
        System.out.println("Father drink max "+ qty+ " as max ! ");
    }
}
