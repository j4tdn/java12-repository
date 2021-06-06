package inheritance.interview;

public class App {
	public static void main(String[] args) {
		MouseA ma = new MouseA();
		ma.mouseClick();
		
		//abstractclass
		//anoyousclass
		MouseB mb = new MouseB() {
			
			@Override
			public void mouse2() {
				System.out.println("Mouse B >> mouse2...");
				
			}
			
			@Override
			public void mouse1() {
				// TODO Auto-generated method stub
				System.out.println("Mouse B >> mouse21...");
			}
		};
		mb.mouse1();
		
		MouseEvent me = new MouseEvent() {
			
			@Override
			public void mousePress() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEnter() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClick() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouse2() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouse1() {
				// TODO Auto-generated method stub
				
			}
		};
	}
}
