// Program Serial 18
// Printing sum of nth even number by using while loop:  // 38A

package panai;
import java.util.Scanner;
public class Ar {
	public static void main(String [] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("**Enter the N value to find even number");
		int count = input.nextInt();
		int total = 0;
		int increment = 0;
		int i = 0;
		while (i <= count) {
			System.out.println("The value is " + total);
			total += increment;
			increment = increment + 2;		
			i++;
		}
		
	}
}
