package calculator;

public class Calculator {
	String name;
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		name = newName;
	}
	void whoAreYou() {
		System.out.println("I'm a Calculator, my name is " + name);
		System.out.println("Operations: 1-Add 2-Subtract 3-Multiply 4-Multiply by Adding");
		System.out.println("5-Divide 6-Power 7-Mod 8-Factorial");
	}
	public int add(int first ,int second) {
		int add = first + second;
		System.out.println(first + "+" + second + " = " + add);
		return add;
	}
	public int subtract(int first, int second) {
		int subtract = first - second;
		System.out.println(first + "-" + second + " = " + subtract);
		return first - second;
	}
	public int multiply(int first, int second) {
		
		int multiply = first * second;
		System.out.println(first + "*" + second + " = " + multiply);
		return multiply;
	}
	public int multiplyByAdding(int first, int second) {
		int multiplication = 0;
		for(int i= 1; i <= second; i++)
		{
			multiplication += first;
		}
		System.out.println("Multiplication: " + multiplication);
		return multiplication;
	}
	public double divide( int first, int second) {
		double divide = (double) first / second;
		System.out.println(first + "/" + second + " = " + divide);
		return divide;
	}
	public int power (int first, int second) {
		int power =1;
		for(int i=1; i<= second; i++)
		{
			power = power *first;
		}
		System.out.println(first + "^" + second + " = " + power);
		return power;
	}
	
	public int mod (int first, int second) {
		int mod = first / second;
		System.out.println(first + "%" + second + " = " + mod);
		return mod;
	}
	public int factorial(int number) {
		int factorial = 1;
		for(int i=1; i<= number; i++)
		{
			factorial *= i;
		}
		System.out.println(number + "!" + " = " + factorial);
		return factorial;
	}
}
