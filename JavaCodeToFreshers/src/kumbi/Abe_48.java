// Program serial 48:
// Program to store and display user input value until enter 0 to exit

package kumbi;
import java.util.Scanner;

public class Abe_48 {
	
	public static void main(String [] args)
		{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the numbers to add: \nEnter 0 to exit:");
		int number ;
		int total = 0;
		while (true)
		{
			number  = input.nextInt();
			total = total+number;
			if (number == 0) break;
			total ++ ;
		}
		System.out.println("Exit...\nThe total value is:" + total);
	}
}
