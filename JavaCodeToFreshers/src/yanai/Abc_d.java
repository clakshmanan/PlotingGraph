
// Program serial 4(a):
// Finding area square: Area = side * side
package yanai;
import java.util.Scanner;

public class Abc_d 
{
	public static void main(String [] args) 
	
	{
		// Area of square is = side * side
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the side of Area:");
		double sideA = input.nextDouble();
		double AreaOfSquare = sideA * sideA;
		System.out.println("The AreaOfsquare is: " + AreaOfSquare);
		
		// Program serial 4(b):
		// circumference  of square is = 4 * Area  
		System.out.println("Enter the Area to find Circumference:");
		double Area = input.nextDouble();
		double circumference = 4 * Area;
		System.out.println("The circumference of square is: " + circumference);
	}

}

//end of program