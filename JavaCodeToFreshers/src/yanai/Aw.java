//Program Serial 19 :
// Validating the user input in the range of 1-10:

package yanai;
import java.util.Scanner;

public class Aw 
{
	public static void main(String [] args)
	{ 
		while(true)
		{
			Scanner input = new Scanner(System.in);
			System.out.println("Enter your number to validate:");
			int number = input.nextInt();
			int a = 1;
			int b = 10;
			if ( number<=b && number>=a )
			{
				System.out.println("Yes this is valid Number:");
			}
			else
			{
				System.out.println("Sorry invalid number, input once again:\n\n");
			}
		}
	}
}

