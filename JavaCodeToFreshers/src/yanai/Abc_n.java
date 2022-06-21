// Program serial 10: 
//Program to check the number is odd or even:
package yanai;
import java.util.Scanner;

public class Abc_n 
{
	public static void main(String [] args) 
	{
			while(true)
			{
				Scanner input = new Scanner(System.in);
				System.out.println("Enter your number to check odd or even:");
				int bucket  = input.nextInt();
				
				if (bucket % 2 == 0)
				{System.out.println(" Hey this is Even number boss");
				}
			
				else if(bucket % 2 == 1)
				{System.out.println("Hey this is Odd number boss");
				}
				System.out.println("Enter e to exit:");
		}
	}
}
//end of program ---------------------------------------