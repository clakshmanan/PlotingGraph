// Program Serial 17:
// Printing sum of N even number by using for loop: // 38A

package panai;
import java.util.Scanner;

public class Aq {
	public static void main(String [] args){ 
		while (true)
		{
			Scanner input = new Scanner(System.in);
			System.out.println("@@Enter n value to even only odd number: ");
			int inn = input.nextInt();
			int total = 0;
			int increment=0;
			for (int x=0; x <= inn; x++) 
			{
				total+= increment;
				System.out.println("The 'n' value is:"+total);
				increment=increment+2;
			}	
		}		
	}
}
	


