package bicycle;

public class Bicycle {
	private String make;
	private String model;
	private String color;
	private int year;
	private int speed;
	
	private Pedal[] pedals = new Pedal[2];
	private Kickstand kickstand;
	private Steering steering;
	private Tire[] tires = new Tire[2];
	private Glass[] glasses = new Glass[2];
	
	public Bicycle(String make, String model, int year, String color) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;
		
		kickstand = new Kickstand(7, "Black");
		steering = new Steering();
		
		pedals[0] = new Pedal("Left-pedal", "Gray");
		pedals[1] = new Pedal("Right-pedal", "Gray");
		
		tires[0] = new Tire("Front-tire", 24);
		tires[1] = new Tire("Back-tire",24);
		
		glasses[0] = new Glass("Left-glass", 5);
		glasses[1] = new Glass("Right-glass", 5);
	}
	
	public void go(char rotation) {
		kickstand.open();
		
		steering.rotateSteering(rotation);
		pedals[0].pedalling();
		pedals[1].pedalling();
		
		tires[0].turning();
		tires[1].turning();
		
	}
	public void stop() {
		pedals[0].pedalStopped();
		pedals[1].pedalStopped();
		tires[0].stable();
		tires[1].stable();
		kickstand.open();
	}
	public void park() {
		pedals[0].pedalStopped();
		pedals[1].pedalStopped();
		tires[0].stable();
		tires[1].stable();
		kickstand.close();
		
	}
}
