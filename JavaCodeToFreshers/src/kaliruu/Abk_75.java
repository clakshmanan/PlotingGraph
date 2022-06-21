// Program Serial 75:
// Program to remove duplicate from sorted array:

package kaliruu;

public class Abk_75 
{
	public static void main(String [] args)
	{
		int [] array = {2,3,4,5,4,6,7,7,8,9};
		for (int i = 0; i< array.length ; ++i )
		{
			System.out.print(array[i] + " ");
		}
		System.out.println();
		int k = 0;
		for (int j = 0; j<array.length-1 ; ++ j )
		{
			if (array[j]!=array[j+1])
			{
				array[k] = array[j];
				++k;
			}
		}
		array[k] = array[array.length-1];
		System.out.println("Removing duplicates from array");
		for (int i =0 ; i<k+1 ; ++i )
		{
			System.out.print(array[i] + " ");
		}
	}
}