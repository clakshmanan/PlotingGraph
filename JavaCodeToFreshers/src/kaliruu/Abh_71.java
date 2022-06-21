// Program Serial 71:
// Program to remove duplicate from given string:

package kaliruu;
import java.util.Scanner;

public class Abh_71 
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your string:");
		String givenString = input.next();
		String newString = "";
		System.out.println("Given String is:" + givenString);
		for (int i = 0; i < givenString.length(); i++)
		{
			char k = givenString.charAt(i);
			if (k!= ' ')
			{
				newString = newString + k;
				givenString = givenString.replace(k, ' ');
			}
		}
		System.out.println(newString);
	}
}
