// Program Serial 11: 37(a)
// Program to add only odd number in the serial by using for loop:

package panai;
import java.util.Scanner;

public class Ak {
	
	public static void main(String [] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your number:");
		int count = input.nextInt();
		int total =  0;
		for (int x =1; x <= count; x=x+2)
			{
				total = total + x ;
				System.out.println("Total is :" + total);
		}
	}

}
// end of program