package inheritance.interview;

public class App {
	public static void main(String[] args) {
		MouseA ma=new MouseA();
		MouseB mb=new MouseB() {
			
			@Override
			public void mouseDrop() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseDrag() {
				// TODO Auto-generated method stub
				
			}
		};
	}
}
