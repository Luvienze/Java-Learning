package interfaces.factory3;

public class Engineer extends Employee {
	protected String project;
	public Engineer(int no, String name, int year, String department, String project) {
		super(no, name, year, department);
		this.project = project;
	}
	public void work() {
		System.out.println("Engineer " + name + " is working on a project: " + project);
	}
	public void assignTask(String task) {
		System.out.println("Engineer is working on a task: " + task);
	}
}
