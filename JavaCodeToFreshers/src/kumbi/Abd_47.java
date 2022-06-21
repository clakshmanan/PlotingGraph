package kumbi;
import java.util.Scanner;
public class Abd_47 {
	
	public static void main(String [] args) 
	{
		while(true)
		{	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number to find factorial:");
		int nValue = input.nextInt();
		int factorial = 1;
		for (int y=1;  y<=nValue ; y++)  
			{
			factorial = factorial*y;
			}
			System.out.println("The Result is:" +   factorial );
		}
	}
}
