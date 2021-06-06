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
				super.mouseEntered(e);
			}
		});
		
		// class
		MouseA ma = new MouseA();
		ma.mouseClick();
		
		// abstract class
		// anonymous class
		MouseB mb = new MouseB() {
			
			@Override
			public void mouseDrop() {
				System.out.println("MouseB >>> droping ....");
			}
			
			@Override
			public void mouseDrag() {
				System.out.println("MouseB >>> draging 123 ....");
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
				System.out.println("App >> clicking ....");
			}
		};
		
		me.mouseClick();
	}
}
