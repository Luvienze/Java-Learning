package polymorphism.shape;

public class Canvas extends Shape {
	public void drawShape(Shape s) {
		if(s instanceof Shape) {
			s.printInfo();
			s.draw();
		}
		else
		{
			System.out.println("s isn't an instance of Shape");
		}
	}
	public void eraseShape(Shape s) {
		if(s instanceof Shape) {
			s.printInfo();
			s.erase();
		}
		else
		{
			System.out.println("s isn't an istance of Shape");
		}
		
	}

}
