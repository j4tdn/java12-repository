package factory_practice.fruit;

public class Main {
	public static void main(String[] args) {
		FruitFactory fruitFactory = new FruitFactoryImpl();
		Fruit fruit = fruitFactory.get(FruitType.PLUM);
		System.out.println(fruit.getName());
	}
}
