// Program Serial 77:
// program to check a given number is prime or not:

package kalabam;
import java.util.Scanner; 
public class Aba_77 
{
	public static void main(String [] args)
	{
		while (true)
		{
			Scanner input = new Scanner(System.in);
			System.out.println("Enter your number");
			int givenNumber = input.nextInt();
			int  i = 2;
			while (i < givenNumber)
			{
				if (givenNumber % i == 0)
				{
					System.out.println("Not prime Number");
					break;
				}
				i ++;
			}
			if (i == givenNumber)
			{	
				System.out.println("This is prime number");
			}
		}
	}
}
