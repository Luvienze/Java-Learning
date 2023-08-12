package example1;
import java.util.Scanner;

public class DividingStrings {
	public static void main(String[] args)
	{
		Scanner getWord = new Scanner(System.in);
		String word;
		String answer;
		
		do
		{
			System.out.println("Enter a word:");
			word = getWord.next();
			
			for(int i=0;i< word.length() ; i++)
			{
				System.out.print(word.charAt(i));
				System.out.print("*");
			}
			System.out.println();
			System.out.println("Do you want to continue? (Y/N)");
			answer =getWord.next();
			
		}while(answer == "Y" && answer != "N");
	}


}
