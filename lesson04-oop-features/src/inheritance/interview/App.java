package inheritance.interview;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

public class App {
	public static void main(String[] args) {
		JButton button = new JButton();
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseEntered(e);
			}
		});
		
		MouseA ma = new MouseA();
		
		// abstract class
		MouseB mb = new MouseB() {
			
			@Override
			public void mouseDrag() {
				System.out.println("MouseB >> dragging ...");
			}
			
			@Override
			public void mouseDrop() {
				System.out.println("MouseB >> dropping ...");
			}
		};
		
		mb.mouseDrag();
		
		inheritance.interview.MouseEvent me = new inheritance.interview.MouseEvent() {
			
			@Override
			public void mousePress() {
			}
			
			@Override
			public void mouseEnter() {
			}
			
			@Override
			public void mouseDrop() {
			}
			
			@Override
			public void mouseDrag() {
			}
			
			@Override
			public void mouseClick() {
				System.out.println("App >> clicking");
			}
		};
		
		me.mouseClick();
	}
	
}
