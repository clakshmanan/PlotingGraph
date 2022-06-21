// Program Serial 56:
// Program to Check whether a number is perfect or not:
package kari;
import java.util.Scanner;

public class Abe_56 {

	public static void main(String [] args) {
		
		while(true)
		{
			Scanner input = new Scanner(System.in);
			System.out.println("Enter a number to chech: ");
			int nNumber = input.nextInt();
			int nValue = 0;
			if (nNumber > 0)
			{
				for (int i = 1; i < nNumber ; i++ )
				{
					if (nNumber % i == 0)
					{
						nValue = nValue + i;
					}
				}
				
				if (nNumber == nValue)
					{
						System.out.println(nNumber  +  " :This is a perfect number");
					}
				else 
					{
						System.out.println("It s not perfect");
					}
			}
		}
	}
}

// end of program ------------------------------------------------
