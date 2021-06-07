package inheritance.functionalinterface;

@FunctionalInterface
//functional interface là interface chỉ có duy nhất 1 pthuc trừu tượng

public interface Condition {
	//abstract method
	boolean strategy(int number);
	
}
