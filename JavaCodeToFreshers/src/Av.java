// Program Serial 22
// Program to find Fibonacci Series for given "n" number;
import java.util.Scanner;

public class Av {
	
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to find fibonacci series:");
		int fibo = input.nextInt();
		
		int number_1 = 0;
		int number_2 = 1;
		for (int m = 0; m < fibo ; m++) 
			{
				int sum = number_1 + number_2;
				number_1 = number_2;
				number_2 = sum;
				System.out.println( "The Fibo is:" + sum);
			}
		}
}
