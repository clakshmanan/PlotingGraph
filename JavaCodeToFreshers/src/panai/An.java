// Program Serial 14: // 38
// Program to add only even number in the serial by using while loop:
package panai;
import java.util.Scanner;


public class An {
	
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int nValue = input.nextInt();
		int total = 0;
		int x = 0;
		while (x<=nValue) 
		{
			total = total + x;
			System.out.println("--the Value is :" + total);
			x=x+2;
		}
	}
}
// end of program