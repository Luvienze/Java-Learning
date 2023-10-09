package interfaces.flyers.driver;

import interfaces.flyers.vehicle.Floatable;

public class Harbour {
	protected String name;
	
	public Harbour(String name) {
		this.name = name;
	}
	public void enter(Floatable floatable) {
		System.out.println("\n"  + floatable + " has entered the harbour: " +  name);
		floatable.floatNow();
		floatable.park();
	}
	@Override
	public String toString() {
		return "Harbour [name: " + name + "]";
	}
}
