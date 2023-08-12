package example1;

import java.util.Scanner;

public class FindingPrimeNumberV2 {
	public static void main(String[] args)
	{
		FindingPrimeNumber primeTest = new FindingPrimeNumber ();	
		Scanner getNumber = new Scanner (System.in);
		
		System.out.println("Enter a number: ");
		int number = getNumber.nextInt();
		int primeCount = 0;
		for(int i = 0; i < number; i++)
		{
			
			if(i == 2 | i == 3 | i == 5| i == 7 | i == 11)
			{
				primeCount++;
			}
			else
			{
				if(i %2 == 0 )
				{
					
				}
				else if(i %3 == 0)
				{
					
				}
				else if(i %5 == 0)
				{
					
				}
				else if(i %7 == 0)
				{
					
				}
				else if(i %11 == 0)
				{
					
				}

				else
				{
					primeCount ++;
				}
			}
				
		}
		System.out.println("There are " + primeCount + " prime numbers till "+ number );
	
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
