package polymorphism.upcasting.factory;

public class TestPayrolOffice {

	public static void main(String[] args) {
		PayrollOffice payrollOffice = new PayrollOffice();
		
		Employee e1 = new Employee(1, "Ali", 8, "Production");
		payrollOffice.paySalary(e1); // Employee employee = e1;
		
		Manager m1 = new Manager(2, "Fatma", 3,"Production", "Production");
		payrollOffice.paySalary(m1); // Employee employee = m1;
		
		Director d1 = new Director(3, "Mehmet", 20, "Management", "Management", 3000);
		payrollOffice.paySalary(d1); // Employee employee = d1;
		
		Employee emp = e1;
		emp = m1;
		emp = d1;
		
		System.out.println();
		
		Engineer eng1 = new Engineer(4, "Akin", 12, "Production", "X ARGE");
		payrollOffice.paySalary(eng1);
		/*e1 = m1;
		payrollOffice.paySalary(e1);
		
		e1 = d1;
		payrollOffice.paySalary(d1);
		
		payrollOffice.paySalary(new Director(3, "Mehmet", 20, "Management", "Management", 3000));
		
		Engineer e = new Engineer(0, null, 0 ,null, null);
		Employee e10 = e;
		*/
	}

}
