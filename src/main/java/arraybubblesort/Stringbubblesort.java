package arraybubblesort;

import java.util.Arrays;

public class Stringbubblesort {
	
	public static void main(String [] args)
	{

		//String a[] = {"naresh","muni","laasya","roshi"};
		
		String a[] = {"11 November 2018 ","3 November 2018","29 October 2018","26 October 2018"};

		System.out.println("before sorting order " + Arrays.toString(a));


		for(int i=0;i<a.length;i++)
		{
			int flag = 0;
			for(int j =0;j<a.length-1-i;j++)

			{
				if(a[j].compareTo(a[j+1])>0)
				{

					String temp = a[j];
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
