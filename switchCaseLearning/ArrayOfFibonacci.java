package switchCaseLearning;
import java.util.Scanner;

public class ArrayOfFibonacci {
	public static void main(String[] args) 
	{
		Scanner fibNumber = new Scanner (System.in);
		ArrayOfFibonacci arrayDemo = new ArrayOfFibonacci();
		
		System.out.println("Give a number for Array of Fibonacci: ");
		int n = fibNumber.nextInt();
		arrayDemo.fibonacciArray(n);
	}
	
	public void fibonacciArray(int n)
	{
		if(n == 0 | n == 1)
		{
			System.out.println("Fibonacci's result is " + 1);
		}
		else if( n > 1)
		{
			long fibonacci = (n-1) + (n-2);
			System.out.println("Fibonacci's result is " + fibonacci );
		}
		
		
	}

}
