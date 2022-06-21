// Program Serial 73:
// Program to find duplicate number in an array

package kaliruu;

public class Abj_73 
{
	public static void main(String [] args)
	{
		int [] m = { 12,14,15,44,32,14,65,45,32 };
		for (int i = 0; i < m.length-1 ;i++ )
		{
			for (int j = i+1; j<m.length; j++ )
			{
				if (m[i] == m[j])
				{
					System.out.println("The duplicate elements are:" + m[j]);
				}
			}
		}
	}
}