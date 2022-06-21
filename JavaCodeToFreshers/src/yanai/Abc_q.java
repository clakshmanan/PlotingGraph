
// Program Serial 13:
// Finding largest among three numbers using operators:

package yanai;
import java.util.Scanner;

public class Abc_q
{
	public static void main(String [] args ) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number Alfa :");
		int alfa = input.nextInt();
		System.out.println("Enter second number Beta:");
		int beta = input.nextInt();
		System.out.println("Enter third number Charlie:");
		int charlie = input.nextInt();

		if(alfa > beta && alfa > charlie)
		{
			System.out.println("Alafa is greater than beta and charlie");
		}

		else if(beta > charlie && beta > alfa)
		
		{
			System.out.println("Beta is greater than alfa and charlie");
		}

		else if(charlie > beta && charlie > alfa) 
		{
			System.out.println("Charlie is greater than alfa and beta");
		}
	}
}

// end of program