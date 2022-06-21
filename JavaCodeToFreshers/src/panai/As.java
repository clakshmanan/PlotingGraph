// Program Serial 19
// Program to print "n" odd number starting from "x"  // 39
package panai;
import java.util.Scanner;

public class As {
	
	public static void main(String [] args) 
	{
		while (true)
		{
			Scanner input = new Scanner(System.in);
			System.out.println("$$Ener the number of odd numbers to add : "); // decided loops 3
			int nValue = input.nextInt();
			System.out.println("Enter starting  x number :");  	// decided starting value from 102
			int count = input.nextInt();						//103 + 105 + 107  = 415
			int total = count;
			int increment=1;
			for (int x = 1 ; x <= nValue; x++) 
			{
				total+= increment; // total =total + increment
				increment=total+1;
			}
			System.out.println("The value is :" + total);
		}
	}
}
				
// end of program						
		