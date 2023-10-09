package interfaces.math.calculator1;

public class SumOfFib implements MathFunction {
	private static String name = "Sum of Fibonacci Numbers";

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double calculate(double arg) {
		int sum = 0;
		if(arg == 0 | arg == 1)
		{
			System.out.println("Fibonacci's result is " + 1);
		}
		else if( arg > 1)
		{
			long fibonacci = (long) ((arg-1) + (arg-2));
			System.out.println("Fibonacci's result is " + fibonacci );
		}
		return arg;
	}
	
}
