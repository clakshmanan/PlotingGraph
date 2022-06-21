// Program Serial 12: 
// Program to add only odd number in the serial by using while loop:

package panai;
import java.util.Scanner;

public class Al {
	
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your number here:");
		int nValue = input.nextInt();
	
		int total = 0;
		int x = 1;
		while (x<=nValue) 
		{
			total = total + x;
			System.out.println("the Value is :" + total);
			x=x+2;
		}
	}
}
// end of program