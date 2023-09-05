package plant;

public class Plant {
	
	protected String type;
	protected String color;
	protected int leaves;
	
	public Plant(String type, String color, int leaves) {
		this.type = type;
		this.color = color;
		this.leaves = leaves;
	}
	public void needWater() {
		System.out.println("\nThis plant needs water.");
	}
	public void oxygenCycling() {
		System.out.println("\nThis plant cycles oxygen to atmosphere.");
	}
	public void carbondioObtaining() {
		System.out.println("\nThis plant obtaining CO2 from air.");
	}
	public void printInfo() {
		System.out.println("\nType: " + type);
		System.out.println("\nColor: " + color);
		System.out.println("\nLeaves: " + leaves);
	}
	

}
