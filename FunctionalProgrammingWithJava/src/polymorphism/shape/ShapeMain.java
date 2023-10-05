package polymorphism.shape;

public class ShapeMain {

	public static void main(String[] args) {
			ShapeFactory factory = new ShapeFactory();
			Canvas canvas = new Canvas();
			Shape s = factory.createShape();
			canvas.drawShape(s);
			canvas.eraseShape(s);
		

	}

}
