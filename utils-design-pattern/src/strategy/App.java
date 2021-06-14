package strategy;

public class App {
	//những hàm giống nhau nhưng khác 1 biểu thức điều kiện -> ý tưởng là truyền biểu thức đó như tham số vào hàm
	//Java ko cho truyền hàm vào hàm -> Strategy pattern
	
	public static void main(String[] args) {
		
		//How use strategy pattern for pass function into function through functional interface
		//c1: create object of functional interface
		// anonymous class
		Operator add = new Operator() {
			@Override
			public int strategy(int a, int b) {
				return a + b;
			}
		};
		Operator sub = new Operator() {
			@Override
			public int strategy(int a, int b) {
				return a - b;
			}
		};
		
		//c2: create external class implement functional interface 
		DivOperator div = new DivOperator();
		//c3: use lambda expression
		Operator mul = (a, b) -> a * b;
		
		System.out.println(operator(4,5 , add)); //9
		System.out.println(operator(15,5, div)); // 3
		System.out.println(operator(9,4 , sub)); // 5
		System.out.println(operator(3,5 , mul)); // 15
		
	}
	
	private static int operator(int a, int b, Operator operator) {
		return operator.strategy(a, b);
	}
	
	//addition method
	//return a + b;
	//subtraction
	//return a - b;
}
