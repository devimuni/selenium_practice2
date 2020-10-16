package arrayprograms;

import org.testng.annotations.Test;

public class Arrayfindmaxandmin {

	/*public static void main(String[] arg)
	{


		int a[] = {50,20,30,40,60};
		int max = a[0];

		for(int i=1;i < a.length;i++)

		{
			if(a[i]>max)
			{
				max =a[i];
			}

		}

		System.out.println(max);

	}*/

	@Test(description ="findminmumvalue")
	public void min()
	{
		int a1[] = {50,40,30,60,10};
		
		int min = a1[0];
		
		for(int i=1;i<a1.length;i++)
			
		{
			if(a1[i]<min)
			{
				
				min =a1[i];
			}
			
		}
		System.out.println("minimum value is " + min);
	}



}
