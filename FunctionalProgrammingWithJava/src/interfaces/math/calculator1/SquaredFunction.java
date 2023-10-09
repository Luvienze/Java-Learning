package interfaces.math.calculator1;

public class SquaredFunction {
	private static String name = "Squarred";
	
	public String getName() {
		return name;
	}
	public double calculate(double arg) {
		return Math.sqrt(arg);
	}

}
