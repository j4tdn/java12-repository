package control;

public class Ex03 {
public static void main(String[] args) {
	//Enter 1 number => print English text according to number
	int number=4;
	//Non-break ignore validate condition of case condition below correct case
	switch (number) {
	case 1: {
		System.out.println("One");
		break;
	}
	case 2: {
		System.out.println("Two");
		break;
	}
	case 3:{
		System.out.println("Three");
		break;
	}
	default:
		System.out.println("Invalid number");
	}
}
}
