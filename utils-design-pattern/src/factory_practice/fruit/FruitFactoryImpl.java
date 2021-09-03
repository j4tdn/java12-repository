package factory_practice.fruit;

public class FruitFactoryImpl implements FruitFactory{
	@Override
	public Fruit get(FruitType fruitType) {
		switch (fruitType) {
			case GUAVA:
				return new Guava();
			case PLUM:
				return new Plum();
			default:
				return new Mango();
		}
	}
}
