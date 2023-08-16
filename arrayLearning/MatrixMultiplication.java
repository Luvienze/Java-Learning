package arrayLearning;
import java.util.Scanner;

public class MatrixMultiplication {
	public static void main(String[] args)
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the rows and columns of the matrix:");
		System.out.println("Rows: ");
		int rowFirst = scr.nextInt();
		System.out.println("Columns:");
		int columnFirst = scr.nextInt();
		System.out.println("Matrix :");
		int matrix[][] = new int[rowFirst][columnFirst];
		for(int i=0; i<rowFirst; i++)
		{
			System.out.println();
			for(int j=0;j<columnFirst;j++)
			{
				matrix[i][j] = scr.nextInt();
			}
		}
		for(int[] x:matrix)
		{
			for(int y:x)
			{
				System.out.print(y+"    ");
			}
			System.out.println();
		}
		System.out.println("Enter the rows and columns of the matrix:");
		System.out.println("Rows: ");
		int rowSecond = scr.nextInt();
		System.out.println("Columns:");
		int columnSecond = scr.nextInt();
		System.out.println("Matrix :");
		
		int matrix2[][] = new int[rowSecond][columnSecond];
		for(int i=0; i<rowSecond; i++)
		{
			System.out.println();
			for(int j=0;j<columnSecond;j++)
			{
				matrix2[i][j] = scr.nextInt();
			}
		}
		for(int[] x:matrix2)
		{
			for(int y:x)
			{
				System.out.print(y+"    ");
			}
			System.out.println();
		}
		if(columnFirst != rowSecond)
		{
			System.out.println("Cannot muliply the matrices. Column sizes of the first matris is must be equal to row sizes of the second matris. ");
		}
		else
		{
			int multiplicationMatrix [][] = new int[rowFirst][columnSecond];
			
			for(int i=0; i <rowFirst; i++)
			{
				for(int j=0; j <columnSecond; j++)
				{
					for(int k=0; k < columnFirst; k++)
					{
						multiplicationMatrix[i][j] += matrix[i][k] * matrix2[k][j];
					}
				}
			}
			
			System.out.println("Multiplication matrix:");
			for(int i=0; i<rowFirst;i++)
			{
				for(int j=0; j<columnSecond; j++)
				{
					System.out.print(multiplicationMatrix[i][j] + " ");
				}
				System.out.println();
			}
		}
	}	
}
