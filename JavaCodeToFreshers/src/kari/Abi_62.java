// Program Serial 62:
// Program to check a given number is binary or not:
package kari;
import java.util.Scanner;

public class Abi_62 {
	public static void main(String [] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your number to check binary or not");
		int nNumber = input.nextInt();
		int nValue = 0;
		boolean binary=true;
		while (nNumber!=0)  // 1010101111
		{
			if (nNumber%10 >1)
			{
				binary=false;
				break;
			}
			nNumber = nNumber/10;			
		}
		if(binary==true)
			System.out.println("This is binary");
		else
			System.out.println("This is not binary");
	}
}
		
	


