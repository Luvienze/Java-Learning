package polymorphism.shape;

public class ShapeFactory extends Shape {
	
	public Shape createShape() {
		Shape s = null;
		int i = (int)(4*Math.random());
		switch(i) {
		case 0:
			s = new Rectangle(5, 5);
			break;
		case 1: 
			s = new Circle(7.8);
			break;
		case 2:
			s = new Triangle(3, 4, 5);
			break;
		case 3:
			s = new Square(12.45);
			break;
		}
		return s;
	}
}	
