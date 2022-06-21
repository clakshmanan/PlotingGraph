

// Program serial 6(b):
//Finding circumference of circle = 2*pi*r

package yanai;
import java.util.Scanner;

public class Abc_h

{
	public static void main(String [] args) 
	{
		Scanner input = new Scanner(System.in);
		double pi = 3.14 ;
		System.out.println("Enter the radius to find area of circle:");
		double radius = input.nextDouble();
		double circumference = 2 * pi * radius ;
		System.out.println("The Circumference of Circle is: " + circumference);
	}

}
// end of program
