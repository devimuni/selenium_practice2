package arrayprograms;

import java.util.Arrays;

public class Arraysdeleteanelement {

	public static void main(String[] args) {
		
		
		int a[]= {10,20,30,40,50};
		
		int del_ele=30;
		
		
		System.out.println("Before deleting elelment:  "+ Arrays.toString(a));
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==del_ele)
			{
				for(int j= i;j<a.length-1;j++)
				{
					a[j]=a[j+1];
					
				}
				break;
			}
			
			
		}
		
		// here we need to print till index4 using for loop but we are using the below method for printing so result will show 50 two times
		System.out.println("after deleting elelment:  "+ Arrays.toString(a));
	}

}
