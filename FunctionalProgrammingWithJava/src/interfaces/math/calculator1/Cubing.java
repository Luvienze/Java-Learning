package interfaces.math.calculator1;

public class Cubing implements MathFunction {
	private static String name = "Cubing";

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double calculate(double arg) {
		return arg*arg*arg;
	}
	
}
