package carExample;

public class Door {
	private String name;
	private boolean closed;
	
	public Door(String name) {
		this.name = name;
		System.out.println(name + " door is created");
	}
	public void open() {
		System.out.println(name + " door is open.");
	}
	public void close() {
		System.out.println(name + " door is closed.");
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setClosed(boolean closed) {
		this.closed = closed;
	}
	public boolean isClosed() {
		return closed;
	}
	
}