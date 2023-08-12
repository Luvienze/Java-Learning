package example1;
import java.util.Scanner;
public class FindingPrimeNumber {
	public static void main(String[] args)
	{
		FindingPrimeNumber primeTest = new FindingPrimeNumber ();	
		Scanner getNumber = new Scanner(System.in);
		String answer;
		do 
		{
			System.out.println("Enter number:");
			int number = getNumber.nextInt();
			if(number  >= 2)
			{
				primeTest.isPrime(number);
				
			}
			else
			{
				System.out.println("Number must be bigger than 2... Give another number...");
			}
			System.out.println("Do you want to test another number? (Y/N)");
			answer = getNumber.next();
		}
		while(answer == "Y" && answer != "N");
	}
	
	public void isPrime (int number)
	{
		if(number == 2 | number == 3| number == 5 | number == 7 | number == 11)
		{
			System.out.println(number + " is a prime number");
		}
		else
		{
			if(number %2 == 0 )
			{
				System.out.println( number + " is not a prime number");
			}
			else if(number %3 == 0)
			{
				System.out.println( number + " is not a prime number");
			}
			else if(number %5 == 0)
			{
				System.out.println( number + " is not a prime number");
			}
			else if(number %7 == 0)
			{
				System.out.println( number + " is not a prime number");
			}
			else if(number %11 == 0)
			{
				System.out.println( number + " is not a prime number");
			}

			else
			{
			 System.out.println(number + "  is a prime number");
			}
		}
		
		
	}

}
