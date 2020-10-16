package arrayprograms;

import java.util.Arrays;

public class Arraysortingusingbublesort 
{
	
	public static void main(String [] args)
	{
		
		int a[] = {30,20,40,10,50};
		System.out.println("before sorting order " + Arrays.toString(a));
		
		for(int i=0;i<a.length-1;i++)
		{
			
			for(int j =0;j<a.length-1;j++)
				
			{
				if(a[j]>a[j+1])
				{
					
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
							
					
				}
				
				
			}
			
		}
		
		System.out.println("after sorting order " + Arrays.toString(a));
		
		
	}
	
	

}
