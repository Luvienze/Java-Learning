package arrayLearning;
import java.util.Scanner;

public class ShapesWithArray {
	public static void main(String[] args)
	{
		Scanner scr = new Scanner(System.in);
		ShapesWithArray call = new ShapesWithArray();
		
		System.out.println("Enter the required size of the Triangle array: ");
		int size = scr.nextInt();
		String triangle[] = new String[size];
		call.drawTriangle(triangle);
		System.out.println();
		
		System.out.println("Enter the required sizes of the Rectangle array: ");
		size = scr.nextInt();
		size = scr.nextInt();
		String rectangle[][] = new String[size][size];
		call.filledRectangle(rectangle);
		System.out.println();
		
		System.out.println("Enter the required size of the Straight Angle Triangle array: ");
		size = scr.nextInt();
		String strTriangle[] = new String[size];	
		call.drawStraightAngleTriangle(strTriangle);
		System.out.println();

	}
	void filledRectangle(String rectangle[][])
	{
		for(int i =0 ; i <rectangle.length; i++)
		{
			for(int j = 0; j < rectangle[i].length; j++)
			{
				System.out.print("*");
				if(j == rectangle[i].length-1)
				{
					System.out.println();
				}
			}
		}
	}
	void drawStraightAngleTriangle(String strTriangle[])
	{
		for(int i=0; i < strTriangle.length; i++)
		{
			for(int j = 0; j< i+1; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	void drawTriangle(String triangle[])
	{
		for(int i= 1; i < triangle.length; i++)
		{
			for(int j = 1; j <= triangle.length - i; j++)
			{
				System.out.print(" ");
			}
			for(int k = 1; k <= 2*i-1 ; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	

}
