// Program Serial 18:
// Program to identify the age to vote:

package yanai;
import java.util.Scanner;
public class Abc_v
{
	public static void main(String [] args)
	{
		while(true) 
		{
			int eligibleAge = 18;
			int crossedAge = 100;
			Scanner input = new Scanner(System.in);
			System.out.println("Enter your Age:");
			int Age = input.nextInt();
			if (Age >= eligibleAge &&  Age <= crossedAge) 
			{
				System.out.println("You are eligible to vote");
			}
			else if (Age < eligibleAge)
			{
				System.out.println("Sorry, You need to grow more");
			}
			else
			{ 
				System.out.println("Oh Great... R u alive?  glad to see you and what can we do best for you!");
			}
		}						 
	}
}


// end of program