package numberprograms;

import org.testng.annotations.Test;

public class Numberreverse {
	
	//@Test (description = "using arthemetic operations")
	public void method1()
	
	{
		
		int num= 1234;
		int rev = 0;
		
		while(num>0)
		{
			
			rev= rev*10+num%10;
			num=num/10;
		}
		
		System.out.println("reverse of numeber 1234 is :" + rev);
		
	}
	
	//@Test(description= "using string buffer")
	public void method2()
	{
		
		int num = 1234;
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev = sb.reverse();
		
		System.out.println("reverse of the number 1234 is  : " + rev);
		
	}
	
	
	@Test (description = "using string builder")
	
	public void method3()
	{
		
		int num = 1234;
		StringBuilder sbl  = new StringBuilder(String.valueOf(num));
		StringBuilder rev = sbl.reverse();
		System.out.println("reverse of the number 1234 is  : " + rev);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
