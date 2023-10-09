package interfaces.factory2;

import java.util.Date;
import java.text.DateFormat;
public class Employee extends Person implements Schedulable, Worker	{
	private static final int BASE_SALARY = 500;
	protected int no;
	protected int year;
	protected String department;
	public Employee(int no, String name, int year, String department) {
		super(name);
		this.no = no;
		this.year = year;
		this.department = department;
	}
	public Employee(int no, String name, int year) {
		super(name);
		this.no = no;
		this.year = year;
	}
	public void work() {
		System.out.println("Employee is working!");
	}
	@Override
	public void schedule(Date from, Date to) {	
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);
		String fromString = df.format(from);
		String toString = df.format(to);
		System.out.println("I am scheduled between: " + fromString + " and " + toString);
	}
	@Override
	public void live() {
		System.out.println("I am living an Employee life :)");
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double calculateSalary() {
		return year*BASE_SALARY;
	}
	public String toString() {
		return "Employee [no: " + no + ", name: " + name + ", year: " + year + ", department: " + department +"]";
	}
	public void printInfo() {
		System.out.println("\nNo: " + no);
		System.out.println("\nName: " + name );
		System.out.println("\nYear: " + year);
		System.out.println("\nDepartment: " + department);
	}
	
}
