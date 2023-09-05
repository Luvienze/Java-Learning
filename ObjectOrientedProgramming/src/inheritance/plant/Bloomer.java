package plant;

public class Bloomer extends Plant {
	protected String flower;
	public Bloomer(String type, String color, int leaves, String flower) {
		super(type, color, leaves);
		this.flower = flower;
		System.out.println("Plant with a " + flower + " colored flower.");
	}
	public void haulingBees() {
		System.out.println("Bees are spreading seeds from flowers.");
	}
	
}
