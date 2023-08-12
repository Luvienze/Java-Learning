package example1;
import java.util.Scanner;
import java.lang.Math;

public class SolvingQuadraticEquation {
	public static void main(String[] args) 
	{
		Scanner userNum = new Scanner(System.in);
		SolvingQuadraticEquation callEQT = new SolvingQuadraticEquation();
		System.out.println("Give in order the number of quadratic quation:");
		int a = userNum.nextInt();
		int b = userNum.nextInt();
		int c = userNum.nextInt();
		System.out.println(a +"x2 +" + b + "x +2" + c + " = 0");
		callEQT.rootOfEquation(a, b, c);
	}
	public void rootOfEquation(int a, int b, int c)
	{
		int x1, x2;
		float root= (b*b) - (4*a*c);
		if(root > 0)
		{
			System.out.println("There are two different roots and there roots are:");
			x1 = (int) (-b + (Math.sqrt(root))) / (2*a);
			System.out.println("One of the root is + " + x1);
			x2 =(int) (-b - (Math.sqrt(root))) / (2*a);
			System.out.println("The other root is + " + x2);
		}
		else if (root < 0)
		{
			System.out.println("Because of discriminant is smaller than zero there is no solution in reel numbers ");
		}
		else if(root == 0)
		{
			System.out.println("Because of discriminant is equal to zero there are two even roots.These roots are:");
			System.out.println("x1 + x2 = " + (-b/a));
			System.out.println("x1.x2 = " + (-b/a));
		}
	}

}
