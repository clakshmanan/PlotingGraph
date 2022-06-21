
// Program serial 2:
// Multiplying  2 numbers and getting result
package yanai;
import java.util.Scanner;

public class Abc_b 
{
	public static void main(String [] args)
	{
		while(true)
		{
			Scanner input = new Scanner(System.in);
			System.out.println(" Multiplying 2 numbers by using console input \n Enter First number: ");
			int alfa =  input.nextInt();
			System.out.println("Enter your second number:");
			int beta = input.nextInt();
			int charlie = alfa * beta;
			System.out.println("The result is :" + charlie + "\n");
		}
	}			
}

//end of program