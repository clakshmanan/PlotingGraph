// Program Serial 52:
// Find out duplicate number between 1 to N numbers;
package kari;
import java.util.Scanner;

public class Abd_55 {
	
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Decimal Value:");
		int nValue = input.nextInt();
		int remainder = 0;
		while(nValue > 0) // 15%2=1, 7%2=1, 3%2=1, remainder 1111 
		{
			remainder = remainder*10 + nValue%2;
			//System.out.println();
			nValue = nValue/2;
		}
		System.out.println("The binary value is:" + remainder);
	}
}
