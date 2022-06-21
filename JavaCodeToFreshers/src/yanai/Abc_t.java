// Program Serial 16:
// Program to swap two variables without third memory:

package yanai;
import java.util.Scanner;

public class Abc_t 
{
	public static void main(String [] lakshmanan) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your first number:");
		int alfa  = input.nextInt();
		System.out.println("Enter your first number:");
		int beta = input.nextInt();
		System.out.println("Before swapping the alfa value is:\n" + alfa + " beta value is: " + beta);
		alfa = alfa + beta;   
		beta = alfa - beta;				
		alfa = alfa-beta;
		System.out.println("After swapping the alfa value is :\n" + alfa + " beta value  is: " + beta);
	}
}


