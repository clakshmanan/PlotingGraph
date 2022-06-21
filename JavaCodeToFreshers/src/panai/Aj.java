// Program Serial 10: 36(b)
// Program to add serials by using while loop:

package panai;
import java.util.Scanner;
public class Aj {
	
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your number to add:");
		int count = input.nextInt();
		int sum = 0;
		int x = 1 ;
		while ( x <= count)
		{
			sum += x;
			x ++ ;
		}
		
			System.out.println("Couting alfa:" + sum);
	}
}
// end of program
