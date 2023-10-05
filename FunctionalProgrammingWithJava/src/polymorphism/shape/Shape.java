package polymorphism.shape;

public class Shape {
	protected double area;
	protected double circumference;
	Shape(){
		
	}
	public void draw() {
		System.out.println("There is no shape to be drawed!");
	}
	public void erase() {
		System.out.println("There is no shape to be erased!");
	}
	public double calculateArea() {
		return 0;
	}
	public double calculateCircumference() {
		return 0;
	}
	public void printInfo() {
		
	}
}
