// Program Serial 54:
// Program to write an algorithm to find fibonacci series upto N numbers:

package kari;
import java.util.Scanner;

public class Abc_54 {
	
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter N  number of fibonacci:");
		int nValue = input.nextInt();
		int numberOne = nValue;
		int numberTwo = nValue+1;
		int total = 0;
		for (int i = 1; i<=nValue ;i++ )
		{
			total = numberOne + numberTwo;
			numberOne = numberTwo;
			numberTwo = total;
			System.out.print("/ " +total);
		}
	}
}

// end of program ----------------------------------

