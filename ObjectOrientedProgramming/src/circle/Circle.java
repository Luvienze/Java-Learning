package circle;

public class Circle {
	public double radius;
	
	Circle() {
		this(10);
	}
	Circle(double newRadius){
		radius = newRadius;
	}
	public double periemeterOfCircle(double radius)
	{
			double perimeterOfCircle = 2*Math.PI*radius;
			System.out.println("Perimeter of the circle is " + perimeterOfCircle);
			return perimeterOfCircle;
	}
	public double areaOfCircle(double radius)
	{
		double areaOfCircle = Math.PI*radius*radius;
		System.out.println("Area of the circle is " + areaOfCircle);
		return areaOfCircle;
	}

}
