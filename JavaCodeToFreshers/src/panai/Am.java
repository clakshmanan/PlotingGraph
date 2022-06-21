// Program Serial 13: // 38
// Program to add only even number in the serial by using for loop:

package panai;
import java.util.Scanner;

public class Am {
	public static void main(String [] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your number:");
		int nValue = input.nextInt();
		int total =  0;
		for (int m =0; m <=nValue; m=m+2)
			{
				total = total + m ;
				System.out.println("..Total is :" + total);
			}
	}

}
// end of program