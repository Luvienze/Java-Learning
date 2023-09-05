package bicycle;

public class Pedal {
	private String name;
	private String color;
	
	public Pedal(String name, String color) {
		this.name = name;
		this.color = color;
		System.out.println(color + " " + name + " is created.");
	}
	public void pedalling() {
		System.out.println("\n" + name + " pedalling.");
	}
	public void pedalStopped() {
		System.out.println("\n"+ name + " is stopped." );
	}

}
