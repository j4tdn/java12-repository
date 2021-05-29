package ex01;

import java.util.Scanner;

public class Circle {
	private int R;
	private Point centralPoint=null;
	private Circle(int R, int x, int y) {
		this.R = R;
		this.centralPoint = new Point(x,y);
	}
	private Position posOfPoint(Circle cir,Point point ) {
		int horizonCentralPoint=cir.getCentralPoint().getX();
		int verCentralPoint=cir.getCentralPoint().getY();
		
		double distance=Math.sqrt(Math.pow((point.getX()-horizonCentralPoint),2 )+Math.pow((point.getY()-verCentralPoint),2 ));
		if(distance==R) return Position.ONSIDE;
		if(distance>R) return Position.OUTSIDE;
		return Position.INSIDE;
	}
	public int getR() {
		return R;
	}
	
	public Point getCentralPoint() {
		return centralPoint;
	}
	public void setCentralPoint(Point centralPoint) {
		this.centralPoint = centralPoint;
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("- Tâm đường tròn");
		System.out.println("Nhập hoành độ x: ");
		int xC = sc.nextInt(); 
		System.out.println("Nhập tung độ y: ");
		int yC = sc.nextInt();
		System.out.println("Nhập bán kính: ");
		int r = sc.nextInt();
		
		Circle c1=new Circle(r,xC,yC);
		System.out.println("- Điểm bất kỳ");
		System.out.println("Nhập hoành độ x: ");
		int xP = sc.nextInt(); 
		System.out.println("Nhập tung độ y: ");
		int yP = sc.nextInt();
		Point point=new Point(xP, yP);
		
		System.out.println("KQ: Điểm này nằm "+c1.posOfPoint(c1,point));
	}
	
	
}
