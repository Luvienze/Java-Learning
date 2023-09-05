package bicycle;

public class Tire {
	private int rim;
	private String name;
	
	public Tire(String name, int rim) {
		this.name = name;
		this.rim = rim;
	}
	public void turning() {
		System.out.println(name + " tire is turning.");
	}
	public void stable() {
		System.out.println(name + " tire is stable");
	}

}
