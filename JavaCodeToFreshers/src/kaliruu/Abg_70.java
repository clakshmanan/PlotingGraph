// Program Serial 70:
// Program to find common element between two arrays:

package kaliruu;

public class Abg_70 
{
	public static void main(String [] args)
	{
		String [] firstArray = {"red", "yellow", "vilot", "green", "blue","orange"};
		String [] secondArray = {"amber", "green", "mejantha", "brown", "blue","white"};
		for (int i = 0; i < firstArray.length ; i++ )
		{
			for (int j=0; j < secondArray.length ; j++ )
			{
				if (firstArray[i]  == secondArray[j])
				{
					System.out.println("The common element is:" + firstArray[i]);
					
				}
			}
		}
	}
}

// end of program ---------------------------------------
