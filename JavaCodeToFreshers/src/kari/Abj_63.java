// Program serial 63:
// Program to convert string into integer without using 

package kari;
import java.util.Scanner;

public class Abj_63 {
	public static void main(String [] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your string here:");
		String string = input.nextLine();
		int intValue=0;
		int currentDigit=0;
		char currentChar;
		for (int i = 0; i < string.length() ; i++)
		{
			currentChar=string.charAt(i);
			switch (currentChar) 
			{
				case '0' :
					currentDigit=0;
				break;
				case '1' :
					currentDigit=1;
				break;
				
				case '2' :
					currentDigit=2;
				break;
				
				case '3' :
					currentDigit=3;
				break;
				
				case '4' :
					currentDigit=4;
				break;
				
				case '5' :
					currentDigit=5;
				break;
				
				case '6' :
					currentDigit=6;
				break;
				
				case '7' :
					currentDigit=7;
				break;
				
				case '8' :
					currentDigit=8;
				break;
				
				case '9' :
					currentDigit=9;
				break;
					
				default:
				System.out.println("Not a valid String");
				break;
			}
			intValue=intValue*10 + currentDigit;
		}
		System.out.println(intValue);
	}
}
		
		

