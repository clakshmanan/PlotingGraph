
// Program serial 3:
// Calculating interest rate for given principle and number of years (i = pnr/100)
package yanai;
import java.util.Scanner;

public class Abc_c 
{
	public static void main(String [] args) 
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your principle amount:");
		double principle =  input.nextDouble();
		System.out.println("Enter your rate of interest here:");
		double rate = input.nextDouble();
		System.out.println("Enter your number of years:");
		int numberOfYear = input.nextInt();
		double interest = principle * rate * numberOfYear / 100 ;
		System.out.println("The interest amount is:" + interest);
		
	}
}
//end of program