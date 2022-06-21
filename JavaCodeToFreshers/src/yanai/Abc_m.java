
// Program serial 9:
// Print the number if the user enter as negative number

package yanai;
import java.util.Scanner;

public class Abc_m 

{
	public static void main(String [] args) 
		
		{
		while(true)
		{
		Scanner pen = new Scanner(System.in);
		System.out.println("Enter your number again: ");
		int book  = pen.nextInt();		
		if (book <= 0)
			System.out.println("Hey!  you have input negative number:" + book);
		}
	}		
}
	
	
// end of program