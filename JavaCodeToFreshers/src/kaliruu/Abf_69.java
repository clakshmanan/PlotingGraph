// Program Serial 69:
// Program to find a common value between two array

package kaliruu;

public class Abf_69 
{
	public static void main(String [] args)
	{
		int [] firstArray = {12,14,15,16,105,17,124, 18,20};
		int [] secondArray = {98,111,18,124,105,147,16,108,200};

		for (int i = 0; i < firstArray.length ; i++ )
		{
			for(int j = 0; j < secondArray.length; j++)
			{
				if (firstArray[i] == secondArray[j])
				{
					System.out.println("The Common values are: " + firstArray[i]);
				}
			}
		}
	}
}

//end of program ---------------------------------------


