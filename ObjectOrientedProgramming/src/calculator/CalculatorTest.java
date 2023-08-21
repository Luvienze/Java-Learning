package calculator;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		Scanner getUser = new Scanner(System.in);
		Calculator calculator = new Calculator();
		calculator.setName("Texas Instruments T-308");
		int first , second, operation;
		String answer;
		do 
		{
			calculator.whoAreYou();
			System.out.println("Choose an operation: ");
			operation = getUser.nextInt();
			System.out.println("Enter numbers:");
			first = getUser.nextInt();
			second = getUser.nextInt();
			
			switch(operation)
			{
			case 1: calculator.add(first, second);
			break;
			case 2: calculator.subtract(first, second);
			break;
			case 3: calculator.multiply(first, second);
			break;
			case 4: calculator.multiplyByAdding(first, second);
			break;
			case 5: calculator.divide(first, second);
			break;
			case 6: calculator.power(first, second);
			break;
			case 7: calculator.mod(first, second);
			break;
			case 8: calculator.factorial(first);
			break;
			default:System.out.println("Choose an operation...");
			}
			System.out.println("Do you want to continue? (Y/N)");
			answer = getUser.next();
			
		}while(answer == "Y" && answer != "N");
	}	

}


