
// program serial 8:
// Find the value for multiplication of 10 numbers:  We can use factorial 

package yanai;
import java.util.Scanner;
public class Abc_l 
{
	public static void main(String [] args) 
	{
		Scanner pin = new Scanner(System.in);
		System.out.println("Input your number to find the factorial:");
		long myFactorial = 1;
		int donkey = pin.nextInt();
		int monkey;
		for (monkey = 1; monkey <= donkey; monkey++)
		{
			myFactorial = myFactorial * monkey ;
		}
		System.out.println("The mulplication upto given value is:" + myFactorial);
	}
}

// end of program
