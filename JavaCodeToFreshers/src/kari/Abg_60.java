// Program serial 60:
// Program to find the sum of given digits:

package kari;
import java.util.Scanner;

public class Abg_60 {
	public static void main(String [] args) {
		Scanner	input = new Scanner(System.in);
		System.out.println("Enter your digit here:");
		int nNumber = input.nextInt();
		int sum =0;
		int digit =0;
		for ( int i =1; i < nNumber  ;i++ )
		{
			digit = nNumber % 10;
			nNumber = nNumber/10;
			sum = sum + digit;
			
		}
		System.out.println("The sum of given digit is:" + sum);
	}
}


