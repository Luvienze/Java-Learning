package circle;
import java.util.Scanner;

public class CircleTest {
	public static void main(String[] args)
	{
		Scanner getUser = new Scanner(System.in);
		//we can use this block without constructor method.
		/*Circle circle = new Circle();
		
		System.out.println("Enter the radius of the circle : " + "(PI is " + Math.PI + ")");
		double radius = getUser.nextDouble();
		circle.areaOfCircle(radius);
		circle.periemeterOfCircle(radius);*/
		
		Circle circle1 = new Circle();
		circle1.areaOfCircle(circle1.radius);
		circle1.periemeterOfCircle(circle1.radius);
		
		Circle circle2 = new Circle(getUser.nextDouble());
		circle2.areaOfCircle(circle2.radius);
		circle2.periemeterOfCircle(circle2.radius);
		
		
	}
}

