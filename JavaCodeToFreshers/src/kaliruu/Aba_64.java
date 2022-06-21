// Program Serial 64:
// Finding largest number in an array:

package kaliruu;

public class Aba_64
{
	public static void main(String  [] args ) 
	{
		int [] bucket = {25,67,22,15,16,88,17,18,36,19,20};
		int largestNumber = bucket[0];
		for (int i = 0; i < bucket.length; i++ )
		{
			if (bucket[i] > largestNumber)
			{
				largestNumber = bucket[i];
			}
		}
		System.out.println("The Largest Number is:" + largestNumber);
	}
}		
	
//end of program ---------------------------------------		


