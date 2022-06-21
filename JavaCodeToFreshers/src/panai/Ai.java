// Program Serial : 9 36(a)
// Adding Serials by using "for loop:"

package panai;
import java.util.Scanner;

public class Ai {
	
	public static void main(String [] args) {
		
		while(true)
		{
			Scanner input = new Scanner(System.in);
			System.out.println("Enter your x :");
			int x = input.nextInt();
			int sum = 0;
			for (int y = 0; y <= x ; y ++)
			{
				sum += y;
			}
			System.out.println("The value of added serial is:" + sum);
		}
	}
}
// end of program 9