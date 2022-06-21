// Program Serial : 45
// Program to find the divisible factors :

package kumbi;
import java.util.Scanner;

public class Abb_45 {

	public static void main(String [] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number to find divisible factors:");
		int nValue = input.nextInt();
		for (int x = 1; x<=nValue ; x=x+1)
			{
				if (nValue % x == 0)
				System.out.println("The Divisible factors are...:" +  x);
			}
	}
}
