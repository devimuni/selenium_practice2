package arrayprograms;

import java.util.Arrays;


public class ArraysMerge2arrays {
	
	
	public static void main(String[] args)
	{
		int a[]= {10,20,30,40};
		int b[] = {70,60,50};
		
		int a_len=a.length;
		int b_len = b.length;
		int c_len=a_len+b_len;
		int c[]= new int[c_len];
		for(int i=0;i<a_len;i++)
		{
			c[i]=a[i];
			
		}
		for(int i= 0;i<b_len;i++)
		{
			c[a_len+i]=b[i];
		}
		
		for(int i=0;i<c_len;i++)
		{
			//print c wihtout sorting
			System.out.print(c[i] + " ");
			
		}
		System.out.println();
		
		//sort array and print converting to string
		
		
		Arrays.sort(c);
		//Arrays.parallelSort(c); we can use this also for sorting
		//Arrays.sort(c,Collections.reverseOrder()); for this method C[] should be integer not int
		System.out.println(Arrays.toString(c));
		
	}
	
	
	
	
	
	
	
	

}
