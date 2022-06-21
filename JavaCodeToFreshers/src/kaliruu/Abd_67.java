// Program Serial 67:
// Program to find second smallest number in an array:

package kaliruu;

public class Abd_67 
{
	public static void main(String [] args)
	{
		int [] arr = {34, 22, 45, 76,28, 14, 54};
		if (arr[0] < arr[1])
		{
			int temp = arr[0];
			arr[0]=arr[1];
			arr[1]=temp;
		}
		int first = arr[0];
		int second = arr[0];
			
		for (int i = 0; i < arr.length ; i++)
		{
			if (first>arr[i])
			{
				second = first;
				first = arr[i];
			}
			else if (second>arr[i])
			{
				second = arr[i];
			}
		}
		System.out.println("The Second Smallest Array is: " + second);
	}
}

//end of program ---------------------------------------