package pointOnTwoDimensionalLevelsWithEncapsulation;

import java.lang.Math;
public class Point {
	private double x;
	private double y;
	
	public void setPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public double printPointX() {
		return this.x;
	}
	public double printPointY() {
		return this.y;
	}
	private double calculateRangeBetweenPoints(double x1, double y1, double x2, double y2) {
		double calculate = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		return calculate;
	}
	private double calculateRangeToOrigin(double x, double y) {
		return this.calculateRangeBetweenPoints(0, 0, x, y);
	}

	public void printResulRangeBetweenPoints(double x1, double y1, double x2, double y2) {
		System.out.println(this.calculateRangeBetweenPoints(x1, y1, x2, y2));
	}
	public void printResultRangeToOrigin() {
		System.out.println(this.calculateRangeToOrigin(x, y));
	}
	
	private void clone(double x, double y) {
		double cloneX, cloneY;
		cloneX = this.x;
		cloneY = this.y;
		this.setPoint(cloneX, cloneY);
		System.out.println("Cloned points: " + cloneX + " " + cloneY);
	}
	public void printClone() {
		this.clone(x, y);
	}
	
	private void move(double moveX, double moveY) {
		this.x += moveX;
		this.y += moveY;
		System.out.println("Moved points : " + x + " " + y);
	}
	public void printMove(double moveX, double moveY) {
		this.move(moveX, moveY);
	}
}