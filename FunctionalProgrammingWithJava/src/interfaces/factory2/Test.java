package interfaces.factory2;

public class Test {

	public static void main(String[] args) {
		Employee e = new Employee(1, "Ali", 10, "Production");
		e.calculateSalary();
		e.printInfo();
		e = new Manager(3, "Duru", 18, "Production", "Production");
		if(e instanceof Manager m) {
			m.printInfo();
		}

	}

}
