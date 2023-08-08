package shapes;

public class Rectangle {
	public static void main(String[] args)
	{
		Rectangle r = new Rectangle();
		//r.drawFilledFakeRectangle1();
		//r.drawFilledRectangle2(10, 5);
		//r.drawVoidRectangle(10, 5);
		//r.drawStraightAngleTriangle(10);
		r.drawTriangle(5);
	
	}
	
	public void drawFilledFakeRectangle1()
	{
		System.out.println("******");
		System.out.println("******");
		System.out.println("******");
		System.out.println("******");
		System.out.println("******");
		System.out.println("******");
		System.out.println("******");
		System.out.println("******");
		System.out.println("******");
	}
	public void drawFilledRectangle2(int row, int column)
	{
		for(int i= 0; i < row; i++)
		{
			for (int j = 0; j < column; j++)
			{
				System.out.print("*");
				if(j == column -1)
				{
					System.out.println();
				}
			}
			
		}
	}
	public void drawVoidRectangle(int row, int column)
	{
		for(int i= 0; i < row; i++)
		{
			for (int j = 0; j < column; j++)
			{
				if(i == 0  | i == row -1)
				{
					System.out.print("*");
					if(j == column -1)
					{
						System.out.println();
					}
				}
				else
				{
					if( j== 0)
					{
						System.out.print("*");
					}
					else if( j == column -1)
					{
						System.out.println("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
			}
			
		}
		
	}
	public void drawVoidFakeRectangle1()
	{
		System.out.println("******");
		System.out.println("*    *");
		System.out.println("*    *");
		System.out.println("*    *");
		System.out.println("*    *");
		System.out.println("*    *");
		System.out.println("*    *");
		System.out.println("*    *");
		System.out.println("******");
	}
	public void drawStraightAngleTriangle(int row)
	{
		for(int i=0; i < row; i++)
		{
			for(int j = 0; j < i+1; j++)
			{
				
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
	}
	public void drawTriangle(int row)
	{
		for(int i=1; i < row; i++)
		{
			for (int j = 1; j <= row -i; j++)
			{
				System.out.print(" ");
			}
			for(int k = 1; k<= 2*i-1; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
