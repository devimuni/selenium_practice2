package arraybubblesort;

import java.util.Arrays;

public class IntegerarrayBubblesort {

	public static void main(String [] args)
	{

		int a[] = {30,20,40,10,50};
		System.out.println("before sorting order " + Arrays.toString(a));


		for(int i=0;i<a.length;i++)
		{
			int flag = 0;
			for(int j =0;j<a.length-1-i;j++)

			{
				if(a[j]>a[j+1])
				{

					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=1;
				}
			}


			if(flag==0)
			{
				break;

			}
		}
		System.out.println("after sorting order " + Arrays.toString(a));


	}






}
