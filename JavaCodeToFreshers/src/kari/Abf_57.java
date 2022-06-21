// Program Serial 57:
// Program to find two max numbers from array:

package kari;

public class Abf_57 
{
	public static void main(String [] args) 
	{
		int arrayBox [] = { 10,25, 110, 45, 80, 90, 50, 35};
		int firstNumber = 0;
		int secondNumber = 0;
		for (int i = 0;  i < arrayBox.length ; i++ )
		{
			
			if(firstNumber < arrayBox[i])
			{
				secondNumber = firstNumber;
				firstNumber = arrayBox[i];
			}
			else if (secondNumber < arrayBox[i])
			{
				secondNumber = arrayBox[i];
			}
		}
		System.out.println("First max number is: " + firstNumber + "\nSecond max number is:" + secondNumber);
	}
}
	

