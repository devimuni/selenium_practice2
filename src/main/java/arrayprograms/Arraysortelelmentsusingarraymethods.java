package arrayprograms;

import java.util.Arrays;
import java.util.Collections;

import org.testng.annotations.Test;

public class Arraysortelelmentsusingarraymethods {
	
	public static void main(String[] args)
	{
		int a[] = {30,20,40,10,50};
		System.out.println("before sorting order " + Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println("after sorting order" + Arrays.toString(a));
			
		
	}
	
	//@Test(description = "using Arrays.sort")
	public void method2()
	{
		int a[] = {60,20,40,10,50};
		System.out.println("before sorting order " + Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("after sorting order " + Arrays.toString(a));
		
	}
	
	
	@Test(description = "reverseorder")
	public void method3()
	{
		Integer a[] = {60,20,80,10,50};
		System.out.println("before sorting order " + Arrays.toString(a));
		Arrays.sort(a, Collections.reverseOrder());
		System.out.println("after sorting order " + Arrays.toString(a));
	
	}

}
