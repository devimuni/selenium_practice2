package arrayprograms;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Arrayinsertelement {
	
	//insert using element position
	@Test(priority=1)
	public void eleposition()
	{

		int a[] = {10,20,30,40,50};
		System.out.println("Before inserting new elelment  "+ Arrays.toString(a));
		int elepos = 3;
		int insert =100;

		for(int i=a.length-1;i>elepos-1;i--)
		{
			a[i]=a[i-1];

		}
		a[elepos-1]=insert;

		System.out.println("After inserting new elelment  "+ Arrays.toString(a));


	}
	
	//insert using element index
	@Test(priority=2)
	public void eleindex()
	{

		int a[] = {10,20,30,40,50};
		System.out.println("Before inserting new elelment in index position  "+ Arrays.toString(a));
		int eleindex = 2;
		int insert =100;

		for(int i=a.length-1;i>eleindex;i--)
		{
			a[i]=a[i-1];

		}
		a[eleindex]=insert;

		System.out.println("After inserting new elelment in index position  "+ Arrays.toString(a));


	}
	
	
	
	
	
	
	


}
