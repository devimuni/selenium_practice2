package arraybubblesort;

import java.util.Arrays;

public class Arraytomethodaspaarameter {
	
	//get array from callingarraymethodfunction class and pass to this method as parameter
	public void SortIntarray(int a[])
	{
		
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
	
	public void SortStringarray(String b[])
	{
		
		System.out.println("before sorting order " + Arrays.toString(b));

		for(int i=0;i<b.length;i++)
		{
			int flag = 0;
			for(int j =0;j<b.length-1-i;j++)

			{
				if(b[j].compareTo(b[j+1])>0)
				{

					String temp = b[j];
					b[j]=b[j+1];
					b[j+1]=temp;
					flag=1;
				}
			}


			if(flag==0)
			{
				break;

			}
		}
		System.out.println("after sorting order " + Arrays.toString(b));
	}
	
	public void Sortchararray(char c[])
	{
		
		System.out.println("before sorting order " + Arrays.toString(c));

		for(int i=0;i<c.length;i++)
		{
			int flag = 0;
			for(int j =0;j<c.length-1-i;j++)

			{
				if(c[j]>c[j+1])
				{

					char temp = c[j];
					c[j]=c[j+1];
					c[j+1]=temp;
					flag=1;
				}
			}


			if(flag==0)
			{
				break;

			}
		}
		System.out.println("after sorting order " + Arrays.toString(c));
	}
	
	
	//return this array to array declared in callingarraymethodfunction class
	
	//return int array
	public int[] returnIntarray()
	{
		int a[] = {10,40,30,50,20};
		return a;
		
	}
	
	
	//return string array
	
	public String[] returnStringarray()
	{
		String[] b = {"naresh","muni","laasya","roshi"};
		return b;
		
	}
	
	public char[] returnCharArray()
	{
		
		char[] c = {'n','m','l','r'};
		return c;
		
	}
	
	
	
	

}
