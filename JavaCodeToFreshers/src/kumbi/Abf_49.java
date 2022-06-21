// Program Serial 49:
// Program to reverse an integer:
package kumbi;
import java.util.Scanner;
public class Abf_49 {
	
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the integer to reverse:");
		int nValue = input.nextInt();
		int reversedInteger = 0;
		while (nValue!= 0)
		{
					reversedInteger = reversedInteger * 10  + nValue%10 ; // removing the digit and storing to leftside
					nValue = nValue /10;
		}
		System.out.println("ReversedInteger is:" + reversedInteger);
	}
}
