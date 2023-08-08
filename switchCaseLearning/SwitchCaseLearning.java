package switchCaseLearning;
import java.util.Scanner;

public class SwitchCaseLearning {
	public static void main(String[] args)
	{
		SwitchCaseLearning demo = new SwitchCaseLearning();
		//System.out.println("A number:");
		
		//Scanner userMonth = new Scanner(System.in);
		//int month = userMonth.nextInt();
		
		//demo.switchDemo(month);
		demo.yieldDemo();
	

	}
	public void switchDemo(int month)
	{
		switch(month)
		{
			case 12,1,2: System.out.println("Winter"); break;
			case 3,4,5: System.out.println("Spring"); break;
			case 6,7,8: System.out.println("Summer"); break;
			case 9,10,11: System.out.println("Fall"); break;
		}

	}
	public void yieldDemo()
	{
		System.out.println("A number for Month:");
		Scanner userDay = new Scanner(System.in);
		int month = userDay.nextInt();
		
		System.out.println(switch(month)
		{
		case 12, 1, 2: yield "Winter";
		case 3, 4, 5: yield "Spring";
		case 6, 7, 8: yield "Summer";
		case 9, 10, 11: yield "Fall";
		default: yield returnMinusOne();
		});
		
	}
	private int returnMinusOne()
	{
		return -1;
	}
		


}
