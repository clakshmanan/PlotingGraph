package kaliruu;

public class Abl_76 
{
	public static void main(String [] args)
	{
		String [] studentNames = {"Ramu", "Somu", "Cheenu", "gopu", "karthik"};
		String [] subjects = {"Tamil", "English","Maths","Science","Geography"};
		double[] studentMark = {80,90,75,65,70};
		int i = studentNames.length;
		for (i = 0; i < studentMark.length; i++ )
		{
			
			System.out.println( studentNames[i] + " mark in :" + subjects[i] + "  is : " + studentMark[i] );
		}
	}
}
