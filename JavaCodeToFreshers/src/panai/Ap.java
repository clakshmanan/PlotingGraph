// Program Serial 16:
// Printing sum of N odd number by using while loop: // 37A

package panai;
import java.util.Scanner;
public class Ap {
	public static void main(String [] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("**Enter the N value to find odd number");
		int count = input.nextInt();
		int total = 0;
		int increment = 1;
		int i = 0;
		while (i <= count) {
			System.out.println("The value is " + total);
			total += increment;
			increment = increment + 2;		
			i++;
		}
		
	}
}
