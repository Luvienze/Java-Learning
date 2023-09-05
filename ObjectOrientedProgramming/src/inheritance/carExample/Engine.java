package carExample;

public class Engine {
	private int volume;
	private int horsePower;
	
	public Engine(int volume, int horsePower) {
		this.volume = volume;
		this.horsePower = horsePower;
		System.out.println("Engine is created. Volume is " + volume + " cc and horse power is " + horsePower);
	}
	public void start() {
		System.out.println("\nEngine started.");
	}
	public void stop() {
		System.out.println("\nEngine stopped.");
	}

}
