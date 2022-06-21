// Program Serial 46: Using while loop
// Program to find Greatest Common Division (GCD)
// This program bound with logical error
package kumbi;
import java.util.Scanner;

public class Abc_46 {

	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("PROGRAM TO FIND GREATEST COMMON DIVISER");
		System.out.println("Enter the number_1..:");
		int number_1 = input.nextInt();
		System.out.println("Enter the number_2..:");
		int number_2 = input.nextInt();
		int divisor;
		
		if (number_1 > number_2) // 12 > 10 
			divisor = number_2; // 12   >>> GCD [ 1,2,3,4,6,12 ]
		else
			divisor = number_1; // 10  >>> GCD [ 1, 2, 5, 10 ]

		while ((number_1 % divisor ==1) || (number_2 % divisor ==1));
			{
				divisor-- ;
			}
			System.out.println("The GCD for given numbers is..:" + divisor);
		}
}

