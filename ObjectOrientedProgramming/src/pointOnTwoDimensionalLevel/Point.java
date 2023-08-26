package pointOnTwoDimensionalLevel;
import java.lang.Math;

public class Point {
	double x, y;
	
	/*void setPoint (double newX, double newY) {
		x = newX;
		y = newY;
	}
	void getCalculateRangeToOrigin (double x, double y) {
		double calculate = Math.sqrt((x*x) + (y*y));
		System.out.println("Range to origin of the points is " + calculate);
	}
	void getCalcualteRangeBetweenThePoints (double x1,double y1, double x2, double y2) {
		double calculate = Math.sqrt((x2 -x1)*(x2-x1) + (y2-y1)*(y2-y1));
		System.out.println("Range between the points is " + calculate);
	}
	void getClone() {
		double cloneX, cloneY;
		cloneX = x;
		cloneY = y;
		setPoint(cloneX, cloneY);
		System.out.println("Points of clone: " + cloneX + " " + cloneY );
	}
	void move(double moveX, double moveY) {
		x += moveX;
		y += moveY;
		System.out.println("New points: " + x + " " + y );
	}*/
	void setPoint (double x, double y) {
		this.x = x;
		this.y = y;
	}
	void getCalculateRangeToOrigin (double x, double y) {
		//double calculate = Math.sqrt((x*x) + (y*y));
		this.getCalcualteRangeBetweenThePoints(x, y, 0, 0);
		//System.out.println("Range to origin of the points is " + calculate);
	}
	void getCalcualteRangeBetweenThePoints (double x1,double y1, double x2, double y2) {
		double calculate = Math.sqrt((x2 -x1)*(x2-x1) + (y2-y1)*(y2-y1));
		System.out.println("Range between the points is " + calculate);
	}
	void getClone() {
		double cloneX, cloneY;
		cloneX = this.x;
		cloneY = this.y;
		setPoint(cloneX, cloneY);
		System.out.println("Points of clone: " + cloneX + " " + cloneY );
	}
	void move(double moveX, double moveY) {
		//we can change the moveX to x but naming like this better for me
		this.x += moveX;
		this.y += moveY;
		System.out.println("New points: " + x + " " + y );
	}
}
