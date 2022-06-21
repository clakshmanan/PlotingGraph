
// Program serial 6(a):
//Finding Area of circle = pi * r * r

package yanai;
import java.util.Scanner;

public class Abc_g

{
	public static void main(String [] args) 
	{
		Scanner input = new Scanner(System.in);
		double pi = 3.14 ;
		System.out.println("Enter the radius to find area of circle:");
		double radius = input.nextDouble();
		double AreaOfCircle = pi * radius * radius ;
		System.out.println("The Area of Circle is: " + AreaOfCircle);
	}

}
// end of program
