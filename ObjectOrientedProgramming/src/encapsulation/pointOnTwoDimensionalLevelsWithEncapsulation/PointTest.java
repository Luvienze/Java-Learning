package pointOnTwoDimensionalLevelsWithEncapsulation;

import java.util.Scanner;
public class PointTest {

	public static void main(String[] args) {
		Scanner getNumber = new Scanner(System.in);
		Point point1 = new Point();
		Point point2 = new Point();
		
		System.out.println("Enter the first point's X and Y: ");
		point1.setPoint(getNumber.nextDouble(), getNumber.nextDouble());
		
		System.out.println("Enter the second point's X and Y:");
		point2.setPoint(getNumber.nextDouble(), getNumber.nextDouble());
		
		System.out.println("Range to origin of first point:");
		point1.printResultRangeToOrigin();

		System.out.println("Range between points:");
		point1.printResulRangeBetweenPoints(point1.printPointX(),point1.printPointY(), point2.printPointX(),point2.printPointY());
	}

}

