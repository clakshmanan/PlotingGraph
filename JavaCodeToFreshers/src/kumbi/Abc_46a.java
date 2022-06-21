// program Serial 46 (alfa)
// program to find Greatest Common Divisor
package kumbi;
import java.util.Scanner;

public class Abc_46a {
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first integer:");
		int x = input.nextInt();
		System.out.println("Enter the Second integer:");
		int y = input.nextInt();
		int a = x; 
		int b = y;
		int temp;
		int gcd;
		while (b !=0)
		{
			temp = b;
			b = a % b ;
			a = temp;
		}
		gcd = a;
		System.out.println("The GCD is:" + gcd);
		
	}
}
