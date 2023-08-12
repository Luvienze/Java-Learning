package example1;
import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args)
	{
		ReverseNumber reverseNumber = new ReverseNumber();
		Scanner getNumber = new Scanner (System.in);	
		int answer;
		do
		{
			System.out.println("Enter a number between 0 and 10000:");
			int userNumber = getNumber.nextInt();
			if(userNumber >= 10 && userNumber < 100)
			{
				reverseNumber.reverseTenthNumber(userNumber);
			}
			else if(userNumber >=100 && userNumber < 1000)
			{
				reverseNumber.reverseHundredNumber(userNumber);
			}
			else if(userNumber >=1000 && userNumber < 10000)
			{
				reverseNumber.reverseThousandsNumber(userNumber);
			}
			else
			{
				System.out.println("Enter valid number...");
			}
			System.out.println("Do you want to continue? (1/2)");
			 answer = getNumber.nextInt();
			
		}
		while(answer == 1 && answer != 2);
	}
	public void reverseTenthNumber (int number)
	{
		int units = number % 10;
		int tenth = number % 100 / 10;
		
		System.out.println("Reversed Number: " + units + tenth);
	
	}
	public void reverseHundredNumber (int number)
	{
		int units = number % 10;
		int tenth = number % 100 / 10;
		int hundreds = number / 100;
		
		System.out.println("Reversed Number: " + units + tenth + hundreds);
	
	}
	public void reverseThousandsNumber (int number)
	{
		int units = number % 10;
		int tenth = number % 100 / 10;
		int hundreds = number / 100 % 10;
		int thousands =  number / 1000;
		
		System.out.println("Reversed Number: " + units + tenth + hundreds + thousands);
	
	}
	

}
