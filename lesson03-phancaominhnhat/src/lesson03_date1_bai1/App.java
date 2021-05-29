package lesson03_date1_bai1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		while(true) {
			Scanner scanner = new Scanner(System.in);
			PointInCoordinate pointCenterCircle = new PointInCoordinate();
			PointInCoordinate pointInCoordinate = new PointInCoordinate();
			
			// set point in coordinate for O(x,y) and radius
			System.out.println("\n========================\n");
			System.out.print("Nhap toa do X cua tam O: ");
			pointCenterCircle.setxAxis(scanner.nextInt());
			System.out.print("Nhap toa do Y cua tam O: ");
			pointCenterCircle.setyAxis(scanner.nextInt());
			System.out.print("Nhap ban kinh cua hinh tron: ");
			pointCenterCircle.setRadius(scanner.nextInt());
			
			// set coordinate for A(x,y)
			System.out.print("Nhap toa do X cua tam A: ");
			pointInCoordinate.setxAxis(scanner.nextInt());
			System.out.print("Nhap toa do Y cua tam A: ");
			pointInCoordinate.setyAxis(scanner.nextInt());
			
			if(PointInCoordinateUtils.isBelongToCircle(pointCenterCircle, pointInCoordinate)) {
				System.out.println("=> Point A belong to circle");
			} else {
				System.out.println("=> Point A is not belong to circle");
			}
		}
	}
}
