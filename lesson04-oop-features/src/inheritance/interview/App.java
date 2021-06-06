package inheritance.interview;

public class App {
	public static void main(String[] args) {
		MouseA ma=new MouseA();
		ma.mouseClick();
		MouseB mb=new MouseB() {
			
			@Override
			public void mouseDrop() {
				
				
			}
			
			@Override
			public void mouseDrag() {
				// TODO Auto-generated method stub
				
			}
		};
		mb.mouseDrag();
		MouseEvent me=new MouseEvent() {
			
			@Override
			public void mousePress() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEnter() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseDrop() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseDrag() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClick() {
				// TODO Auto-generated method stub
				
			}
		};
 	}
}
