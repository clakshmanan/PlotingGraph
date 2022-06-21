
// Program serial 5(b):
// Finding circumference of rectangle : Circumference = 2 * (length + breadth) 

package yanai;
import java.util.Scanner;

public class Abc_f

{
	public static void main(String [] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your length:");
		double length  = input.nextDouble(); 
		System.out.println("Enter your breadth:");
		double breadth = input.nextDouble();
		Double Area = 2 * (length + breadth) ;
		System.out.println("The circumference of Rectangle is:" + Area);
				
	}

}
// end of program
