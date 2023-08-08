package switchCaseLearning;
import java.util.Scanner;

public class switchNotes {
	public static void main(String[] args)
	{
		switchNotes swDemo = new switchNotes();
		//swDemo.demo1();
		//swDemo.switchDemo2();
		swDemo.switchDemo3();
	}
	public void demo1()
	{
		Scanner switchDemo = new Scanner(System.in);
		System.out.println("A number for month: ");
		int month = switchDemo.nextInt();
		
		String monthInString = switch (month) 
				{
					case 1 -> "January";
					case 2 -> "February";
					case 3 -> "March";
					case 4 -> "April";
					case 5 -> "May";
					case 6 -> "June";
					case 7 -> "July";
					case 8 -> "August";
					case 9 -> "September";
					case 10 -> "October";
					case 11 -> "November";
					case 12 -> "December";
					default -> "Error! Please enter the month number betqeen 1 and 12";
		
				};
				System.out.println(monthInString);
	}
	public void switchDemo2()
	{
		Scanner switchDemo = new Scanner(System.in);
		System.out.println("A number for month: ");
		int month = switchDemo.nextInt();
		
		char c = 16;
		int square = switch(month)
				{
					case 1 -> 1;
					case 2 -> 2;
					case 3 -> 9;
					case 4 -> 16;
					case 5 -> 25;
					case 6 -> 36;
					case 7 -> 49;
					case 8 -> 64;
					case 9 -> 81;
					case 10 -> 100;
					case 11 -> 121;
					case 12 -> 144;
					default -> -1;
				};
				System.out.println("Its square is " + square);
	}
	public void switchDemo3()
	{
		System.out.println("A number for a day Monday being 1:");
		Scanner switchDemo = new Scanner(System.in);
		int day = switchDemo.nextInt();
		
		System.out.print("Number of letters: ");
		System.out.println(switch (day)
		{
			case 1, 5, 7: yield 6;
			case 2: yield 7;
			case 4, 6: yield 8;
			case 3: yield 9;
			default: yield returnMinusOne();
		});
	}
	private int returnMinusOne()
	{
		return -1;
	}
	
	

}
