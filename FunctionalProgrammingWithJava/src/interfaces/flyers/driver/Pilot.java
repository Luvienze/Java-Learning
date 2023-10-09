package interfaces.flyers.driver;

import interfaces.flyers.vehicle.Airplane;
import interfaces.flyers.vehicle.Vehicle;

public class Pilot extends AbstractDriver{
	
	public Pilot(String name) {
		super(name);
	}
	@Override
	public void drive(Vehicle vehicle) {
		vehicle.turnOn();
		fly(vehicle);
	}
	public void fly(Vehicle vehicle) {
		if(vehicle instanceof Airplane) {
			Airplane plane = (Airplane) vehicle;
			System.out.println("\nFlying an Airplane: " + plane);
			plane.turnOn();
			plane.takeOff();
			plane.fly();
			plane.land();
			plane.turnOff();
		}
		else {
			vehicle.turnOn();
			vehicle.go();
			vehicle.stop();
			vehicle.turnOff();
		}
	}

}
