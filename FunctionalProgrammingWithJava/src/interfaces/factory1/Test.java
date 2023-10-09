package interfaces.factory1;

public class Test {

	public static void main(String[] args) {
		Worker w = new Employee(1, "Ali", 4, "Production");
		w.work();
		
		if(w instanceof Employee e) {
			System.out.println("Salary: " + e.calculateSalary());
		}
		
		w = new Manager(5, "Ege", 14, "Production", "Produciton");
		w.work();
		
		Manager m = (Manager) w;
		m.manage();
		
		Boss boss = new Boss();
		
		if(boss instanceof Worker w1) {
			System.out.println("true");
			w1.work();
		}
		
		w = new Engineer(6, "Duru", 12, "Production", "Project A");
		w.work();
		if(w instanceof Engineer e) {
			e.printInfo();
		}
	}

}
