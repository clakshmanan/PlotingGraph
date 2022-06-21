
// Program serial 5(a):
// Finding Area of rectangle : Area  = length * breadth 
package yanai;
import java.util.Scanner;

public class Abc_e 

{
	public static void main(String [] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your length:");
		double length  = input.nextDouble(); 
		System.out.println("Enter your breadth:");
		double breadth = input.nextDouble();
		Double Area = length * breadth ;
		System.out.println("The Area of Rectangle is:" + Area);
				
	}

}
// end of program
