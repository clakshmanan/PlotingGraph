// Program Serial 85:
// Program to multiplication of  matrices:

package kalabam;
import java.util.Scanner;
public class Abi_86 {

	public static void main (String [] args)
	{
		int [] [] firstMatrix = new int [3] [3];
		int [] [] secondMatrix = new int [3] [3];
		int [] [] adding  = new int [3] [3];

		Scanner input = new Scanner(System.in);
		System.out.println("Enter value of 3 by 3 matrix");
	
		for (int i = 0; i < 3 ; i++ )
		{
			for (int j = 0; j < 3 ; j++ )
			{
				firstMatrix[i][j] = input.nextInt();
			}
		}

		System.out.println("Enter value of 3 matrix");
		for (int i = 0; i<3 ;i++ )
		{
			for (int j = 0; j<3 ; j++ )
			{
			secondMatrix[i][j] = input.nextInt();
			}
		}
		// Subtraction:
		for (int i=0; i< 3 ;i++ )
		{
			for (int j = 0; j < 3; j++)
			{
				adding[i][j] = firstMatrix[i][j] * secondMatrix[i][j]; 
			}
		}
		System.out.println("Subtraction of matrix");
		for (int i = 0; i < 3; i ++ )
		{
			for (int j = 0; j < 3 ; j++ )
		{
				System.out.print(adding[i][j] +  "  ");
		}
		System.out.println();
		}
	}
}
