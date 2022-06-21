// Program Serial 52:
// Find out duplicate number between 1 to N numbers;
package kari;
import java.util.Scanner;

public class Aba_52 {

	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your N number to check duplicate:");
		int nValue = input.nextInt();
		int a =0;
		int b = 1;
		int temp = 0;
		for (int i = 1;  i<=nValue;  i++ )
		{
			b = i+a;  // 1+0 , 2+0, 3+0
			temp = b; // 1 + 1, 2+1, 3+1
			if (temp == b)
			{
			System.out.println("No duplicate");
			}
			else
			{
				System.out.println("duplicate found");
			}
			System.out.println("b = " + b);
			System.out.println("temp= " + temp);
		}			
	}
}