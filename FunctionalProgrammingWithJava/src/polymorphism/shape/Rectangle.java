package polymorphism.shape;

public class Rectangle extends Shape{
	protected double shortEdge;
	protected double longEdge;
	public Rectangle() {
		shortEdge = 5;
		longEdge = 7;
	}
	public Rectangle(double shortEdge, double longEdge) {
		this.shortEdge = shortEdge;
		this.longEdge = longEdge;

	}
	@Override
	public void draw() {
			for(int i=0; i<shortEdge; i++) {
				for(int j =0; j < longEdge; j++) {
					System.out.print("*");
					if( j == longEdge -1 ) {
						System.out.println();
					}
				}
			}
		}
	@Override
	public void erase() {
		System.out.println("Rectangle is erased!");
	}
	@Override
	public double calculateArea() {
		System.out.println("Area of rectangle: ");
		return shortEdge*longEdge;
	}
	@Override
	public double calculateCircumference() {
		System.out.println("Area of circumference: ");
		return shortEdge+shortEdge+longEdge+longEdge;
	}
	@Override
	public void printInfo() {
		System.out.println("Rectangle is created!");
		System.out.println("Short Eedge: " + shortEdge);
		System.out.println("Long Edge: " + longEdge);
	}
}
