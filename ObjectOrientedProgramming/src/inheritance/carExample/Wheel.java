package carExample;

public class Wheel {
	private String name;
	public Wheel (String name) {
		this.name = name;
		System.out.println("A wheek is created: "+ name);
	}
	public void rotate() {
		System.out.println("Wheel is rotating.");
	}
}
