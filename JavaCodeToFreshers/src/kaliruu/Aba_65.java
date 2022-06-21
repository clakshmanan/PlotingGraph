// Program Serial 65:
// Finding smallest number in an array:

package kaliruu;

public class Aba_65 
{
	public static void main(String [] args)
	{
		int [] bucket = {25,22,9,16,17,18,36,19,20};
		int smallestNumber = bucket[0];
		for (int i = 0; i < bucket.length; i++ )
		{
			if (bucket[i] < smallestNumber)
			{
				smallestNumber = bucket[i];
			}
		}
		System.out.println("The smallest Number is:" + smallestNumber);
	}
}

//end of program ---------------------------------------