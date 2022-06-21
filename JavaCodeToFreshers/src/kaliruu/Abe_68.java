// Program Serial 68:
// Program to sorting elements in ascending order:

package kaliruu;

public class Abe_68 
{
	public static void main(String [] args)
	{
		int [] a = {55,22,88,44,66,33,11,77,99};
		int i, j, temp=0;
		for (i=0; i<a.length ;i++ )
		{
			for (j=i+1;j<a.length ;j++ )
			{
				if (a[i] > a[j])
				{
					temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				}
			}
		}
		System.out.println("The Ascending Order is:");
		for (i=0;i<a.length ;i++)
		{	
			System.out.println(a[i]);
		}
	}	
}
