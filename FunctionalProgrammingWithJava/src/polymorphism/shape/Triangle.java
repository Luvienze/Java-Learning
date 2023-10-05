package polymorphism.shape;

public class Triangle extends Shape{
	protected double edge1;
	protected double edge2;
	protected double hypo;
	
	public Triangle(double edge1, double edge2, double hypo) {
		this.edge1 = edge1;
		this.edge2 = edge2;
		this.hypo = hypo;
	}
	@Override
	public void draw() {
		if(Math.sqrt(edge1*edge1 + edge2*edge2) == Math.sqrt(hypo*hypo)) {
			for(double i = 1; i <= edge1; i++) {
				for(double j = 1; j <= i; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			
		}
		else {
			for(double i = 1; i <= edge1; i++) {
				for(double j = 1; j <= i; j++) {
					System.out.println("* ");
				}
				System.out.println();
			}
		}

	}
	@Override
	public void erase() {
		System.out.println("Triangle is erased!");
	}
	@Override
	public double calculateArea() {
		return (edge1*edge2)/2;
	}
	@Override
	public double calculateCircumference() {
		return edge1 + edge2 + hypo;	
	}
	@Override
	public void printInfo() {
		System.out.println("Triangle is created!");
		System.out.println("Edges are: " + edge1 + " " + edge2 + " " + hypo);
	}

}
