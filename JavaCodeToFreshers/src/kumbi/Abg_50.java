// Program serial 50:
// Program to calculate Power of a number:

package kumbi;
import java.util.Scanner;

public class Abg_50 {
	
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Basevalue:");
		int baseValue = input.nextInt();
		System.out.println("Enter the Powervalue:");
		int powerValue = input.nextInt();
		int result = 1;
		
		for (int i = 1; i < powerValue; i++)
		{
			result =  result * baseValue ;
		}	
		System.out.println("The result is:" + result);
	}
}


