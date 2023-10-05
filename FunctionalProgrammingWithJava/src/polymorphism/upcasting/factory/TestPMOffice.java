package polymorphism.upcasting.factory;

public class TestPMOffice {

	public static void main(String[] args) {
		PMOffice pmOffice = new PMOffice();
		
		Manager m1 = new Manager(2, "Fatma" , 3, "Production", "Production");
		pmOffice.manageProject("Project X", m1);
		
		Director d1 = new Director(3, "Mehmet", 20, "Management", "Management", 3000);
		pmOffice.manageProject("Project Y", d1);
		
		Employee e1 = new Employee(1, "Ali", 8, "Production");
		//Error, employee can't manage project!
		//pmOffice.manageProject("Project Y", e1);

	}

}
