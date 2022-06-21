// Program Serial 17:
// Getting Student mark and print as Pass or Fail:

package yanai;
import java.util.Scanner;

public class Abc_u 
{
	public static void main() 	
	{
		while(true) 
		{
			int pass = 35;
			int crossMark = 100;
			Scanner input = new Scanner(System.in);
			System.out.println("Enter your mark:");
			int mark = input.nextInt();
			if (mark >= pass && mark <= crossMark) 
			{
				System.out.println("Great ! You have cleared the exam");
			}
			else if (mark < pass)
			{
				System.out.println("Sorry, please write the exam once again");
			}
			else
			{ 
				System.out.println("Please enter valuable mark:");
			}
		}
	}
}

// end of program --------------------------------------------------------------------------