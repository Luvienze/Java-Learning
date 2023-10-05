package polymorphism.shape;

public class Circle extends Shape {
	protected double radius;
	public Circle() {
		radius = 5;
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	@Override
	public void draw() {
		for(double i = -radius; i<= radius; i++) {
			for(double j = -radius; j<= radius; j++) {
				if(i*i + j*j <= radius*radius) {
					System.out.print("* ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	@Override
	public void erase() {
		System.out.println("Circle is erased!");
	}
	@Override
	public double calculateArea() {
		return Math.PI*radius*radius;
	}
	@Override
	public double calculateCircumference() {
		return 2*Math.PI*radius;
	}
	@Override
	public void printInfo() {
		System.out.println("Circle is created!");
		System.out.println("Radius is :" + radius);
	}
	
}
