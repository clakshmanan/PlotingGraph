// Program Serial 15:
// Program which tells insufficient balance in your account:

package yanai;
import java.util.Scanner;

public class Abc_s 
{
	public static void  main(String [] args) 
	{
		while(true) 
		{
			Scanner input = new Scanner(System.in);
			double savingsAmount, deposit, withdraw, currentBalance; int e = 0;
			savingsAmount =  10000;
			System.out.println("Enter amount to deposit:");
			deposit = input.nextDouble();
			currentBalance = savingsAmount + deposit;
			System.out.println("Your balance is :" + currentBalance);
			System.out.println("Enter amount to withdraw");
			withdraw = input.nextDouble();
			
			if (withdraw > currentBalance)
			{
				System.out.println("Sorry, Insufficient Balance in your account");
			}
			else 
			{
				savingsAmount = currentBalance -  withdraw;
				currentBalance = savingsAmount;
				System.out.println("your balance after withdrwal is:" + savingsAmount);
			}
		}
	}	
}


 