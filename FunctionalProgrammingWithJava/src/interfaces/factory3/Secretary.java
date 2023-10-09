package interfaces.factory3;

public class Secretary extends Employee{
	protected Manager managerServed;
	public Secretary(int no, String name, int year, String department, Manager managerServed) {
		super(no, name, year, department);
		this.managerServed = managerServed;
	}
	public void workd() {
		System.out.println("Secretary is working!");
		serve();
	}
	public void serve() {
		System.out.println("Secretary " + name + " serving manager: " + managerServed);
	}
}
