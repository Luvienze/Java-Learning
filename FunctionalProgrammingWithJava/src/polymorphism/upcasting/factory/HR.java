package polymorphism.upcasting.factory;

public class HR {
	public Employee getAnEmployee() {
		Employee e = null;
		int i = (int) (5*Math.random());
		
		switch(i) {
		case 0:
			e = new Employee(1, "Ali", 4, "Production");
			break;
		case 1:
			e = new Secretary(2, "Sevim", 9, "Sales", new Manager(3, "Kamil", 17, "Sales","Sales"));
			break;
		case 2:
			e = new Engineer(3, "Burhan", 5, "Production", "Improving Production");
			break;
		case 3:
			e = new Manager(5, "Ismail", 14, "Production", "Production");
			break;
		case 4:
			e = new Director(6, "Salih", 24, "Management", "Management", 4500);
			break;
		}
		
		return e;

	}
}
