// Program Serial 80:
// Program to sorting elements using bubble sort

package kalabam;
import java.util.Arrays;

public class Abd_80 {

	public static void main(String [] args)
	{
	
		int [] bubbleSort = { 3,4,1,8,6,2,7,9};
		int temp = 0;

		for (int i = 0; i < bubbleSort.length ;i++ )
		{
			for (int j = 1; j < bubbleSort.length ; j++ )
			{
				temp = bubbleSort[j-1];
				bubbleSort[j-1] = bubbleSort[j];
				bubbleSort[j] = temp;
			}
			System.out.println((i+1) + "th element swapped :" + Arrays.toString(bubbleSort));
		}
	}
}

