// Program Serial 46: By using for loop
// Finding GCD and LCM for two integers:

package kumbi;
import java.util.Scanner;

public class Abc_46b {

	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first integer:");
		int a = input.nextInt();
		System.out.println("Enter second integer:");
		int b = input.nextInt();
		int gcd = 1;
		
		for (int i=1 ; i < a && i < b ; i++ )
			{
				if(a%i==0 && b%i==0)
				gcd = i;
			}
			int lcm = (a*b)/ gcd;
			System.out.println("The gcd for given integers is:" + gcd);
			System.out.println("The lcm for given integers is:" + lcm);
		}
	}


