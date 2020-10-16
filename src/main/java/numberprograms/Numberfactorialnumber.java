package numberprograms;

import org.testng.annotations.Test;

public class Numberfactorialnumber {
	
	
	
	/*public static void main(String[] args)
	{
		
		int num =5;
		int fact=1;
		
		for(int i=1;i<=num;i++)
			
		{
			fact= fact*i;
			
			
		}
		
		System.out.println(fact);
		
	}*/
	
	@Test
	public void method2()
	{
		
		int num =10;
		int fact =1;
		for(int i=num;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
	
	
	
}
