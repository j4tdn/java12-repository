package lesson03_date1_bai1;

public class PointInCoordinate {
	private int xAxis;
	private int yAxis;
	private double radius;
	
	public PointInCoordinate() {
		// TODO Auto-generated constructor stub
	}

	public PointInCoordinate(int xAxis, int yAxis) {
		this.xAxis = xAxis;
		this.yAxis = yAxis;
	}

	public int getxAxis() {
		return xAxis;
	}

	public void setxAxis(int xAxis) {
		this.xAxis = xAxis;
	}

	public int getyAxis() {
		return yAxis;
	}

	public void setyAxis(int yAxis) {
		this.yAxis = yAxis;
	}
	

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "PointInCoordinate [xAxis=" + xAxis + ", yAxis=" + yAxis + "]";
	}
	
	
	
}
