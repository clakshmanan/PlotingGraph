
// Program serial 66:
// Program to find second largest number in an array:

package kaliruu;

public class Abc_66 
{
	public static void main(String [] args)
	{
		int [] b = {33,77,66,99,55,44,86,24,11};
		int firstLarge = 0;
		int secondLarge = 0;
		for (int i =1; i<b.length ; i++ )
		{
			if (b[i] > firstLarge)
			{
				secondLarge = firstLarge;
				firstLarge = b[i];
			}
			else if (b[i] > secondLarge)
			{
				secondLarge = b[i];
			}
		}
		System.out.println("The Second Largest of array is:" + secondLarge);
	}
}

//end of program ---------------------------------------