package interfaces.flyers.vehicle;

public class SeaPlane extends Airplane implements Floatable{
	public SeaPlane(String name) {
		super(name);
	}

	@Override
	public void floatNow() {
		System.out.println("SeaPlane is floating now");
	}

	@Override
	public void park() {
		System.out.println("SeaPlane has been parked.");
		
	}
	public void turnOn() {
		System.out.println("SeaPlane has turned on.");
	}
	public void stop() {
		System.out.println("SeaPlane has stopped.");
	}
	public void go() {
		System.out.println("SeaPlane is going.");
	}
	public void turnOff() {
		System.out.println("SeaPlane has been turned off.");
	}
	public void takeOff() {
		System.out.println("SeaPlane is taking off");
	}
	public void fly() {
		System.out.println("SeaPlane is flying.");
	}
	public void land() {
		System.out.println("SeaPlane has landed.");
	}
	public String toString() {
		return "SeaPlane [name: " + name + "]";
	}
  
}
