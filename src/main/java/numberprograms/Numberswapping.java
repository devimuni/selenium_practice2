package numberprograms;

import org.testng.annotations.Test;

public class Numberswapping {
	
	
	//@Test(description = "using third varibale without arthemetic operator")
	public void method1()
	
	{
		int a=10;
		int b= 20;
		int temp=0;
		
		temp =a;
		a=b;
		b=temp;
		
		System.out.println(a);
		System.out.println(b);
	}
	
	//@Test (description = "without using third variable and using sum operation ")
	
	public void method2()
	{
		int a = 10;
		int b= 20;
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);	
	}
	
	//@ Test (description = "when a and b are non zero and using multiplication operation")
	public void method3()
	{
		int a= 10;
		int b= 20;
		
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println(a);
		System.out.println(b);	
		
	}
	
	//@Test (description = "using single statement")
	
	public void method4()
	
	{
		int a= 10;
		int b= 20;
		
		b=a+b-(a=b);
		System.out.println(a);
		System.out.println(b);	
	}
	
	@Test (description = "using boolean operator")
	
	public void method5()
	{
		int a= 10;
		int b= 20;
		
		a= a^b;
		b= a^b;
		a=a^b;
		System.out.println(a);
		System.out.println(b);	
	}
	

}
