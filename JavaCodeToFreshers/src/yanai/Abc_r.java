// Program Serial 14:
// Program to check the leap year:

package yanai;
import java.util.Scanner;

public class Abc_r 
{
	public static void main(String [] args) 
	{
		while (true)
		{
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the year to check leap year or not: ");
			long year = input.nextLong();
			
			if ( year % 4 >= 1) // using (or) operator
			{
				System.out.println("Given year is not leap year");
			}
			else  
			{
				if(year % 100 == 0)
				{
					System.out.println("Given year is not leap year");
				}
				else
				{
					System.out.println("Given year is leap year");
				}
			}
		}
	}
}