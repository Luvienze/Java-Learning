package pointOnTwoDimensionalLevel;
import java.util.Scanner;

public class PointTest {

	public static void main(String[] args) {
		Scanner getNumber = new Scanner (System.in);
		Point point1 = new Point();
		Point point2 = new Point();
		System.out.println("Enter the first point's X and Y: ");
		point1.setPoint(getNumber.nextInt(), getNumber.nextInt());
		System.out.println("Enter the second point's X and Y: ");
		point2.setPoint(getNumber.nextInt(),getNumber.nextInt() );
		point1.getCalculateRangeToOrigin(point1.x ,point1.y );
		point1.getCalcualteRangeBetweenThePoints(point1.x, point1.y, point2.x, point2.y);
		point1.getClone();
		point1.move(getNumber.nextInt(), getNumber.nextInt());
		

	}

}
