package testNG;

import org.testng.annotations.Test;

public class GroupingTestNg1 {
	
	
	@Test(groups ="Smoke testing" )
	public void test1()
	{
		System.out.println("Smoke testing passed");
		
		
	}
	
	@Test(groups = "Sanity testing" )
	public void test2()
	{
		System.out.println("Sanity testing passed");
			
	}
	@Test(groups ="System testing" )
	public void test3()
	{
		System.out.println("System testing passed");
		
		
	}
	
	@Test(groups="functional")
	public void test4()
	{
		System.out.println("functional testing passed");
		
		
	}
	
	@Test(groups="Regression")
	public void test5()
	{
		System.out.println("Regression testing passed");
		
		
	}
	
	
	
	
	

}
