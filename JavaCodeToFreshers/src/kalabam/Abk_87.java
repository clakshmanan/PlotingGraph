// Program Serial 87:
// Program to print pyramid

package kalabam;
import java.util.Scanner;

public class Abk_87 
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your number to print pyramid");
		int nNumber = input.nextInt();
		for (int i = 1; i <=nNumber ; i ++ )
		{
			for (int space =0; space<(nNumber-i); space++)
			{
				System.out.print(" ");
			}
			for (int star = 0; star <(i*2-1) ; star++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
