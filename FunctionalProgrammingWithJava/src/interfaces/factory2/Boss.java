package interfaces.factory2;

public class Boss extends Person implements Worker {
	public Boss(String name) {
		super(name);
	}
	@Override
	public void work() {
		youWorkToo();
	}
	public void youWorkToo() {
		System.out.println("Boss is working for you!");
	}
	@Override
	public void live() {
		System.out.println("Just living :)");
	}
}
