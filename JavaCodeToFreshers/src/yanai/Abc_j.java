// program serial 7:
// sum of numbers by using while loop:

package yanai;
import java.util.Scanner;

public class Abc_j 
{
	public static void main(String [] args) 
	{
		Scanner input = new Scanner(System.in);
		int sum  = 0;
		System.out.println("Enter your number:");
		while (true)
			{
			int duck = input.nextInt();
			if (duck == 0) break;
			sum += duck; // or we can use sum = sum + duck;
			}
		System.out.println("The sum of value is:" + sum);
	}
}
// end of program