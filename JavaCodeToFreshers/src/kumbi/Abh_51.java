// Program Serial 51:
// Program to check a number is Amstrong or not:

package kumbi;
import java.util.Scanner;

public class Abh_51 {
	public static void main(String [] args) 
	{
		while (true) 
			{
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the Number to check for AmstrongNumber: ");
			int nNumber = input.nextInt();
			int temp = nNumber;
			int AmstrongNumber = 0;
			int bucket = 0;; 
			
			while (nNumber>0)
				{
					bucket = nNumber %10;
					nNumber = nNumber / 10;
					AmstrongNumber = AmstrongNumber + bucket *bucket *bucket;
				}
					if (temp == AmstrongNumber)
						System.out.println("Yes ! this is AmstrongNumber");
					else 
						System.out.println("Sorry input anohter number");		}
		}
	}



