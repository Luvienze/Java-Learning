package bicycle;

public class Kickstand {
	private int height;
	private String color;

	public Kickstand(int height, String color) {
		this.height = height;
		this.color = color;
		System.out.println(height + " cm and " + color + " kickstand is created.");
	}
	public void open() {
		System.out.println("\nKickstand is open.");
	}
	public void close() {
		System.out.println("\nKickstand is closed.");
	}

	

}
