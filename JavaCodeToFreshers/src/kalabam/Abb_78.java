// Program Serial 78:
// Program to generate prime numbers from 1 to 1000

package kalabam;

public class Abb_78 
{
	public static void main(String [] args)
	{
		int target = 1000;
		int number = 2;
		while (number <=target)
		{
			int i = 2;
			while(i<=number/2)
			{
				if (number % i == 0)
				{
					break;
				}
				i++;
			}
			if (i== (number / 2+1))
			{
				System.out.println("The prime serials are:" + number);
			}
			number ++;
		}
	}
}
