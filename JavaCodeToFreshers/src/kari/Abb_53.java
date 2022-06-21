// Program serial 53:
// Program to reversing a number:
package kari;
import java.util.Scanner;

public class Abb_53 {
	
	public static void main(String [] args) {
		{
			Scanner input = new Scanner(System.in);
			System.out.println("Enter a number to reverse it:");
			int nValue = input.nextInt();
			int memory = 0;
			
			while (nValue>0)
			{
				memory = memory*10 + nValue % 10;
				nValue = nValue/10;
			}
			System.out.println(memory);
		}
	}
}
