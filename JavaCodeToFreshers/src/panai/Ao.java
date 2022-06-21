// Program Serial 15:
// Printing sum of N odd number by using for loop: // 37 A
package panai;
import java.util.Scanner;

public class Ao {
	
	public static void main(String [] args){ 
		
		while (true) {
			
			Scanner input = new Scanner(System.in);
			System.out.println("Enter n value to add only odd number: ");
			int inn = input.nextInt();
			int total = 0;
			int increment=1;
			
			for (int x=1; x <= inn; x++){
				total+= increment;
				increment=increment+2;
			}	
			System.out.println("The 'n' value is:"+total);
		}		
	}
}
	


