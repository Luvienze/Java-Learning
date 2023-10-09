package interfaces.flyers;
import interfaces.flyers.vehicle.*;
import interfaces.flyers.driver.*;

import java.util.ArrayList;
import java.util.List;

import interfaces.flyers.animal.*;
public class TestFlyer {

	public static void main(String[] args) {
		SeaPlane seaPlane = new SeaPlane("Eren's SeaPlane");
		Floatable floatable = seaPlane;
		Airplane airplane = seaPlane;
		AbstractVehicle abstractVehicle = seaPlane;
		Vehicle vehicle = seaPlane;
		Flyer flyer = seaPlane;
		Object object = seaPlane;

		Pilot pilot = new Pilot("Eren");
		pilot.drive(seaPlane); //Vehicle
		
		Hangar hangar = new Hangar("Macaron's Hangar");
		hangar.store(seaPlane);

		Harbour harbour = new Harbour("Ayvalik Harbour");
		harbour.enter(seaPlane);
		
		List list = new ArrayList();
		list.add(seaPlane); 
		
		System.out.println("*****");
		UniversalDriver universalDriver = new UniversalDriver("Eren");
		universalDriver.drive(seaPlane);
	}

}
