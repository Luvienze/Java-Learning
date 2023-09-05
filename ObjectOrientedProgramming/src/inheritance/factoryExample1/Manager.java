package factoryExample1;

public class Manager extends Employee{
	protected String departmentManaged;
	
	public static final int MANAGEMENT_PAYMENT = 5000;
	
	public Manager(int no, String name, int year, String workingDepartment, String departmentManaged) {
		super(no, name, year, workingDepartment);
		this.departmentManaged = departmentManaged;
		System.out.println("in Managr()");
	}
	
}