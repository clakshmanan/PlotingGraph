// Program serial 7 : 
//sum of numbers 1 to 10 using Formula : n(n+1)/ 2

package yanai;
import java.util.Scanner;

public class Abc_k 
{
	public static void main(String [] args) 
	{
		while(true)
		{
			Scanner input = new Scanner(System.in);
			System.out.println("Enter number to find sum upto that.\nEnter 0 to stop:");
			int monkey = input.nextInt();
			int sumOfNumber = monkey * (monkey+1) / 2 ;
			if(monkey == 0) break;
			System.out.println("The sum upto given number is: " + sumOfNumber);
		}
	}
}

// end of program