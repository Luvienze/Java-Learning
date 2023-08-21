package circle;
import java.util.Scanner;

public class CircleTest {
	public static void main(String[] args)
	{
		Scanner getUser = new Scanner(System.in);
		Circle circle = new Circle();
		
		System.out.println("Enter the radius of the circle : " + "(PI is " + Math.PI + ")");
		double radius = getUser.nextDouble();
		circle.areaOfCircle(radius);
		circle.periemeterOfCircle(radius);
	}
}
