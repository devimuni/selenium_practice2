package arrayprograms;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Arraykthlargestnumberorsortestnumber {


	//kth largest number
	@Test
	public void kthlarge()
	{
		int a[]= {10,20,30,70,40,60,50};

		int kth=4;
		for(int i= 0 ; i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp =a[i];
					a[i]=a[j];
					a[j] =temp;

				}

			}

			if(i==kth-1)
			{

				System.out.println(kth+ "largest number is  " + a[i]);

			}
		}

		System.out.println("After sorting   " + Arrays.toString(a));

	}

	//kth small number
	@Test
	public void kthsmall()
	{
		int a[]= {10,20,30,70,40,60,50};

		int kth=4;
		for(int i= 0 ; i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp =a[i];
					a[i]=a[j];
					a[j] =temp;

				}

			}

			if(i==kth-1)
			{

				System.out.println(kth+ "small number is  " + a[i]);

			}
		}

		System.out.println("After sorting   " + Arrays.toString(a));

	}





}
