// Program serial : 44
// Program to display Multiplication table for given input:

package kumbi;
import java.util.Scanner;


class Aba_44
{
	public static void main(String [] args)
	{
		Scanner	input = new Scanner(System.in);
		System.out.println("Enter the table number to display: ");
		int tableNumber = input.nextInt();  // input of table number
		int tableValue;
		for (int m = 1;  m<=12 ;  m++ )  
		{
			tableValue = m * tableNumber;
			System.out.println(  m + "*" +  tableNumber   + "=" + tableValue);
		}
	}
}