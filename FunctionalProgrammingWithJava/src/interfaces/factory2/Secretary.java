package interfaces.factory2;

public class Secretary extends Employee{
	protected Manager managerServed;
	
	public Secretary(int no, String name, int year, String department, Manager managerServed) {
		super(no, name ,year, department);
		this.managerServed = managerServed;
	}
	
	public void serve() {
		System.out.println("Secretary is serving manager: " + managerServed);
	}
	@Override
	public void work() {
		System.out.println("Secretary is working!");
		serve();
	}
}
