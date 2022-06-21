
//Program Serial  20
//Program to print "n" even number starting from "x"  // 40
package panai;
import java.util.Scanner;

public class At {

	public static void main(String [] args){ 
		while (true)
		{
			Scanner input = new Scanner(System.in);
			System.out.println("$$Ener the number of even numbers to add : ");
			int nValue = input.nextInt();
			System.out.println("Enter starting  x number :");
			int count = input.nextInt();			
			int total = count;
			int increment=1;
			for (int x = 1 ; x <= nValue; x++)   // 3 loops = 102 + 104 + 106=412
			{
				total+= increment; // total =total + increment
				increment=total;
			}
				System.out.println("The value is :" + total);
		}
	}
}

// end of program