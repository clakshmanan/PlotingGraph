// Program Serial 79:
// Program to find common elements between two arrays

package kalabam;

public class Abc_79 
{
	public static void main(String [] args)
	{
		int [] m = {1,2,3,4,5,77,21,15,8,10};
		int [] n = {1,2,3,4,5,88,7,19,15,8,10};
		for (int i = 0; i < m.length; i++ ) 
		{
			for (int j = 0; j < n.length; j++)
			{
				if (m[i] == n[j]) 
				{
					System.out.println(" " + m[i]);
				}
			}
		}
	}
}
