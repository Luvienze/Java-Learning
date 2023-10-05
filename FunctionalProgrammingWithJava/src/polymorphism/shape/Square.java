package polymorphism.shape;

public class Square extends Shape {
	protected double edgeLength;
	public Square(){
		edgeLength = 5;
	}
	public Square(double edgeLength) {
		this.edgeLength = edgeLength;
	}
	public void draw() {
		for(int i=0; i<edgeLength; i++) {
			System.out.println();
			for(int j =0; j < edgeLength; j++) {
				System.out.print("*");
			}
		}
	}
	@Override
	public void erase() {
		System.out.println("Square is erased!");
	}
	@Override
	public double calculateArea() {
		return edgeLength*edgeLength;
	}
	@Override
	public double calculateCircumference() {
		return edgeLength*4;
	}
	@Override
	public void printInfo() {
		System.out.println("\nSquare is created!");
		System.out.println("Edge length is: " + edgeLength);
	}

}
