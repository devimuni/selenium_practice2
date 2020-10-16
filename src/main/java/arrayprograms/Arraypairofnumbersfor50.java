package arrayprograms;

import org.testng.annotations.Test;

public class Arraypairofnumbersfor50 
{
	@Test
	public void pairofnum()
	{
		int a[]= {10,20,30,40,50,60,70,80,90,100};
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i]+a[j]==50)
				{	System.out.print("sum of two pairs result is 50");
					System.out.println("(" + a[i] + "," + a[j] + ")");

				}
			}

		}

		for(int k=a.length-1;k>=0;k--)
		{
			for(int l=k-1;l>=0;l--)
			{
				if(a[k]-a[l]==50)
				{
					System.out.print("diff of two pairs result is 50");
					System.out.println("(" + a[k] + "," + a[l] + ")");

				}
				
			}
			
		}


	}







}
