// Program Serial 12:
// Program to check alphabet is vowel or consonant:

package yanai;
import java.util.Scanner;

public class Abc_p 
{
	public static void main(String [] args) 
	{
		while (true)
		{
			Scanner input = new Scanner(System.in);
			System.out.println("Enter your character to check as vowel or consonants:");
			char ch = input.next().charAt(0);
			switch (ch) 
			{
				case 'a' :
					System.out.println("This alphabet is vowel");
					break;
				case 'A' :
					System.out.println("This alphabet is vowel");
					break;
				case 'e' :
					System.out.println("This alphabet is vowel");
					break;
				case 'E' :
					System.out.println("This alphabet is vowel");
					break;
				case 'i' :
					System.out.println("This alphabet is vowel");
					break;
				case 'I' :
					System.out.println("This alphabet is vowel");
					break;
				case 'o' :
					System.out.println("This alphabet is vowel");
					break;
				case 'O' :
					System.out.println("This alphabet is vowel");
					break;
				case 'u' :
					System.out.println("This alphabet is vowel");
					break;
				case 'U' :
					System.out.println("This alphabet is vowel");
					break;
				default:
					System.out.println("This is consonant");
					break;
			}
		}		
	}
}

// end of program