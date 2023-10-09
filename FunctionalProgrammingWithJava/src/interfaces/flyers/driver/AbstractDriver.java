package interfaces.flyers.driver;

public abstract class AbstractDriver implements Driver {
	
	public String name;
	public AbstractDriver(String name) {
		this.name = name;
	}
}
