// Program Serial 21
// Printing n serial number starting from x  // 41
package panai;
import java.util.Scanner;

public class Au {public static void main(String [] args) 
	{
		while (true)
			{
				Scanner input = new Scanner(System.in);
				System.out.println("Ener the number 'N' serial to add : ");
				int nValue = input.nextInt();
				System.out.println("Enter starting  x number :");
				int count = input.nextInt();			
				int total = count;
				int increment=1;
				for (int x = 1 ; x <= nValue; x++)   
				{
					total+= increment; 
					increment=total;
				}
				System.out.println("The value is :" + total);
			}
		}
	}

//end of program
